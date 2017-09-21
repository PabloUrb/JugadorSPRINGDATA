package com.daw.basket.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Jugador {
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private LocalDate fecha_nacimiento;
    private Integer numCanasta;
    private Integer numRebotes;
    private Integer numAsistencias;
    private String posicion;


    public Jugador(String nombre, LocalDate fecha_nacimiento, Integer numCanasta, Integer numRebotes, Integer numAsistencias, String posicion) {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.numCanasta = numCanasta;
        this.numRebotes = numRebotes;
        this.numAsistencias = numAsistencias;
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Integer getNumAsistencias() {
        return numAsistencias;
    }

    public void setNumAsistencias(Integer numAsistencias) {
        this.numAsistencias = numAsistencias;
    }

    public Integer getNumRebotes() {
        return numRebotes;
    }

    public void setNumRebotes(Integer numRebotes) {
        this.numRebotes = numRebotes;
    }

    public Integer getNumCanasta() {
        return numCanasta;
    }

    public void setNumCanasta(Integer numCanasta) {
        this.numCanasta = numCanasta;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", numCanasta=" + numCanasta +
                ", numRebotes=" + numRebotes +
                ", numAsistencias=" + numAsistencias +
                ", posicion='" + posicion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jugador jugador = (Jugador) o;

        if (!id.equals(jugador.id)) return false;
        if (!nombre.equals(jugador.nombre)) return false;
        if (!fecha_nacimiento.equals(jugador.fecha_nacimiento)) return false;
        if (!numCanasta.equals(jugador.numCanasta)) return false;
        if (!numRebotes.equals(jugador.numRebotes)) return false;
        if (!numAsistencias.equals(jugador.numAsistencias)) return false;
        return posicion.equals(jugador.posicion);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + nombre.hashCode();
        result = 31 * result + fecha_nacimiento.hashCode();
        result = 31 * result + numCanasta.hashCode();
        result = 31 * result + numRebotes.hashCode();
        result = 31 * result + numAsistencias.hashCode();
        result = 31 * result + posicion.hashCode();
        return result;
    }

}
