package com.cavcav.orderservice.dto;


import com.cavcav.orderservice.model.Order;

import java.math.BigDecimal;

public record OrderRequest(Long id, String orderNumber, String skuCode, BigDecimal price, Integer quantity) {

}
