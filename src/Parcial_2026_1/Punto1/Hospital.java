package Parcial_2026_1.Punto1;

///Un hospital administra la lista de pacientes en espera mediante un HashMap<Integer, String> que relaciona
///codigoPaciente -> nombrePaciente. El sistema necesita una función recursiva para buscar un paciente dado su código,
///recorriendo las entradas del HashMap una a una mediante un Iterator. Implementar un método recursivo que,
///dado un HashMap<K, V> y una clave K, retorne el valor V correspondiente si existe o null en caso contrario.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

///Nota: En cada llamada recursiva se debe avanzar el iterador en una única entrada. No se permite el uso de ciclos
/// (for, while, do-while). El mapa no debe ser modificado durante la búsqueda. Se debe usar un
/// Iterator<Map.Entry<K, V>> para recorrer el mapa.

public class Hospital<K,V> {
    public V buscar(K clave, HashMap<K, V> mapa){
        if(mapa.isEmpty()) return null;

        Iterator<Map.Entry<K,V>> iterator = mapa.entrySet().iterator();
        return buscarRecursivo(clave, iterator);
    }

    public V buscarRecursivo(K clave, Iterator<Map.Entry<K,V>> iterator){

        if(!iterator.hasNext()) return null;

        Map.Entry<K,V> entrada = iterator.next();
        if(entrada.getKey().equals(clave)){
            return entrada.getValue();
        } else{
            return buscarRecursivo(clave, iterator);
        }
    }
}
