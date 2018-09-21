
package demo.service;

import demo.client.OrderClient;
import demo.entity.Order;
import java.math.BigDecimal;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderService extends AbstractPersistenceService<Order> implements OrderClient {

    @Override
    public Order getDetailById(Integer id) {
        Order order = new Order();
        order.setId(id);
        order.setAmount(new BigDecimal(998));
        return order;
    }
}
