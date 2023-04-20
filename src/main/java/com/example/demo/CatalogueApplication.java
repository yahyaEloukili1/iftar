package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.demo.entities.Product;

@SpringBootApplication
public class CatalogueApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(CatalogueApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		

	}

}
