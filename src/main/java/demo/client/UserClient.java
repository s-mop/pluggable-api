package demo.client;

import demo.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "user")
@Validated
@RestController
@Api(tags = {"用户"})
public interface UserClient extends SearchClient<User>, CreateClient<User> {

    @ApiOperation("发消息")
    @GetMapping("sendMsg")
    void sendMsg(String msg);
}