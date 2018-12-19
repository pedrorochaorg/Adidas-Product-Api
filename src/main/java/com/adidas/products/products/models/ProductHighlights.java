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
 * Product Highlights Item model, used for marshaling and unmarshaling data from/to json while interacting with REST endpoints.
 *
 * @author pedrorocha
 **/
@ApiModel(description = "Product Highlights Item Model Object, ")
@Data
@Builder
@ToString
@AllArgsConstructor
public class ProductHighlights implements Serializable {

    @ApiModelProperty(
            dataType = "String",
            example = "https://assets.adidas.com/images/w_600,f_auto,q_auto/11aa2ef9b0774b55a2bca8d600d9488f_9366/Ultraboost_Parley_Shoes_Blue_AC7836_01_standard.jpg",
            name = "image_reference"
    )
    @JsonProperty("image_reference")
    private String imageReference;

    @ApiModelProperty(
            dataType = "String",
            example = "Runner type",
            name = "headline"
    )
    @JsonProperty("headline")
    private String headline;

    @ApiModelProperty(
            dataType = "String",
            example = "Neutral shoes for the ultimate running experience",
            name = "copy"
    )
    @JsonProperty("copy")
    private String copy;
    

}
