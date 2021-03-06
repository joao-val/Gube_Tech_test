package com.joaoval.gubee.demo.controller;

import com.joaoval.gubee.demo.entity.Product;
import com.joaoval.gubee.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public List<Product> getAll(@RequestParam(required = false) List<String> stack,
                                @RequestParam(required = false) List<String> targetMarket){
        return service.getAll(stack, targetMarket);
    }
}