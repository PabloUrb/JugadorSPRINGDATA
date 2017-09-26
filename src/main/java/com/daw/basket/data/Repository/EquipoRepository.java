package com.daw.basket.data.Repository;

import com.daw.basket.data.entidades.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipoRepository extends JpaRepository<Equipo, Long> {

    List<Equipo> findByLocalidadContaining(String nombre);
}
