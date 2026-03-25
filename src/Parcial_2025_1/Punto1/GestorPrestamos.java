package Parcial_2025_1.Punto1;

import java.util.HashMap;
import java.util.Map;

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

public class GestorPrestamos<K,V> {

    public Map<K, Prestamo<K,V>> prestamos = new HashMap<>();

    public void agregar(Prestamo<K,V> prestamo){
        prestamos.put(prestamo.getId(), prestamo);
    }

    public Prestamo<K,V> consultar(K clave){
        return prestamos.get(clave);
    }

    ///Explicacion punto d)
    ///Al prestamo recibir cualquier tipo de dato como Clave y como valor, se puede reutilizar para cualquier tipo de material sin
    /// tener que hacer otro codigo con el tipo de dato especifico para cada tipo de material
}
