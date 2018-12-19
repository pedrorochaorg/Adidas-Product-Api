package com.adidas.products.products.controllers;

import com.adidas.products.products.common.messages.Rest;
import com.adidas.products.products.models.ErrorResponse;
import com.adidas.products.products.models.Product;
import com.adidas.products.products.models.ProductScore;
import com.adidas.products.products.models.Review;
import com.adidas.products.products.services.ProductScoreService;
import com.adidas.products.products.services.ProductService;
import com.adidas.products.products.services.ReviewService;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Products Service Rest Controller
 *
 * @author pedrorocha
 **/
@RestController
@Slf4j
public class ProductsController implements IProductsController {

    private final ProductService productService;

    /**
     * Instantiates a new ProductsController, implementing all interaface methods.
     *
     * @param productService       instance to the product service
     */
    public ProductsController(
            ProductService productService
    ) {
        this.productService = productService;
    }

    @Override
    @RequestMapping(path = "/product/{product_id}", method = RequestMethod.GET, produces = Rest.CONTENT_FORMAT)
    public Mono<ResponseEntity<Product>> getProduct(@PathVariable(name = "product_id") final String productId) {
        log.info("getScore , productId: {}", productId);
        return productService.findById(productId)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(
                        ResponseEntity.notFound().build()
                );
    }


    @ExceptionHandler(WebClientResponseException.class)
    public ResponseEntity<String> handleWebClientResponseException(WebClientResponseException ex) {
        log.error("Error from WebClient - Status {}, Body {}", ex.getRawStatusCode(),
                ex.getResponseBodyAsString(), ex);
        return ResponseEntity.status(ex.getRawStatusCode()).body(ex.getResponseBodyAsString());
    }
}


