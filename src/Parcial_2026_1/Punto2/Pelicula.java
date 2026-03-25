package Parcial_2026_1.Punto2;

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

public class Pelicula implements Comparable<Pelicula>{

    public String titulo;
    public int estreno;
    public int duracion;
    public int calificacion;

    public Pelicula(String titulo, int estreno, int duracion, int calificacion) {
        this.titulo = titulo;
        this.estreno = estreno;
        this.duracion = duracion;
        this.calificacion = calificacion;
    }

    @Override
    public int compareTo(Pelicula otra){
        return this.titulo.compareTo(otra.titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEstreno() {
        return estreno;
    }

    public void setEstreno(int estreno) {
        this.estreno = estreno;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
