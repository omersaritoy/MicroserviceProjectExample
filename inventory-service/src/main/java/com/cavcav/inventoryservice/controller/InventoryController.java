package com.cavcav.inventoryservice.controller;


import com.cavcav.inventoryservice.model.Inventory;
import com.cavcav.inventoryservice.repository.InventoryRepository;
import com.cavcav.inventoryservice.service.InventoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {
    private final InventoryService inventoryService;
    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }
    @GetMapping
    public boolean isInStock(@RequestParam String skuCode,@RequestParam Integer quantity) {
        return inventoryService.isInStock(skuCode, quantity);
    }

}
