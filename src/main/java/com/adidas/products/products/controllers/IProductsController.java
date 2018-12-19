package com.adidas.products.products.controllers;

import com.adidas.products.products.common.messages.Rest;
import com.adidas.products.products.models.ErrorResponse;
import com.adidas.products.products.models.Product;
import com.adidas.products.products.models.ProductScore;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import reactor.core.publisher.Mono;

/**
 * @author pedrorocha
 **/
@Api(
        value = "Products",
        description = "Get Product Info",
        tags = {"Product"}
)
public interface IProductsController {


    @ApiOperation(
            value = "Get a product's score information",
            response = Mono.class
    )
    @ApiResponses(value = {
            @ApiResponse(
                    code = 200,
                    message = Rest.CONTENT_READY,
                    response = ProductScore.class
            ),
            @ApiResponse(code = 401, message = Rest.UNAUTHENTICATED, response = ErrorResponse.class),
            @ApiResponse(code = 403, message = Rest.UNAUTHORIZED, response = ErrorResponse.class),
            @ApiResponse(code = 500, message = Rest.INTERNAL_SERVER_ERROR, response = ErrorResponse.class)
    })
    @RequestMapping(path = "/product/{product_id}", method = RequestMethod.GET, produces = Rest.CONTENT_FORMAT)
    Mono<ResponseEntity<Product>> getProduct(
            @ApiParam(required = true, value = "Product Unique identifier")
            @PathVariable(name = "product_id") final String productId
    );

}
