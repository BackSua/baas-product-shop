package com.baasproductshop.baasproductshop.crosscutting.mapper;

import com.baasproductshop.baasproductshop.dataprovider.jpa.entity.CategoryEntity;
import com.baasproductshop.baasproductshop.dataprovider.jpa.entity.ProductEntity;
import com.baasproductshop.baasproductshop.model.consumer.rest.CategoryRqDto;
import com.baasproductshop.baasproductshop.model.consumer.rest.ProductRqDto;
import com.baasproductshop.baasproductshop.model.consumer.rest.ProductRsDto;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class Mapper {



    public static CategoryEntity buildCategory(CategoryRqDto categoryRqDto){
        return CategoryEntity.builder()
                .name(categoryRqDto.getName())
                .description(categoryRqDto.getDescription())
                .build();
    }
    public static ProductEntity buildProduct(ProductRqDto productRqDto,CategoryEntity category){
        return ProductEntity.builder()
                .name(productRqDto.getName())
                .description(productRqDto.getDescription())
                .price(productRqDto.getPrice())
                .categoryEntity(category)
                .build();

    }

    public static List<ProductRsDto> mapProductRsDto(List<ProductEntity> productEntities){
        List<ProductRsDto> productRsDtos = new ArrayList<>();
        return null;

    }
}
