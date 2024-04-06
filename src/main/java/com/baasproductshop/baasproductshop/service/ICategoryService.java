package com.baasproductshop.baasproductshop.service;

import com.baasproductshop.baasproductshop.dataprovider.jpa.entity.CategoryEntity;
import com.baasproductshop.baasproductshop.model.consumer.rest.CategoryRsDto;

import java.util.List;

public interface ICategoryService {
    void saveCategory(CategoryEntity categoryEntity);

    List<CategoryRsDto> getAllCategory();

    CategoryEntity findByCategoryName(String name);
}
