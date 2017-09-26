package com.daw.basket.data.Repository;
import com.daw.basket.data.EstadisticasPosicion;
import entidades.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface JugadorRepository extends JpaRepository<Jugador, Long>{

    List<Jugador> findByNombreContaining(String nombre);

    List<Jugador> findByNumCanastasGreaterThanEqual(Integer numCanastas);

    List<Jugador> findByNumCanastasBetween(Integer min, Integer max);

    List<Jugador> findByPosicionContaining(String posicion);

    List<Jugador> findByNumAsistenciasBetween(Integer min,  Integer max);

    List<Jugador> findByFechaNacimientoBefore(LocalDate fecha);

    @Query("select new com.daw.basket.data.EstadisticasPosicion (j.posicion, avg(j.numCanastas), avg(j.numAsistencias), avg(j.numRebotes)) " +
            "from Jugador j group by j.posicion")
    List<EstadisticasPosicion> Medias();

    @Query("select new com.daw.basket.data.EstadisticasPosicion " +
            "(j.posicion, avg(j.numCanastas), max(j.numCanastas), min(j.numCanastas)," +
            " avg(j.numAsistencias), max(j.numAsistencias), min(j.numAsistencias)," +
            " avg(j.numRebotes), max(j.numRebotes), min(j.numRebotes)) " +
            " from Jugador j group by j.posicion")
    List<EstadisticasPosicion> EstadisticasCompletas();

    List<Jugador>findByEquipoNombre(String nombre);


}
