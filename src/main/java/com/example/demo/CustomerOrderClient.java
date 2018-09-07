package com.example.demo;

import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("order/customer")
@RestController
@Validated
@Api(tags = {"车主工单模块"})
public interface CustomerOrderClient {

    @GetMapping("detail")
    String detail();
}