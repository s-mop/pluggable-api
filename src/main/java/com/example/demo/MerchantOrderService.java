
package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class MerchantOrderService extends AbstractOrderService implements MerchantOrderClient {

    public String deliver() {
        return "delivered";
    }
}
