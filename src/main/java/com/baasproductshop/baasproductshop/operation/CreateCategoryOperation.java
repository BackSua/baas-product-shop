package com.baasproductshop.baasproductshop.operation;

import com.baasproductshop.baasproductshop.crosscutting.constants.MessageConstants;
import com.baasproductshop.baasproductshop.crosscutting.mapper.Mapper;
import com.baasproductshop.baasproductshop.dataprovider.jpa.entity.CategoryEntity;
import com.baasproductshop.baasproductshop.model.consumer.rest.CategoryRqDto;
import com.baasproductshop.baasproductshop.model.consumer.rest.MessageRsDto;
import com.baasproductshop.baasproductshop.service.ICategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@RequiredArgsConstructor
public class CreateCategoryOperation {

    public final ICategoryService categoryService;

    public MessageRsDto createCategory(CategoryRqDto categoryRqDto) throws Exception {
        if(Objects.isNull(categoryRqDto)){
            throw new Exception(MessageConstants.INPUT_DATA_NULL);
        }
        CategoryEntity categoryEntity = Mapper.buildCategory(categoryRqDto);
        categoryService.saveCategory(categoryEntity);
        return MessageRsDto.builder()
                .message(MessageConstants.SUCCESFUL_REGISTRATION)
                .build();
    }

}
