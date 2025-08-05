package com.cavcav.orderservice.service;


import com.cavcav.orderservice.client.InventoryClient;
import com.cavcav.orderservice.dto.OrderRequest;
import com.cavcav.orderservice.model.Order;
import com.cavcav.orderservice.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final InventoryClient inventoryClient;

    public OrderService(OrderRepository orderRepository, InventoryClient inventoryClient) {
        this.orderRepository = orderRepository;
        this.inventoryClient = inventoryClient;
    }

    public void placeOrder(OrderRequest orderRequest) {
        var isProductInstock = inventoryClient.isInStock(orderRequest.skuCode(), orderRequest.quantity());
        if (isProductInstock) {
            Order order = new Order();
            order.setOrderNumber(UUID.randomUUID().toString());
            order.setPrice(orderRequest.price());
            order.setSkuCode(orderRequest.skuCode());
            order.setQuantity(orderRequest.quantity());
            orderRepository.save(order);
        }
        else
            throw new RuntimeException("Product with SkuCode: " + orderRequest.skuCode() + " is not in stock");






    }
}
