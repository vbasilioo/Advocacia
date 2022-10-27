package br.com.apiexemplo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiExemploApplication {

	private static Logger logger = LoggerFactory.getLogger(ApiExemploApplication.class);

	public static void main(String[] args) {
		logger.info("Iniciando a api de cadastro!");
		SpringApplication.run(ApiExemploApplication.class, args);
		logger.info("API de cadastro iniciada e pronta para receber requisições!");
	}
}
