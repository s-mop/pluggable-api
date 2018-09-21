package demo.client;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface CreateClient<T> {

    @ApiOperation("新建")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    T create(@RequestBody T entity);
}