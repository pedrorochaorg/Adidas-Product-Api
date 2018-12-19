package com.adidas.products.products.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * Product Description model, used for marshaling and unmarshaling data from/to json while interacting with REST endpoints.
 *
 * @author pedrorocha
 **/
@ApiModel(description = "Product Highlights Item Model Object, ")
@Data
@Builder
@ToString
@AllArgsConstructor
public class ProductDescription implements Serializable {

    @ApiModelProperty(
            dataType = "String",
            example = "Ultraboost Parley Shoes",
            name = "title"
    )
    @JsonProperty("title")
    private String title;

    @ApiModelProperty(
            dataType = "String",
            example = "Energy from the ground up.",
            name = "subtitle"
    )
    @JsonProperty("subtitle")
    private String subtitle;

    @ApiModelProperty(
            dataType = "String",
            example = "These running shoes combine comfort and high-performance technology for a best-ever-run feeling. The knit upper features yarn spun from plastic that's reclaimed from the shoreline before it reaches the ocean. Responsive midsole cushioning and a flexible outsole deliver a smooth and energised ride. ",
            name = "text"
    )
    @JsonProperty("text")
    private String text;

    @ApiModelProperty(
            dataType = "String[]",
            example = "Regular fit, Lace closure ",
            name = "usps"
    )
    @JsonProperty("usps")
    private String[] usps;

    @ApiModelProperty(
            dataType = "ProductHighlights",
            name = "product_highlights"
    )
    @JsonProperty("product_highlights")
    private ProductHighlights productHighlights;


    @ApiModelProperty(
            dataType = "Object",
            name = "description_assets"
    )
    @JsonProperty("description_assets")
    private Object descriptionAssets;
}
