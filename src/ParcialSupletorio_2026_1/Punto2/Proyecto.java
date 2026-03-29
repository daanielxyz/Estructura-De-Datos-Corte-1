package ParcialSupletorio_2026_1.Punto2;

import java.time.LocalDate;

public class Proyecto implements Comparable<Proyecto>{

    @Override
    public int compareTo(Proyecto otro) {
        if(this.fechaEntrega == otro.fechaEntrega) return this.prioridad.compareTo(otro.prioridad);
        if(this.prioridad == otro.prioridad) return this.fechaEntrega.compareTo(otro.fechaEntrega);
        return this.prioridad.compareTo(otro.prioridad);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Proyecto(String nombre, int prioridad, LocalDate fechaEntrega, int costo) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.fechaEntrega = fechaEntrega;
        this.costo = costo;
    }

    String nombre;
    int prioridad;
    LocalDate fechaEntrega;
    int costo;
}
