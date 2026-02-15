package com.CloneNike.Shoes_API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class ShoesApiApplication {

	public static void main(String[] args) {
		Dotenv dot = Dotenv.configure().ignoreIfMissing().ignoreIfMissing().load();

		dot.entries().forEach(ent -> System.setProperty(ent.getKey(), ent.getValue()));
		
		SpringApplication.run(ShoesApiApplication.class, args);
	}

}
