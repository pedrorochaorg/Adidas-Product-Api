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
 * Product Link List Item Pricing Information  model, used for marshaling and unmarshaling data from/to json while interacting with REST endpoints.
 *
 * @author pedrorocha
 **/
@ApiModel(description = "Product Link List Item Pricing Information Item Model Object, ")
@Data
@Builder
@ToString
@AllArgsConstructor
public class ProductLinkListPricingInformation implements Serializable {

    @ApiModelProperty(
            dataType = "String",
            example = "129.95",
            name = "standard_price"
    )
    @JsonProperty("standard_price")
    private Float standardPrice;


}
