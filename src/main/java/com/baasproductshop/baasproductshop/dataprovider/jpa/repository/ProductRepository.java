package com.baasproductshop.baasproductshop.dataprovider.jpa.repository;

import com.baasproductshop.baasproductshop.dataprovider.jpa.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,UUID> {
    @Query(nativeQuery = true, value = "SELECT * FROM PRODUCT_ENTITY pe WHERE pe.CATEGORY = :id")
    List<ProductEntity> findProducyByCategory(UUID id);
}
