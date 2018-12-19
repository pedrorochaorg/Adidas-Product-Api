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
 * Product Breadcrumb Item model, used for marshaling and unmarshaling data from/to json while interacting with REST endpoints.
 *
 * @author pedrorocha
 **/
@ApiModel(description = "Product Breadcrumb Item Model Object, ")
@Data
@Builder
@ToString
@AllArgsConstructor
public class ProductBreadcumbListItem implements Serializable {

    @ApiModelProperty(
            dataType = "String",
            example = "Men",
            name = "text"
    )
    @JsonProperty("text")
    private String text;

    @ApiModelProperty(
            dataType = "String",
            example = "/men",
            name = "link"
    )
    @JsonProperty("link")
    private String link;
    

}
