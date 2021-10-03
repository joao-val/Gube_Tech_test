package com.joaoval.gubee.demo;

import com.joaoval.gubee.demo.entity.Product;
import com.joaoval.gubee.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class GubeeTechApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;



	public static void main(String[] args) {
		SpringApplication.run(GubeeTechApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{

		ArrayList<String> targetMarket = new ArrayList<>();
		targetMarket.addAll(Arrays.asList("Ecommerce", "ERP", "Lojista que não desejam possuir ecommerce"));

		ArrayList<String> stack = new ArrayList<>();
		stack.addAll(Arrays.asList("Java 10", "Kotlin", "Kafka", "Event Stream", "Redis", "MongoDB"));

		Product p1 = new Product("Gubee Integrador",
				"Ferramenta de integração para marketplaces",
				targetMarket,
				stack);

		productRepository.saveAll(Arrays.asList(p1));

	}
}
