package com.adidas.products.products.services.impl;

import com.adidas.products.products.common.messages.Rest;
import com.adidas.products.products.config.ExternalServicesConfig;
import com.adidas.products.products.config.models.ServiceConfig;
import com.adidas.products.products.exceptions.ServiceUnavailableException;
import com.adidas.products.products.models.Review;
import com.adidas.products.products.services.ReviewService;
import com.google.common.net.HttpHeaders;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Implements the review service methods based on its interface.
 *
 * @author pedrorocha
 **/
@Service
public class ReviewServiceImpl implements ReviewService {

    private final WebClient webClient;
    private final ServiceConfig config;

    /**
     * Instantiate a new Review Service.
     *
     * @param config external services configuration properties
     */
    public ReviewServiceImpl(ExternalServicesConfig config) {
        this.config = config.getService("reviews");
        this.webClient = WebClient.builder()
                .baseUrl(this.config.getUrl())
                .defaultHeader("Authorization","APIKEY " + this.config.getAuth().getToken())
                .defaultHeader(HttpHeaders.CONTENT_TYPE, Rest.CONTENT_FORMAT)
                .build();
    }

    @Override
    @HystrixCommand(fallbackMethod = "empty")
    public Mono<Review> findById(String id, String productId) {
        return webClient.get()
                .uri("/review/" + productId + "/" + id)
                .retrieve()
                .bodyToMono(Review.class);
    }

    @Override
    @HystrixCommand(fallbackMethod = "emptyList")
    public Flux<Review> findAll() {
        return webClient.get()
                .uri("/review")
                .retrieve()
                .bodyToFlux(Review.class);
    }

    @Override
    @HystrixCommand(fallbackMethod = "emptyList")
    public Flux<Review> findByProductId(String productId) {
        return webClient.get()
                .uri("/review?productId=" + productId)
                .retrieve()
                .bodyToFlux(Review.class);
    }

    @Override
    @HystrixCommand(fallbackMethod = "empty")
    public Mono<Review> findByIdAndProductId(String productId, String id) {
        return webClient.get()
                .uri("/review/" + productId + "/" + id)
                .retrieve()
                .bodyToMono(Review.class);
    }

    @Override
    @HystrixCommand(fallbackMethod = "empty")
    public Mono<Review> update(Review review) {
        return webClient.put()
                .uri("/review/" + review.getProductId() + "/" + review.getId())
                .body(BodyInserters.fromObject(review))
                .exchange()
                .flatMap(updatedReview -> updatedReview.bodyToMono(Review.class));
    }

    @Override
    @HystrixCommand(fallbackMethod = "empty")
    public Mono<Review> create(Review review) {
        return webClient.post()
                .uri("/review/" + review.getProductId())
                .body(BodyInserters.fromObject(review))
                .exchange()
                .flatMap(updatedReview -> updatedReview.bodyToMono(Review.class));
    }

    @Override
    @HystrixCommand(fallbackMethod = "emptyDelete")
    public Mono<Void> delete(Review review) {
        return webClient.delete()
                .uri("/review/" + review.getProductId() + "/" + review.getId())
                .retrieve()
                .bodyToMono(Void.class);
    }


    public Mono<Review> empty() {
        return Mono.error(new ServiceUnavailableException());
    }

    public Mono<Void> emptyDelete() {
        return Mono.error(new ServiceUnavailableException());
    }

    public Flux<Review> emptyList() {
        return Flux.error(new ServiceUnavailableException());
    }
}
