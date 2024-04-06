package com.baasproductshop.baasproductshop.service;

import com.baasproductshop.baasproductshop.dataprovider.jpa.entity.CategoryEntity;
import com.baasproductshop.baasproductshop.dataprovider.jpa.entity.ProductEntity;
import com.baasproductshop.baasproductshop.model.consumer.rest.ProductRqDto;
import com.baasproductshop.baasproductshop.model.consumer.rest.ProductRsDto;

import java.util.List;
import java.util.UUID;

public interface IProductService {

    void saveProduct(ProductEntity product);

    List<ProductEntity> findProductByCategory(UUID categoryId);

}
