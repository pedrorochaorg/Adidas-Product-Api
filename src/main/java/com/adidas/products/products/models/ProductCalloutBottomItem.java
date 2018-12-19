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
 * Product Callout Bottom Item model, used for marshaling and unmarshaling data from/to json while interacting with REST endpoints.
 *
 * @author pedrorocha
 **/
@ApiModel(description = "Product Callout Bottom Item Model Object, ")
@Data
@Builder
@ToString
@AllArgsConstructor
public class ProductCalloutBottomItem implements Serializable {

    @ApiModelProperty(
            dataType = "String",
            example = "Free 1-3 day tracked delivery with no minimum spend",
            name = "title"
    )
    @JsonProperty("title")
    private String title;

    @ApiModelProperty(
            dataType = "String",
            example = "<p>Enjoy free delivery with no minimum spend.</p>",
            name = "body"
    )
    @JsonProperty("body")
    private String body;

    @ApiModelProperty(
            dataType = "String",
            example = "Free delivery for the holiday season",
            name = "link_text"
    )
    @JsonProperty("link_text")
    private String linkText;

    @ApiModelProperty(
            dataType = "String",
            example = "usp-delivery",
            name = "iconID"
    )
    @JsonProperty("iconID")
    private String iconID;


}
