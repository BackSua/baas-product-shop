package com.baasproductshop.baasproductshop.consumer;

import com.baasproductshop.baasproductshop.model.consumer.rest.CategoryRqDto;
import com.baasproductshop.baasproductshop.model.consumer.rest.CategoryRsDto;
import com.baasproductshop.baasproductshop.model.consumer.rest.MessageRsDto;
import com.baasproductshop.baasproductshop.operation.CreateCategoryOperation;
import com.baasproductshop.baasproductshop.operation.GetAllCategoryOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryRequestDelegate {

    @Autowired
    @Qualifier("createCategoryOperation")
    private CreateCategoryOperation createCategoryOperation;

    @Autowired
    @Qualifier("getAllCategoryOperation")
    private GetAllCategoryOperation getAllCategoryOperation;

    public  MessageRsDto createCategory(CategoryRqDto categoryRqDto) throws Exception {
        return createCategoryOperation.createCategory(categoryRqDto);
    }

    public List<CategoryRsDto> getAllCategory() throws Exception{
        return getAllCategoryOperation.getAllCategory();
    }
}
