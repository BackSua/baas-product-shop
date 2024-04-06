package com.baasproductshop.baasproductshop.model.consumer.rest;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoryRqDto {
    @JsonProperty(value = "category_name")
    private String name;
    @JsonProperty(value = "category_description")
    private String description;
}