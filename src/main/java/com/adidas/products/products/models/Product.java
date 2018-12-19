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
 * Product model, used for marshaling and unmarshaling data from/to json while interacting with REST endpoints.
 *
 * @author pedrorocha
 **/
@ApiModel(description = "Product Model Object, ")
@Data
@Builder
@ToString
@AllArgsConstructor
public class Product implements Serializable {


    @ApiModelProperty(
            dataType = "String",
            example = "C1235",
            name = "id"
    )
    @JsonProperty("id")
    private String id;

    @ApiModelProperty(
            dataType = "String",
            example = "Ultraboost Parley Shoes",
            name = "name"
    )
    @JsonProperty("name")
    private String name;

    @ApiModelProperty(
            dataType = "String",
            example = "AQK96",
            name = "model_number"
    )
    @JsonProperty("model_number")
    private String modelNumber;

    @ApiModelProperty(
            dataType = "String",
            example = "inline",
            name = "product_type"
    )
    @JsonProperty("product_type")
    private String productType;


    @ApiModelProperty(
            dataType = "ProductMetaData",
            name = "meta_data"
    )
    @JsonProperty("meta_data")
    private ProductMetaData metaData;

    @ApiModelProperty(
            dataType = "ProductViewListItem[]",
            name = "view_list"
    )
    @JsonProperty("view_list")
    private ProductViewListItem[] viewList;

    @ApiModelProperty(
            dataType = "ProductPricingInformation",
            name = "pricing_information"
    )
    @JsonProperty("pricing_information")
    private ProductPricingInformation pricingInformation;

    @ApiModelProperty(
            dataType = "ProductAttributeList",
            name = "attribute_list"
    )
    @JsonProperty("attribute_list")
    private ProductAttributeList attributeList;

    @ApiModelProperty(
            dataType = "ProductCallouts",
            name = "callouts"
    )
    @JsonProperty("callouts")
    private ProductCallouts callouts;

    @ApiModelProperty(
            dataType = "ProductDescription",
            name = "product_description"
    )
    @JsonProperty("product_description")
    private ProductDescription productDescription;

    @ApiModelProperty(
            dataType = "ProductCard[]",
            name = "product_cards"
    )
    @JsonProperty("product_cards")
    private ProductCard[] productCards;

    @ApiModelProperty(
            dataType = "ProductLinkListItem[]",
            name = "product_link_list"
    )
    @JsonProperty("product_link_list")
    private ProductLinkListItem[] productLinkList;

    @ApiModelProperty(
            dataType = "ProductBreadcumbItem[]",
            name = "breadcrumb_list"
    )
    @JsonProperty("breadcrumb_list")
    private ProductBreadcumbListItem[] breadcumbList;

    @ApiModelProperty(
            dataType = "ProductScore",
            name = "review_score"
    )
    @JsonProperty("review_score")
    private ProductScore reviewScore;
}
