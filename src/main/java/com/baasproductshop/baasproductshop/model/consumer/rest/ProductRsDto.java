package com.baasproductshop.baasproductshop.model.consumer.rest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductRsDto {
    @JsonProperty(value = "product_name")
    private String name;
    @JsonProperty(value = "product_description")
    private String description;
    @JsonProperty(value = "product_price")
    private BigDecimal price;
    @JsonProperty(value = "category")
    private String categoryName;
}
