package com.daw.basket.data;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JugadorRepository extends JpaRepository<Jugador, Long>{

//    List<Jugador> findByNombre();
//
//    List<Jugador> findByNumCanastaTotalGreaterThanEqual(Integer numCanastasTotal);
//
//    List<Jugador> findByNumCanastaBetween(Integer min, Integer max);
}
