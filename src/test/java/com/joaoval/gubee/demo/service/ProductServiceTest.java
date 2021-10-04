package com.joaoval.gubee.demo.service;

import com.joaoval.gubee.demo.entity.Product;
import com.joaoval.gubee.demo.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

//    @BeforeEach
//    public void setup(){
//        productService = new ProductService(productRepository);
//        MockitoAnnotations.initMocks(this);
//        List<Product> products = createProducts();
//        Mockito.when(productRepository.findAll()).thenReturn(products);
//    }

    @Test
    public void givenNoParameters_whenGetAll_thenReturnAll(){
        List<Product> products = createProducts();

        when(productRepository.findAll()).thenReturn(products);
        List<Product> found = productService.getAll(null, null);
        Assertions.assertEquals(found.size(), 3);
    }

    private List<Product> createProducts(){

        ArrayList<String> targetMarket1 = new ArrayList<>(Arrays.asList("Ecommerce", "ERP", "Lojista que não desejam possuir ecommerce"));

        ArrayList<String> stack1 = new ArrayList<>(Arrays.asList("Java 10", "Kotlin", "Kafka", "Event Stream", "Redis", "MongoDB"));

        ArrayList<String> targetMarket2 = new ArrayList<>(Arrays.asList("Ecommerce", "ERP", "Loja fisica"));

        ArrayList<String> stack2 = new ArrayList<>(Arrays.asList("NodeJS", "MongoDB"));

        ArrayList<String> targetMarket3 = new ArrayList<>(Arrays.asList("Ecommerce", "Telecom", "Venda direta", "Mobile First", "Digital Onboarding"));

        ArrayList<String> stack3 = new ArrayList<>(Arrays.asList("Big Data Analytics", "Hadoop", "Kafka", "Pig", "Cassandra"));

        Product p1 = new Product("Gubee Integrador",
                "Ferramenta de integração para marketplaces",
                targetMarket1,
                stack1);

        Product p2 = new Product("Gubee Fretes",
                "Ferramenta para gestão e calculo de fretes",
                targetMarket2,
                stack2);

        Product p3 = new Product("Gubee AntiFraude",
                "Ferramenta especialistas em detecção e prevenção à fraude",
                targetMarket3,
                stack3);

        return Arrays.asList(p1, p2, p3);
    }
}