package TallerGenericsYCollections.Punto1;

import java.util.Date;

public class Tarea<T> {
    public int prioridad;
    public String descripcion;
    public Date fechaVencimiento;
    public T dato;

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Tarea(int prioridad, String descripcion, Date fechaVencimiento, T dato) {
        this.prioridad = prioridad;
        this.descripcion = descripcion;
        this.fechaVencimiento = fechaVencimiento;
        this.dato = dato;
    }









}
