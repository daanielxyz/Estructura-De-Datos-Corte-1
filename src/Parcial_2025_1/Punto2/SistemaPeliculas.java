package Parcial_2025_1.Punto2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/// 2. (1.25) Ejercicio 2
/// La empresa CinePlus administra un catálogo de películas que se utilizan en sus diferentes salas. Cada película tiene un título,
/// un año de estreno, una duración en minutos y una calificación promedio de los usuarios. Se requiere lo siguiente:
///     Definir una clase Pelicula con los atributos mencionados.
///
///     El sistema debe poder ordenar las películas de forma predeterminada según el título en orden alfabético. (Nota manuscrita: Comparable)
///
///     Además, en ciertos reportes se necesita ordenar la lista de películas: (Nota manuscrita: Comparator)
///         Por año de estreno (más recientes primero).
///         Por calificación (de mayor a menor).
///         Por duración (de menor a mayor).
///
///
public class SistemaPeliculas {
    public List<Pelicula> peliculas = new ArrayList<>();

    public void agregar(Pelicula pelicula){
        peliculas.add(pelicula);
    }

    public void ordenarPorTitulo(){
        Collections.sort(peliculas);
    }

    public void ordenarPorEstreno(){
        Collections.sort(peliculas, new Comparator<Pelicula>(){
            @Override
            public int compare(Pelicula a, Pelicula b){
                return b.getEstreno() - a.getEstreno();
            }
        });
    }

    public void ordenarPorDuracion(){
        Collections.sort(peliculas, new Comparator<Pelicula>(){
            @Override
            public int compare(Pelicula a, Pelicula b){
                return a.getDuracion() - b.getDuracion();
            }
        });
    }

    public void ordenarPorCalificacion(){
        Collections.sort(peliculas, new Comparator<Pelicula>(){
            @Override
            public int compare(Pelicula a, Pelicula b){
                return a.getCalificacion() - b.getCalificacion();
            }
        });
    }
}
