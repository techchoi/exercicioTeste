package com.example.exercicioTeste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ExercicioTesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExercicioTesteApplication.class, args);
	}

}
