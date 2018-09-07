package com.example.demo;

import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Validated
@ResponseBody
public interface PageClient<T> {

    @ApiOperation("分页查询")
    @GetMapping("searchPage")
    String searchPage();
}