package com.daw.basket.data.Repository;

import com.daw.basket.data.EstadisticasPosicion;
import entidades.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface EquipoRepository extends JpaRepository<Equipo, Long> {

    List<Equipo> findByLocalidadContaining(String nombre);
}
