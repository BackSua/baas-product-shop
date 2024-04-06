package com.baasproductshop.baasproductshop.dataprovider.jpa.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @JsonProperty(value="ID")
    private UUID id;
    @JsonProperty(value="CATEGORY_NAME")
    private String name;
    @JsonProperty(value = "CATEGORY_DESCRIPTION")
    private String description;
    @OneToMany(mappedBy="categoryEntity", fetch = FetchType.EAGER, cascade = {CascadeType.MERGE})
    private List<ProductEntity> product;
}
