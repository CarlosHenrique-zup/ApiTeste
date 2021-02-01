package br.com.zup.estrelas.marvel.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiMarvelFeignApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApiMarvelFeignApplication.class, args);
	}
}
