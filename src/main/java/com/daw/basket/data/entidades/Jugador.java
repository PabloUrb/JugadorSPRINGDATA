package com.daw.basket.data.entidades;

import javax.persistence.*;

import java.time.LocalDate;

@Entity
public class Jugador {
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private Integer numCanastas;
    private Integer numRebotes;
    private Integer numAsistencias;
    private String posicion;

    @ManyToOne
    private Equipo equipo;
    public Jugador() {
    }

    public Jugador(String nombre, LocalDate fechaNacimiento, Integer numCanastas, Integer numRebotes, Integer numAsistencias, String posicion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.numCanastas = numCanastas;
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

    public Integer getNumCanastas() {
        return numCanastas;
    }

    public void setNumCanastas(Integer numCanastas) {
        this.numCanastas = numCanastas;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Equipo getEquipo() {return equipo;}

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", numCanastas=" + numCanastas +
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
        if (!fechaNacimiento.equals(jugador.fechaNacimiento)) return false;
        if (!numCanastas.equals(jugador.numCanastas)) return false;
        if (!numRebotes.equals(jugador.numRebotes)) return false;
        if (!numAsistencias.equals(jugador.numAsistencias)) return false;
        return posicion.equals(jugador.posicion);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + nombre.hashCode();
        result = 31 * result + fechaNacimiento.hashCode();
        result = 31 * result + numCanastas.hashCode();
        result = 31 * result + numRebotes.hashCode();
        result = 31 * result + numAsistencias.hashCode();
        result = 31 * result + posicion.hashCode();
        return result;
    }

}
