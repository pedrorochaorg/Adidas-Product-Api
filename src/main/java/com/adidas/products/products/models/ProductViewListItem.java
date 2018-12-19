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
 * Product View List Item model, used for marshaling and unmarshaling data from/to json while interacting with REST endpoints.
 *
 * @author pedrorocha
 **/
@ApiModel(description = "Product View List Item Model Object, ")
@Data
@Builder
@ToString
@AllArgsConstructor
public class ProductViewListItem implements Serializable {

    @ApiModelProperty(
            dataType = "String",
            example = "standard",
            name = "type"
    )
    @JsonProperty("type")
    private String type;

    @ApiModelProperty(
            dataType = "String",
            example = "http://www.google.com/facicon.ico",
            name = "image_url"
    )
    @JsonProperty("image_url")
    private String imageUrl;

    @ApiModelProperty(
            dataType = "String",
            example = "COUDINARY",
            name = "source"
    )
    @JsonProperty("source")
    private String source;

}
