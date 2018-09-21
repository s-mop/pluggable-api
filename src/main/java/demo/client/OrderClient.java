package demo.client;

import demo.entity.Order;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "order")
@Validated
@RestController
@Api(tags = {"订单"})
public interface OrderClient extends CreateClient<Order>, UpdateClient<Order> {

    @ApiOperation("详情")
    @GetMapping("/{id}/detail")
    Order getDetailById(@PathVariable Integer id);
}