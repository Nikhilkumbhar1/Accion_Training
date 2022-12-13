package com.accion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class EmpCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpCrudApplication.class, args);
	}

}
