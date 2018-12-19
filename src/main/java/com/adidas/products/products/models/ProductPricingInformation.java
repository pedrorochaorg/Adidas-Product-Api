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
 * Product Pricing Information model, used for marshaling and unmarshaling data from/to json while interacting with REST endpoints.
 *
 * @author pedrorocha
 **/
@ApiModel(description = "Product Pricing Information Model Object, ")
@Data
@Builder
@ToString
@AllArgsConstructor
public class ProductPricingInformation implements Serializable {

    @ApiModelProperty(
            dataType = "Float",
            example = "19.99",
            name = "standard_price"
    )
    @JsonProperty("standard_price")
    private Float standardPrice;

    @ApiModelProperty(
            dataType = "Float",
            example = "19.99",
            name = "standard_price_no_vat"
    )
    @JsonProperty("standard_price_no_vat")
    private Float standardPriceNoVat;

    @ApiModelProperty(
            dataType = "Float",
            example = "19.99",
            name = "currentPrice"
    )
    @JsonProperty("currentPrice")
    private Float currentPrice;

}
