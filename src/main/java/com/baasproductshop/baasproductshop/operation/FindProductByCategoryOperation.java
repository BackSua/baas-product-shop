package com.baasproductshop.baasproductshop.operation;

import com.baasproductshop.baasproductshop.crosscutting.constants.MessageConstants;
import com.baasproductshop.baasproductshop.dataprovider.jpa.entity.CategoryEntity;
import com.baasproductshop.baasproductshop.dataprovider.jpa.entity.ProductEntity;
import com.baasproductshop.baasproductshop.model.consumer.rest.ProductRsDto;
import com.baasproductshop.baasproductshop.service.ICategoryService;
import com.baasproductshop.baasproductshop.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class FindProductByCategoryOperation {

    public final ICategoryService categoryService;
    public final IProductService productService;


    public List<ProductRsDto> findProductByCategory(String name) throws Exception{
        if (Objects.isNull(name) || name.isEmpty()){
            throw new Exception(MessageConstants.INPUT_DATA_NULL);
        }
        CategoryEntity categoryEntity = categoryService.findByCategoryName(name);
        List<ProductEntity> productEntities = productService.findProductByCategory(categoryEntity.getId());
        return productEntities.stream().map(product -> ProductRsDto.builder()
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .categoryName(product.getCategoryEntity().getName())
                .build()).collect(Collectors.toList());
    }
}
