package com.baasproductshop.baasproductshop.dataprovider.jpa.repository;

import com.baasproductshop.baasproductshop.dataprovider.jpa.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity,UUID> {
    CategoryEntity findByName(String name);
}
