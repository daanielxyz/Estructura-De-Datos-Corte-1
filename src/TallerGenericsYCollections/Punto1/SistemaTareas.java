package TallerGenericsYCollections.Punto1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SistemaTareas<T> {

    public List<Tarea<T>> tareas = new ArrayList<>();

    public void agregar(Tarea<T> tarea){
        tareas.add(tarea);
    }

    public List<Tarea<T>> tareasPorPrioridad(int p){
        List<Tarea<T>> resultado = new ArrayList<>();
        for(Tarea<T> t : tareas){
            if(t.getPrioridad() == p){
                resultado.add(t);
            }
        }
        return resultado;
    }

    public void mostrarPorFecha(){
        List<Tarea<T>> ordenadas = new  ArrayList<>(tareas);
        Collections.sort(ordenadas, (a, b) -> a.getFechaVencimiento().compareTo(b.getFechaVencimiento()));
        for(Tarea<T> t : ordenadas){
            System.out.println(t);
        }
    }


}
