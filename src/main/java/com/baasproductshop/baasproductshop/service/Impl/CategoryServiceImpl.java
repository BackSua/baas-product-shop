package com.baasproductshop.baasproductshop.service.Impl;

import com.baasproductshop.baasproductshop.dataprovider.jpa.entity.CategoryEntity;
import com.baasproductshop.baasproductshop.dataprovider.jpa.repository.CategoryRepository;
import com.baasproductshop.baasproductshop.model.consumer.rest.CategoryRsDto;
import com.baasproductshop.baasproductshop.service.ICategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements ICategoryService {

    public final CategoryRepository categoryRepository;

    public void saveCategory(CategoryEntity categoryEntity){
        categoryRepository.save(categoryEntity);
    }

    @Override
    public List<CategoryRsDto> getAllCategory() {
        List<CategoryEntity>  categoryEntities = categoryRepository.findAll();
        return categoryEntities.stream().map(categoryEntity -> CategoryRsDto.builder()
                .name(categoryEntity.getName())
                .build()).toList();
    }

    @Override
    public CategoryEntity findByCategoryName(String name) {
        return categoryRepository.findByName(name);
    }
}
