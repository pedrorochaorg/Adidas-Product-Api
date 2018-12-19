package com.adidas.products.products.services;

import com.adidas.products.products.models.ProductScore;
import reactor.core.publisher.Mono;

/**
 * Product Score Service used as a bridge between the restController and the external product api.
 *
 * @author pedrorocha
 **/
public interface ProductScoreService {

    /**
     * Returns a single product score which id value match the value of the arg id.
     *
     * @param id review unique identifier
     * @return a Mono reactive object with a Review entity object.
     */
    Mono<ProductScore> findById(String id);


}
