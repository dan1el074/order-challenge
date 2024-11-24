package com.devsuperior.desafio1.services;

import com.devsuperior.desafio1.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order ) {
        double basicOrder = order.getBasic();
        double result = 0;

        if(basicOrder < 100.0) {
            result = 20.0;
        }

        if(basicOrder >= 100.0 && basicOrder < 200.0) {
            result = 12.0;
        }

        return result;
    }
}
