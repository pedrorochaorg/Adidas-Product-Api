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
 * Product Link List Item model, used for marshaling and unmarshaling data from/to json while interacting with REST endpoints.
 *
 * @author pedrorocha
 **/
@ApiModel(description = "Product Link List Item Model Object, ")
@Data
@Builder
@ToString
@AllArgsConstructor
public class ProductLinkListItem implements Serializable {

    @ApiModelProperty(
            dataType = "String",
            example = "color-variation",
            name = "type"
    )
    @JsonProperty("type")
    private String type;

    @ApiModelProperty(
            dataType = "String",
            example = "Ultraboost Parley Shoes",
            name = "name"
    )
    @JsonProperty("name")
    private String name;

    @ApiModelProperty(
            dataType = "String",
            example = "/ultraboost-parley-shoes/BC0248.html",
            name = "url"
    )
    @JsonProperty("url")
    private String url;

    @ApiModelProperty(
            dataType = "String",
            example = "https://assets.adidas.com/images/w_600,f_auto,q_auto/58ae07073f2a4cffa285a8c40124a6db_9366/Ultraboost_Parley_Shoes_Grey_BC0248_01_standard.jpg",
            name = "image"
    )
    @JsonProperty("image")
    private String image;

    @ApiModelProperty(
            dataType = "String",
            example = "//www.adidas.co.uk/dis/dw/image/v2/aagl_prd/on/demandware.static/-/Sites-adidas-products/default/dwa2e9e9e4/zoom/BC0248_02_hover_frv.jpg",
            name = "altImage"
    )
    @JsonProperty("altImage")
    private String altImage;

    @ApiModelProperty(
            dataType = "ProductLinkListPricingInformation",
            name = "pricing_information"
    )
    @JsonProperty("pricing_information")
    private ProductLinkListPricingInformation pricingInformation;

    @ApiModelProperty(
            dataType = "String",
            example = "Carbon / Ftwr White / Blue Spirit",
            name = "default_color"
    )
    @JsonProperty("default_color")
    private String defaultColor;

    @ApiModelProperty(
            dataType = "String",
            example = "Grey",
            name = "search_color"
    )
    @JsonProperty("search_color")
    private String searchColor;

    @ApiModelProperty(
            dataType = "String",
            example = "CLOUDINARY",
            name = "source"
    )
    @JsonProperty("source")
    private String source;
}
