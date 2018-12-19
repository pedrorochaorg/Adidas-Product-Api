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
public class ProductAttributeList implements Serializable {

    @ApiModelProperty(
            dataType = "Boolean",
            example = "false",
            name = "isWaitingRoomProduct"
    )
    @JsonProperty("isWaitingRoomProduct")
    private Boolean isWaitingRoomProduct;

    @ApiModelProperty(
            dataType = "String",
            example = "addidas",
            name = "brand"
    )
    @JsonProperty("brand")
    private String brand;

    @ApiModelProperty(
            dataType = "String[]",
            example = "asdasd, wqeqwe",
            name = "collection"
    )
    @JsonProperty("collection")
    private String[] collection;

    @ApiModelProperty(
            dataType = "String",
            example = "category",
            name = "category"
    )
    @JsonProperty("category")
    private String category;

    @ApiModelProperty(
            dataType = "String",
            example = "color",
            name = "color"
    )
    @JsonProperty("color")
    private String color;

    @ApiModelProperty(
            dataType = "String",
            example = "gender",
            name = "gender"
    )
    @JsonProperty("gender")
    private String gender;

    @ApiModelProperty(
            dataType = "String",
            example = "gender sub",
            name = "gender_sub"
    )
    @JsonProperty("gender_sub")
    private String genderSub;

    @ApiModelProperty(
            dataType = "String",
            example = "personalizable field",
            name = "personalizable"
    )
    @JsonProperty("personalizable")
    private String personalizable;

    @ApiModelProperty(
            dataType = "String",
            example = "is personalization mandatory",
            name = "mandatory_personalization"
    )
    @JsonProperty("mandatory_personalization")
    private String mandatoryPersonalization;

    @ApiModelProperty(
            dataType = "Boolean",
            example = "false",
            name = "personalization"
    )
    @JsonProperty("personalization")
    private Boolean personalization;

    @ApiModelProperty(
            dataType = "String",
            example = "Pricebook id",
            name = "pricebook"
    )
    @JsonProperty("pricebook")
    private String pricebook;

    @ApiModelProperty(
            dataType = "Boolean",
            example = "false",
            name = "sale"
    )
    @JsonProperty("sale")
    private Boolean sale;

    @ApiModelProperty(
            dataType = "Boolean",
            example = "false",
            name = "outlet"
    )
    @JsonProperty("outlet")
    private Boolean outlet;

    @ApiModelProperty(
            dataType = "Boolean",
            example = "false",
            name = "isCnCRestricted"
    )
    @JsonProperty("isCnCRestricted")
    private Boolean isCnCRestricted;

    @ApiModelProperty(
            dataType = "String[]",
            example = "Lifestyle",
            name = "sport"
    )
    @JsonProperty("sport")
    private String[] sport;

    @ApiModelProperty(
            dataType = "String",
            example = "/on/demandware.store/Sites-adidas-GB-Site/en_GB/Page-Include?cid=size-chart-size-k_shoes",
            name = "size_chart_link"
    )
    @JsonProperty("size_chart_link")
    private String sizeChartLink;

    @ApiModelProperty(
            dataType = "String",
            example = "2012-12-11T22:00:00.000Z",
            name = "preview_to"
    )
    @JsonProperty("preview_to")
    private String previewTo;

    @ApiModelProperty(
            dataType = "Boolean",
            example = "false",
            name = "coming_soon_signup"
    )
    @JsonProperty("coming_soon_signup")
    private Boolean comminSoonSignup;

    @ApiModelProperty(
            dataType = "String",
            example = "adidassuperstar",
            name = "hashtag"
    )
    @JsonProperty("hashtag")
    private String hashtag;

    @ApiModelProperty(
            dataType = "String[]",
            example = "Trainers",
            name = "productType"
    )
    @JsonProperty("productType")
    private String[] productType;

    @ApiModelProperty(
            dataType = "String[]",
            example = "Superstar",
            name = "sportSub"
    )
    @JsonProperty("sportSub")
    private String[] sportSub;

    @ApiModelProperty(
            dataType = "String",
            example = "White",
            name = "search_color"
    )
    @JsonProperty("search_color")
    private String searchColor;
}
