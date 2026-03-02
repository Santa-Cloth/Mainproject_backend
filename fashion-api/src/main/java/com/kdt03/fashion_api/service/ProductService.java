package com.kdt03.fashion_api.service;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.kdt03.fashion_api.domain.dto.ProductDTO;
import com.kdt03.fashion_api.domain.dto.ProductMapColumnDTO;
import com.kdt03.fashion_api.domain.dto.ProductMapDTO;
import com.kdt03.fashion_api.domain.dto.StyleCountDTO;
import com.kdt03.fashion_api.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductRepository productRepo;
    private final com.kdt03.fashion_api.repository.NaverProductRepository naverProductRepo;

    @Cacheable(value = "products")
    public List<ProductDTO> findAllProducts(String categoryName) {
        log.info("[SERVICE CALL] findAllProducts for category: {}", categoryName);
        java.time.LocalDate oneYearAgo = java.time.LocalDate.now().minusYears(1);
        return productRepo.findAllProducts(categoryName, oneYearAgo);
    }

    @Cacheable(value = "products")
    public ProductDTO getProductById(String productId) {
        log.info("[SERVICE CALL] getProductById for productId: {}", productId);
        return productRepo.findProductById(productId)
                .orElseThrow(() -> new RuntimeException("상품을 찾을 수 없습니다."));
    }

    @Cacheable(value = "products")
    public ProductMapColumnDTO getProductMapData512() {
        log.info("[SERVICE CALL] getProductMapData512");
        List<ProductMapDTO> list = productRepo.findAllProductMaps512();

        return ProductMapColumnDTO.builder()
                .productIds(list.stream().map(ProductMapDTO::getProductId).toList())
                .productNames(list.stream().map(ProductMapDTO::getProductName).toList())
                .styles(list.stream().map(ProductMapDTO::getStyle).toList())
                .xCoords(list.stream().map(ProductMapDTO::getXCoord).toList())
                .yCoords(list.stream().map(ProductMapDTO::getYCoord).toList())
                .zCoords(list.stream().map(ProductMapDTO::getZCoord).toList())
                .build();
    }

    @Cacheable(value = "products")
    public ProductMapColumnDTO getProductMapData768() {
        log.info("[SERVICE CALL] getProductMapData768");
        List<ProductMapDTO> list = productRepo.findAllProductMaps768();

        return ProductMapColumnDTO.builder()
                .productIds(list.stream().map(ProductMapDTO::getProductId).toList())
                .productNames(list.stream().map(ProductMapDTO::getProductName).toList())
                .styles(list.stream().map(ProductMapDTO::getStyle).toList())
                .xCoords(list.stream().map(ProductMapDTO::getXCoord).toList())
                .yCoords(list.stream().map(ProductMapDTO::getYCoord).toList())
                .zCoords(list.stream().map(ProductMapDTO::getZCoord).toList())
                .build();
    }

    @Cacheable(value = "products")
    public List<StyleCountDTO> countProductsByStyle512() {
        log.info("[SERVICE CALL] countProductsByStyle512");
        return productRepo.countProductsByStyle512().stream()
                .map(m -> new StyleCountDTO(
                        (String) m.get("styleName"),
                        ((Number) m.get("count")).longValue()))
                .toList();
    }

    @Cacheable(value = "products")
    public List<StyleCountDTO> countProductsByStyle768() {
        log.info("[SERVICE CALL] countProductsByStyle768");
        return productRepo.countProductsByStyle768().stream()
                .map(m -> new StyleCountDTO(
                        (String) m.get("styleName"),
                        ((Number) m.get("count")).longValue()))
                .toList();
    }

    public long getInternalProductCount() {
        return productRepo.count();
    }

    public long getNaverProductCount() {
        return naverProductRepo.count();
    }
}
