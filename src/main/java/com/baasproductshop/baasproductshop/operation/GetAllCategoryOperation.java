package com.baasproductshop.baasproductshop.operation;

import com.baasproductshop.baasproductshop.model.consumer.rest.CategoryRsDto;
import com.baasproductshop.baasproductshop.service.ICategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GetAllCategoryOperation {

    public final ICategoryService categoryService;

    public List<CategoryRsDto> getAllCategory() throws Exception{
        return categoryService.getAllCategory();
    }
}
