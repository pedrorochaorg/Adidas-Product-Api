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
 * Product Metadata model, used for marshaling and unmarshaling data from/to json while interacting with REST endpoints.
 *
 * @author pedrorocha
 **/
@ApiModel(description = "Product Metadata Model Object, ")
@Data
@Builder
@ToString
@AllArgsConstructor
public class ProductCallouts implements Serializable {

    @ApiModelProperty(
            dataType = "ProductCalloutTop",
            name = "callout_top_stack"
    )
    @JsonProperty("callout_top_stack")
    private ProductCalloutTop calloutTopStack;

    @ApiModelProperty(
            dataType = "ProductCalloutBottomItem[]",
            name = "callout_bottom_stack"
    )
    @JsonProperty("callout_bottom_stack")
    private ProductCalloutBottomItem[] calloutBottomStack;


}
