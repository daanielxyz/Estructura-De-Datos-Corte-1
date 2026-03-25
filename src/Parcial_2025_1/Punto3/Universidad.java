package Parcial_2025_1.Punto3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/// 3. (1.25) Ejercicio 3 Una universidad administra las notas finales de los estudiantes en un HashMap<String, Double>
/// donde la clave es el código del estudiante y el valor es la nota definitiva. Se necesita implementar un método
/// recursivo que, dado un HashMap<K, V> y un iterador de sus entradas, calcule el promedio de todas las notas
/// almacenadas en el mapa.
///
///     Condiciones:
///         Se debe usar Iterator<Map.Entry<K, V>>.
///
///         En cada llamada recursiva se debe procesar una sola entrada.
///
///         No se permiten ciclos (for, while, do-while).
///
///         El mapa no debe ser modificado durante el cálculo.
public class Universidad {
    public static <K, V extends Number> double promedio(HashMap<K, V> mapa) {
        if (mapa.isEmpty()) return 0.0;
        Iterator<Map.Entry<K, V>> iterator = mapa.entrySet().iterator();
        double suma = sumar(iterator);
        return suma / mapa.size();
    }

    private static <K, V extends Number> double sumar(Iterator<Map.Entry<K, V>> iterator) {
        if (!iterator.hasNext()) return 0.0;
        Map.Entry<K, V> entrada = iterator.next();
        return entrada.getValue().doubleValue() + sumar(iterator);
    }
}
