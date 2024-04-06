package com.baasproductshop.baasproductshop.operation;

import com.baasproductshop.baasproductshop.crosscutting.constants.MessageConstants;
import com.baasproductshop.baasproductshop.crosscutting.mapper.Mapper;
import com.baasproductshop.baasproductshop.dataprovider.jpa.entity.CategoryEntity;
import com.baasproductshop.baasproductshop.dataprovider.jpa.entity.ProductEntity;
import com.baasproductshop.baasproductshop.model.consumer.rest.MessageRsDto;
import com.baasproductshop.baasproductshop.model.consumer.rest.ProductRqDto;
import com.baasproductshop.baasproductshop.service.ICategoryService;
import com.baasproductshop.baasproductshop.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@RequiredArgsConstructor
public class CreateProductOperation {

    public final ICategoryService categoryService;
    public final IProductService productService;

    public MessageRsDto createProduct(ProductRqDto productRqDto) throws Exception {
        if (Objects.isNull(productRqDto)) {
            throw new Exception(MessageConstants.INPUT_DATA_NULL);
        }
        CategoryEntity categoryEntity = categoryService.findByCategoryName(productRqDto.getCategoryName());
        ProductEntity product = Mapper.buildProduct(productRqDto, categoryEntity);
        productService.saveProduct(product);
        return MessageRsDto.builder()
                .message(MessageConstants.SUCCESFUL_REGISTRATION)
                .build();
    }
}

