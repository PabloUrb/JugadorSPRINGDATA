package com.daw.basket.data;

public class EstadisticasPosicion {

    private String posicion;
    private Double mediaCanastas;
    private Integer maxCanastas;
    private Integer minCanastas;
    private Double mediaAsistencias;
    private Integer maxAsistencias;
    private Integer minAsistencias;
    private Double mediaRebotes;
    private Integer maxRebotes;
    private Integer minRebotes;

    public EstadisticasPosicion(String posicion, Double mediaCanastas, Double mediaRebotes, Double mediaAsistencias) {
        this.posicion = posicion;
        this.mediaCanastas = mediaCanastas;
        this.mediaRebotes = mediaRebotes;
        this.mediaAsistencias = mediaAsistencias;
    }

    public EstadisticasPosicion(String posicion, Double mediaCanastas, Integer maxCanastas, Integer minCanastas, Double mediaAsistencias, Integer maxAsistencias, Integer minAsistencias, Double mediaRebotes, Integer maxRebotes, Integer minRebotes) {
        this.posicion = posicion;
        this.mediaCanastas = mediaCanastas;
        this.maxCanastas = maxCanastas;
        this.minCanastas = minCanastas;
        this.mediaAsistencias = mediaAsistencias;
        this.maxAsistencias = maxAsistencias;
        this.minAsistencias = minAsistencias;
        this.mediaRebotes = mediaRebotes;
        this.maxRebotes = maxRebotes;
        this.minRebotes = minRebotes;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Double getMediaCanastas() {
        return mediaCanastas;
    }

    public void setMediaCanastas(Double mediaCanastas) {
        this.mediaCanastas = mediaCanastas;
    }

    public Integer getMaxCanastas() {
        return maxCanastas;
    }

    public void setMaxCanastas(Integer maxCanastas) {
        this.maxCanastas = maxCanastas;
    }

    public Integer getMinCanastas() {
        return minCanastas;
    }

    public void setMinCanastas(Integer minCanastas) {
        this.minCanastas = minCanastas;
    }

    public Double getMediaAsistencias() {
        return mediaAsistencias;
    }

    public void setMediaAsistencias(Double mediaAsistencias) {
        this.mediaAsistencias = mediaAsistencias;
    }

    public Integer getMaxAsistencias() {
        return maxAsistencias;
    }

    public void setMaxAsistencias(Integer maxAsistencias) {
        this.maxAsistencias = maxAsistencias;
    }

    public Integer getMinAsistencias() {
        return minAsistencias;
    }

    public void setMinAsistencias(Integer minAsistencias) {
        this.minAsistencias = minAsistencias;
    }

    public Double getMediaRebotes() {
        return mediaRebotes;
    }

    public void setMediaRebotes(Double mediaRebotes) {
        this.mediaRebotes = mediaRebotes;
    }

    public Integer getMaxRebotes() {
        return maxRebotes;
    }

    public void setMaxRebotes(Integer maxRebotes) {
        this.maxRebotes = maxRebotes;
    }

    public Integer getMinRebotes() {
        return minRebotes;
    }

    public void setMinRebotes(Integer minRebotes) {
        this.minRebotes = minRebotes;
    }

    @Override
    public String toString() {
        return "EstadisticasPosicion{" +
                "posicion='" + posicion + '\'' +
                ", mediaCanastas=" + mediaCanastas +
                ", maxCanastas=" + maxCanastas +
                ", minCanastas=" + minCanastas +
                ", mediaAsistencias=" + mediaAsistencias +
                ", maxAsistencias=" + maxAsistencias +
                ", minAsistencias=" + minAsistencias +
                ", mediaRebotes=" + mediaRebotes +
                ", maxRebotes=" + maxRebotes +
                ", minRebotes=" + minRebotes +
                '}';
    }


}
