package com.baasproductshop.baasproductshop.consumer;

import com.baasproductshop.baasproductshop.crosscutting.constants.ResourceEndpoint;
import com.baasproductshop.baasproductshop.model.consumer.rest.CategoryRqDto;
import com.baasproductshop.baasproductshop.model.consumer.rest.CategoryRsDto;
import com.baasproductshop.baasproductshop.model.consumer.rest.MessageRsDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(ResourceEndpoint.CATEGORY_PATH)
@RequiredArgsConstructor
public class CategoryController {

    @Autowired
    public CategoryRequestDelegate delegate;

    public CategoryRequestDelegate getDelegate(){
        return delegate;
    }

    @PostMapping("/create")
    public MessageRsDto createCategory(@RequestBody @Valid CategoryRqDto categoryRqDto) throws Exception {
        return getDelegate().createCategory(categoryRqDto);
    }

    @GetMapping("/getAll")
    public List<CategoryRsDto> getAllCategory() throws Exception {
        return getDelegate().getAllCategory();
    }
}
