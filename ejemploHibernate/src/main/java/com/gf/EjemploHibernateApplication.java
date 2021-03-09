package com.gf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication (scanBasePackages={"com.gf"})

public class EjemploHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjemploHibernateApplication.class, args);
	}

}
