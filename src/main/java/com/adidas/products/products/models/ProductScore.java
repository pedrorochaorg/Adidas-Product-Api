package com.adidas.products.products.models;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.constraints.Min;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * ProductScore model, used for marshaling and unmarshaling data from/to json while interacting with REST endpoints.
 *
 * @author pedrorocha
 **/
@ApiModel(description = "ProductScore Model Object, ")
@Data
@Builder
@ToString
public class ProductScore implements Serializable {


    @Min(value = 0)
    @ApiModelProperty(
            dataType = "Long",
            example = "12312313",
            name = "numberOfReviews",
            readOnly = true
    )
    @JsonPropertyDescription("Total number of product received reviews")
    private Long numberOfReviews;

    @Min(value = 0)
    @ApiModelProperty(
            dataType = "Double",
            example = "99.532353",
            name = "averageReviewScore",
            readOnly = true
    )
    @JsonPropertyDescription("Average review score")
    private Double averageReviewScore;

    /**
     * Simplified class constructor.
     */
    public ProductScore() {
    }

    /**
     * Instantiates a new ProductScrore object.
     *
     * @param numberOfReviews    total number of reviews
     * @param averageReviewScore average review score
     */
    public ProductScore(
            @Min(value = 0)
                    Long numberOfReviews,
            @Min(value = 0)
                    Double averageReviewScore
    ) {
        this.numberOfReviews = numberOfReviews;
        this.averageReviewScore = averageReviewScore;
    }
}
