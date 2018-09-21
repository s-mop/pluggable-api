package demo.client;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface UpdateClient<T> {

    @ApiOperation("更新")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    void update(@RequestBody T entity);
}