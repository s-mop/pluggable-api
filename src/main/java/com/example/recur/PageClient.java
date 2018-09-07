package com.example.recur;

import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Validated
@ResponseBody
public interface PageClient<T> {

    @ApiOperation("分页查询")
    @PostMapping("/searchPage")
    String searchPage(@RequestParam("pageNum") Integer pageNum,
            @RequestParam("pageSize") Integer pageSize, @RequestBody(required = false) T entity);
}