package com.kdt03.fashion_api.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.kdt03.fashion_api.domain.dto.NaverProductDTO;
import com.kdt03.fashion_api.repository.NaverProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class NaverProductService {

    private final NaverProductRepository naverProductRepo;

    @Cacheable(value = "naverProducts")
    public List<NaverProductDTO> getAllNaverProducts() {
        log.info("[SERVICE CALL] getAllNaverProducts");
        return naverProductRepo.findAll().stream()
                .map(NaverProductDTO::fromEntity)
                .collect(Collectors.toList());
    }
}
