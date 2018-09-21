package demo.client;

import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface SearchClient<T> {

    @ApiOperation("搜索")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    List<T> search(T entity);
}