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
 * Product Metadata model, used for marshaling and unmarshaling data from/to json while interacting with REST
 * endpoints.
 *
 * @author pedrorocha
 **/
@ApiModel(description = "Product Metadata Model Object, ")
@Data
@Builder
@ToString
@AllArgsConstructor
public class ProductMetaData implements Serializable {

    @ApiModelProperty(
            dataType = "String",
            example = "title",
            name = "page_title"
    )
    @JsonProperty("page_title")
    private String pageTitle;

    @ApiModelProperty(
            dataType = "String",
            example = "title",
            name = "site_name"
    )
    @JsonProperty("site_name")
    private String siteName;

    @ApiModelProperty(
            dataType = "String",
            example = "description",
            name = "description"
    )
    @JsonProperty("description")
    private String description;

    @ApiModelProperty(
            dataType = "String",
            example = "key words",
            name = "keywords"
    )
    @JsonProperty("keywords")
    private String keywords;


    @ApiModelProperty(
            dataType = "String",
            example = "canonical url",
            name = "canonical"
    )
    @JsonProperty("canonical")
    private String canonical;

}
