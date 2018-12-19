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
 * Product Card Item model, used for marshaling and unmarshaling data from/to json while interacting with REST endpoints.
 *
 * @author pedrorocha
 **/
@ApiModel(description = "Product Card Item Model Object, ")
@Data
@Builder
@ToString
@AllArgsConstructor
public class ProductCard implements Serializable {

    @ApiModelProperty(
            dataType = "String",
            example = "surface",
            name = "id"
    )
    @JsonProperty("id")
    private String id;

    @ApiModelProperty(
            dataType = "String",
            example = "urban_pavement_gym",
            name = "value"
    )
    @JsonProperty("value")
    private String value;
    

}
