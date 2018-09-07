package com.example.recur;

import com.example.demo.PageClient;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "owner/service")
@Validated
@RestController
public interface OwnerServiceClient extends PageClient<Service> {

    @ApiOperation("详情")
    @GetMapping("/{id}/detail")
    public String getDetailById(@PathVariable Integer id);
}