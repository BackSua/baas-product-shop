package com.baasproductshop.baasproductshop.service.Impl;

import com.baasproductshop.baasproductshop.crosscutting.mapper.Mapper;
import com.baasproductshop.baasproductshop.dataprovider.jpa.entity.CategoryEntity;
import com.baasproductshop.baasproductshop.dataprovider.jpa.entity.ProductEntity;
import com.baasproductshop.baasproductshop.dataprovider.jpa.repository.ProductRepository;
import com.baasproductshop.baasproductshop.model.consumer.rest.ProductRqDto;
import com.baasproductshop.baasproductshop.model.consumer.rest.ProductRsDto;
import com.baasproductshop.baasproductshop.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements IProductService {

    public final ProductRepository productRepository;
    @Override
    public void saveProduct(ProductEntity product) {
        productRepository.save(product);
    }

    @Override
    public List<ProductEntity> findProductByCategory(UUID categoryId) {
        List<ProductEntity> productEntities = productRepository.findProducyByCategory(categoryId);
        return productEntities;
    }
}
