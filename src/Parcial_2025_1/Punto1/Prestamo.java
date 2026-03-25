package Parcial_2025_1.Punto1;
import java.time.LocalDate;

///1. (1.25) Ejercicio 1: Un sistema de biblioteca digital administra préstamos de distintos tipos de material (Libro, Revista, Tesis).
///
/// a) (0.25) Implemente una clase Prestamo<K, V> genérica donde:
///     K es el identificador del préstamo (String, UUID, etc.).
///     V es el tipo de material prestado.
///
/// b) (0.25) La clase debe tener:
///
///     K getId()
///     V getMaterial()
///     localDate getFechaDevolucion()
///
/// c) (0.5) Cree una clase GestorPrestamos<K, V> que permita agregar y consultar préstamos por su clave.
///
/// d) (0.25) Explique cómo los genéricos permiten reutilizar Prestamo para distintos tipos de materiales sin duplicar código.

public class Prestamo<K,V> {
    public K identificador;
    public V material;
    public LocalDate fechaDevolucion;

    public Prestamo(K identificador, V material, LocalDate fechaDevolucion){
        this.identificador = identificador;
        this.material = material;
        this.fechaDevolucion = fechaDevolucion;
    }

    public K getId(){
        return identificador;
    }

    public V getMaterial(){
        return material;
    }

    public LocalDate getFechaDevolucion(){
        return fechaDevolucion;
    }
}
