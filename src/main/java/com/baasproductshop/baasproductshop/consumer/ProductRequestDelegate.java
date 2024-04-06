package com.baasproductshop.baasproductshop.consumer;

import com.baasproductshop.baasproductshop.model.consumer.rest.MessageRsDto;
import com.baasproductshop.baasproductshop.model.consumer.rest.ProductRqDto;
import com.baasproductshop.baasproductshop.model.consumer.rest.ProductRsDto;
import com.baasproductshop.baasproductshop.operation.CreateProductOperation;
import com.baasproductshop.baasproductshop.operation.FindProductByCategoryOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductRequestDelegate {

    @Autowired
    @Qualifier("createProductOperation")
    private CreateProductOperation createProductOperation;

    @Autowired
    @Qualifier("findProductByCategoryOperation")
    private FindProductByCategoryOperation findProductByCategoryOperation;


    public MessageRsDto createProduct(ProductRqDto productRqDto) throws Exception {
        return createProductOperation.createProduct(productRqDto);
    }

    public List<ProductRsDto> findProductByCategory(String name) throws Exception {
        return findProductByCategoryOperation.findProductByCategory(name);
    }

}
