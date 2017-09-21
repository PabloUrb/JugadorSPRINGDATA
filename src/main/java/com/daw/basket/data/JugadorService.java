package com.daw.basket.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class JugadorService {

        @Autowired
        private JugadorRepository jugadorRepository;


        public void testJugador(){
            Jugador Pablo = new Jugador("pablo", LocalDate.of(1998, 9, 16), 8,8,8, "base");
            jugadorRepository.save(Pablo);
            Jugador Pau = new Jugador("Pau", LocalDate.of(1996, 3, 8), 7,   7,7, "base");
            jugadorRepository.save(Pau);
            Jugador Gonzalo = new Jugador("Gonzalo", LocalDate.of(1995, 4, 2), 6,6,6, "pivot");
            jugadorRepository.save(Gonzalo);
            Jugador Clara = new Jugador("Clara", LocalDate.of(1997, 1, 1), 5,5,5, "pivot");
            jugadorRepository.save(Clara);
            Jugador Kelvin = new Jugador("Kelvin", LocalDate.of(1989, 12, 6), 4,4,4, "pivot");
            jugadorRepository.save(Kelvin);

    //a
            System.out.println("===============================================================================================================================================================================================================================================================================================================");
            System.out.println("jugadores que empieza por pab");
            System.out.println(jugadorRepository.findByNombreContaining("pab"));
            System.out.println("===============================================================================================================================================================================================================================================================================================================");
    //b
            System.out.println("canastas mayores que 8");
            System.out.println(jugadorRepository.findByNumCanastasGreaterThanEqual(7));
            System.out.println("===============================================================================================================================================================================================================================================================================================================");
    //c
            System.out.println("jugadores que su asistencias son entre 1 y 3");
            System.out.println(jugadorRepository.findByNumAsistenciasBetween(1,3));
            System.out.println("===============================================================================================================================================================================================================================================================================================================");
    //d
            System.out.println("jugadores que su posicion empieza por ba");
            System.out.println(jugadorRepository.findByPosicionContaining("ba"));
            System.out.println("===============================================================================================================================================================================================================================================================================================================");
    //e
            System.out.println("jugadores anteriores al 1995/11/1");
            System.out.println(jugadorRepository.findByFechaNacimientoBefore(LocalDate.of(1995,11,1)));
            System.out.println("===============================================================================================================================================================================================================================================================================================================");
    //f
            System.out.println("");
            System.out.println(jugadorRepository.AvgCanastasAndAvgAndNumAsistenciasAndNumRebotesGroupBOrderByPosicion());
            System.out.println("===============================================================================================================================================================================================================================================================================================================");
    //g
            System.out.println("");
            System.out.println(jugadorRepository.AvgCanastasAndMaxCanastasAndMinCanastasAndAvgNumAsistenciasAndMaxAsistenciasAndMinAsistenciasAndNumRebotesAndMaxRebotesAndMinRebotesGroupBOrderByPosicion());
            System.out.println("===============================================================================================================================================================================================================================================================================================================");

        }
        }
