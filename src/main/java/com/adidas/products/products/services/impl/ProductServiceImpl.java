package com.adidas.products.products.services.impl;

import com.adidas.products.products.common.messages.Rest;
import com.adidas.products.products.config.ExternalServicesConfig;
import com.adidas.products.products.config.models.ServiceConfig;
import com.adidas.products.products.models.Product;
import com.adidas.products.products.models.ProductScore;
import com.adidas.products.products.services.ProductScoreService;
import com.adidas.products.products.services.ProductService;
import com.google.common.net.HttpHeaders;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * Implements the product score service methods based on its interface.
 *
 * @author pedrorocha
 **/
@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final WebClient webClient;
    private final ServiceConfig config;
    private final ProductScoreService scoreService;

    /**
     * Instantiate a new Product Service.
     *
     * @param config external services configuration properties
     */
    public ProductServiceImpl(ExternalServicesConfig config, ProductScoreService scoreService) {
        this.config = config.getService("adidas");
        this.scoreService = scoreService;
        this.webClient = WebClient.builder()
                .baseUrl(this.config.getUrl())
                .defaultHeader(HttpHeaders.CONTENT_TYPE, Rest.CONTENT_FORMAT)
                .build();
    }

    @Override
    public Mono<Product> findById(String id) {
        log.debug("FindById: {}",id);
        return webClient.get()
                .uri("/products/" + id)
                .retrieve()
                .bodyToMono(Product.class)
                .doOnSuccessOrError(((product, throwable) -> {
                    if (throwable != null) {
                        log.debug("Throwable: {}", throwable.getMessage());
                    }
                }))
                .flatMap(product -> {

                    log.debug("FindScore: {}", id);
                    return this.scoreService.findById(id)
                            .map(score -> {
                                log.debug("FindScore: {}, ", score);

                                product.setReviewScore(score);
                                return product;
                            });
                });
    }
}
