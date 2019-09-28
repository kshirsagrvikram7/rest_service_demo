package com.vksagar.restservicedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class RestservicedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestservicedemoApplication.class, args);
	}

}
