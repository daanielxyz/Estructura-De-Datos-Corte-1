package TallerGenericsYCollections.Punto4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Repositorio<T> implements Iterable{
    public List<T> getLista() {
        return lista;
    }

    public void setLista(List<T> lista) {
        this.lista = lista;
    }

    public Repositorio(List<T> lista) {
        this.lista = lista;
    }

    List<T> lista = new ArrayList<>();


    public void agregar(T elemento){
        lista.add(elemento);
    }

    public T obtener(int i){
        return lista.get(i);
    }

    @Override
    public Iterator<T> iterator(){
        return new Iterator<T>(){
            int index = 0;
            @Override
            public boolean hasNext(){
                return index < lista.size();
            }

            @Override
            public T next(){
                return lista.get(index++);
            }
        };
    }


    public Iterator<T> reverseIterator(){
        return new Iterator<T>(){
            int index = lista.size() - 1;

            public boolean hasNext(){
                return index <= 0;
            }

            public T next(){
                return lista.get(index--);
            }
        };
    }
}
