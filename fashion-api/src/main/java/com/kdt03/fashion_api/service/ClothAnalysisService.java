package com.kdt03.fashion_api.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class ClothAnalysisService {

    private final WebClient webClient;

    public ClothAnalysisService(WebClient.Builder webClientBuilder,
            @Value("${app.fastapi.url}") String fastApiUrl) {
        // FastAPI 서버 주소를 설정파일에서 주입받습니다.
        this.webClient = webClientBuilder.baseUrl(fastApiUrl).build();
    }

    public Mono<String> getFastApiHello() {
        return this.webClient.get()
                .uri("/")
                .retrieve()
                .bodyToMono(String.class);
    }
}