package com.daw.basket.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.security.auth.login.Configuration;

@SpringBootApplication
public class DataApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataApplication.class, args);
		context.getBean(JugadorService.class).testJugador();

	}
}
