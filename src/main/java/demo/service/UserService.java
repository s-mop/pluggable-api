
package demo.service;

import demo.client.UserClient;
import demo.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractPersistenceService<User> implements UserClient {

    @Override
    public void sendMsg(String msg) {
    }
}
