package com.daw.basket.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class JugadorService {

        @Autowired
        private JugadorRepository jugadorRepository;


        public void testJugador(){
            Jugador pablo = new Jugador("pablo", LocalDate.of(1998, 9, 16), 8,8,8, "base");


            jugadorRepository.save(pablo);
            }
        }
