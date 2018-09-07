package com.example.demo;

import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("order/merchant")
@Validated
@RestController
@Api(tags = {"商家工单模块"})
public interface MerchantOrderClient extends PageClient {

    @GetMapping("deliver")
    String deliver();
}