package com.kdt03.fashion_api.config;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.benmanes.caffeine.cache.Caffeine;

import lombok.extern.slf4j.Slf4j;

@Configuration
@EnableCaching
@Slf4j
public class CacheConfig {

    @Bean
    public CacheManager cacheManager() {
        log.info("Initializing Caffeine CacheManager with Logging...");
        @SuppressWarnings("null")
        CaffeineCacheManager cacheManager = new CaffeineCacheManager() {
            @Override
            protected Cache adaptCaffeineCache(String name,
                    com.github.benmanes.caffeine.cache.Cache<Object, Object> cache) {
                return new LoggingCache(name, super.adaptCaffeineCache(name, cache));
            }
        };

        cacheManager.setCaffeine(Caffeine.newBuilder()
                .expireAfterWrite(10, TimeUnit.MINUTES)
                .maximumSize(100));
        cacheManager.setCacheNames(Arrays.asList("recommendations", "recommendations768", "analysisResults"));
        return cacheManager;
    }

    private static class LoggingCache implements Cache {
        private final String name;
        private final Cache delegate;
        private static final Logger logger = LoggerFactory.getLogger(LoggingCache.class);

        public LoggingCache(String name, Cache delegate) {
            this.name = name;
            this.delegate = delegate;
        }

        @Override
        public String getName() {
            return delegate.getName();
        }

        @Override
        public Object getNativeCache() {
            return delegate.getNativeCache();
        }

        @Override
        public ValueWrapper get(Object key) {
            ValueWrapper wrapper = delegate.get(key);
            if (wrapper != null) {
                logger.info("[Cache HIT] cache: '{}', key: '{}'", name, key);
            } else {
                logger.info("[Cache MISS] cache: '{}', key: '{}'", name, key);
            }
            return wrapper;
        }

        @Override
        public <T> T get(Object key, java.util.concurrent.Callable<T> valueLoader) {
            return delegate.get(key, valueLoader);
        }

        @Override
        public <T> T get(Object key, Class<T> type) {
            return delegate.get(key, type);
        }

        @Override
        public void put(Object key, Object value) {
            logger.info("[Cache PUT] cache: '{}', key: '{}'", name, key);
            delegate.put(key, value);
        }

        @Override
        public void evict(Object key) {
            delegate.evict(key);
        }

        @Override
        public void clear() {
            delegate.clear();
        }
    }
}
