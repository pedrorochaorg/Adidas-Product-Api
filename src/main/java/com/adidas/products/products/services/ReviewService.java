package com.adidas.products.products.services;

import com.adidas.products.products.models.Review;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Review Service used as a bridge between the restController and the reviews service.
 *
 * @author pedrorocha
 **/
public interface ReviewService {

    /**
     * Returns a single review which id value match the value of the arg id.
     *
     * @param id review unique identifier
     * @return a Mono reactive object with a Review entity object.
     */
    Mono<Review> findById(String id, String productId);

    /**
     * Fallback method used by the findById circuit breaker.
     *
     * @param id review unique identifier
     * @return a Mono empty object.
     */
    Mono<Review> findByIdFallback(String id, String productId);


    /**
     * Returns all reviews stored in the reviews service.
     *
     * @return a Flux reactive object with a set of Review objects.
     */
    Flux<Review> findAll();


    /**
     * Fallback method used by the findAll circuit breaker.
     *
     * @return a Flux empty object.
     */
    Flux<Review> findAllFallback();

    /**
     * Returns a set of reviews related with the same productId.
     *
     * @param productId product unique identifier
     * @return a Flux reactive object with a set of Review objects.
     */
    Flux<Review> findByProductId(String productId);

    /**
     * Fallback method used by the findByProductId circuit breaker.
     *
     * @param productId product unique identifier
     * @return a Flux empty object.
     */
    Flux<Review> findByProductIdFallback(String productId);

    /**
     * Returns a single review which id and productId values match the values of the args id and productId,
     * respectively.
     *
     * @param productId product unique identifier
     * @param id        review unique identifier
     * @return a Mono reactive object with a Review entity object.
     */
    Mono<Review> findByIdAndProductId(String productId, String id);

    /**
     * Fallback method used by the findByIdAndProductId circuit breaker.
     *
     * @param productId product unique identifier
     * @param id        review unique identifier
     * @return a Mono empty object.
     */
    Mono<Review> findByIdAndProductIdFallback(String productId, String id);

    /**
     * Creates a new review in the review service.
     *
     * @param review review object
     * @return a Mono reactive object with a Review entity object.
     */
    Mono<Review> create(Review review);

    /**
     * Fallback method used by the create circuit breaker.
     *
     * @param review review object
     * @return a Mono error object.
     */
    Mono<Review> createFallback(Review review);

    /**
     * Updates a existing review in the review service.
     *
     * @param review review object
     * @return a Mono reactive object with a Review entity object.
     */
    Mono<Review> update(Review review);

    /**
     * Fallback method used by the update circuit breaker.
     *
     * @param review review object
     * @return a Mono error object.
     */
    Mono<Review> updateFallback(Review review);

    /**
     * Deletes an entry from  review service.
     *
     * @param review review object
     * @return a Mono reactive object with a Review entity object.
     */
    Mono<Void> delete(Review review);

    /**
     * Fallback method used by the delete circuit breaker.
     *
     * @param review review object
     * @return a Mono error object.
     */
    Mono<Void> deleteFallback(Review review);

}
