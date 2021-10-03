package com.joaoval.gubee.demo.service;

import com.joaoval.gubee.demo.entity.Product;
import com.joaoval.gubee.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll(List<String> stack, List<String> targetMarket) {
        List<Product> products = productRepository.findAll();
        return products.stream().filter(
                product -> product.getStack().stream().anyMatch(stack::contains)||
                        product.getTargetMarket().stream().anyMatch(targetMarket::contains)).collect(Collectors.toList());
    }
}
