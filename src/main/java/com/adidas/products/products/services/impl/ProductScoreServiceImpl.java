package com.adidas.products.products.services.impl;

import com.adidas.products.products.common.messages.Rest;
import com.adidas.products.products.config.ExternalServicesConfig;
import com.adidas.products.products.config.models.ServiceConfig;
import com.adidas.products.products.exceptions.ServiceUnavailableException;
import com.adidas.products.products.models.ProductScore;
import com.adidas.products.products.models.Review;
import com.adidas.products.products.services.ProductScoreService;
import com.google.common.net.HttpHeaders;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
public class ProductScoreServiceImpl implements ProductScoreService {

    private final WebClient webClient;
    private final ServiceConfig config;

    /**
     * Instantiate a new Product Score Service.
     *
     * @param config external services configuration properties
     */
    public ProductScoreServiceImpl(ExternalServicesConfig config) {
        this.config = config.getService("reviews");
        this.webClient = WebClient.builder()
                .baseUrl(this.config.getUrl())
                .defaultHeader("Authorization", "APIKEY " + this.config.getAuth().getToken())
                .defaultHeader(HttpHeaders.CONTENT_TYPE, Rest.CONTENT_FORMAT)
                .build();
    }


    @Override
    @HystrixCommand(fallbackMethod = "findByIdFallback")
    public Mono<ProductScore> findById(String id) {
        return webClient.get()
                .uri("/review/" + id)
                .retrieve()
                .bodyToMono(ProductScore.class);
    }


    public Mono<ProductScore> findByIdFallback(String id) {
        log.debug("Get Empty Score");
        return Mono.just(
                ProductScore.builder()
                        .averageReviewScore(0.0)
                        .numberOfReviews((long)0)
                        .build()
        );
    }

}
