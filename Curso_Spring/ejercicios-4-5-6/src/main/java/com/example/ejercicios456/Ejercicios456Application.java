package com.example.ejercicios456;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Ejercicios456Application implements CommandLineRunner {

	@Autowired
	private LaptopRepository laptopRepository;
	public static void main(String[] args) {

		SpringApplication.run(Ejercicios456Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LaptopModel laptop1 = new LaptopModel(null,"Dell", "XPS 13");
		LaptopModel laptop2 = new LaptopModel(null,"Lenovo", "ThinkPad X1 Carbon");
		laptopRepository.saveAll(Arrays.asList(laptop1, laptop2));
	}

}
