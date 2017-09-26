package com.daw.basket.data;

import com.daw.basket.data.Service.EquipoService;
import com.daw.basket.data.Service.JugadorService;
import entidades.Jugador;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataApplication.class, args);
		context.getBean(JugadorService.class).testJugador();
		EquipoService equipoService = context.getBean(EquipoService.class);

		EquipoService.testEquipo();
		JugadorService.testJugador();

	}
}
