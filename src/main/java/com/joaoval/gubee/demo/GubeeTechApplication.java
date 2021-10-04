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

		productRepository.saveAll(Arrays.asList(p1, p2, p3));
	}
}