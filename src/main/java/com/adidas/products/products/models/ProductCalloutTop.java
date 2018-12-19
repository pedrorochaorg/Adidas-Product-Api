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
 * Product Callout Top Item model, used for marshaling and unmarshaling data from/to json while interacting with REST endpoints.
 *
 * @author pedrorocha
 **/
@ApiModel(description = "Product Callout Top Item Model Object, ")
@Data
@Builder
@ToString
@AllArgsConstructor
public class ProductCalloutTop implements Serializable {

    @ApiModelProperty(
            dataType = "String",
            example = "For Christmas?",
            name = "title"
    )
    @JsonProperty("title")
    private String title;

    @ApiModelProperty(
            dataType = "String",
            example = "Last day to get your gifts under the tree by Christmas with standard delivery! Complete before 8:30PM.",
            name = "sub_title"
    )
    @JsonProperty("sub_title")
    private String subTitle;

    @ApiModelProperty(
            dataType = "String",
            example = "usp-delivery",
            name = "iconID"
    )
    @JsonProperty("iconID")
    private String iconID;
    

}
