package com.baasproductshop.baasproductshop.consumer;

import com.baasproductshop.baasproductshop.crosscutting.constants.ResourceEndpoint;
import com.baasproductshop.baasproductshop.model.consumer.rest.CategoryRqDto;
import com.baasproductshop.baasproductshop.model.consumer.rest.MessageRsDto;
import com.baasproductshop.baasproductshop.model.consumer.rest.ProductRqDto;
import com.baasproductshop.baasproductshop.model.consumer.rest.ProductRsDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(ResourceEndpoint.PRODUCT_PATH)
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    public ProductRequestDelegate delegate;

    public ProductRequestDelegate getDelegate(){
        return delegate;
    }

    @PostMapping("/create")
    public MessageRsDto createCategory(@RequestBody @Valid ProductRqDto productRqDto) throws Exception {
        return getDelegate().createProduct(productRqDto);
    }

    @GetMapping("/findProductByCategory/{categoryName}")
    public List<ProductRsDto> findProductByCategory(@PathVariable String categoryName) throws Exception {
        return getDelegate().findProductByCategory(categoryName);
    }
}
