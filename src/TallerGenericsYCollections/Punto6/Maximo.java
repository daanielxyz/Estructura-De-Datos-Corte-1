package TallerGenericsYCollections.Punto6;
import java.util.List;

public class Maximo {
    public <T extends Comparable<T>> T maximo(List<T> lista) throws Exception{
        if(lista.isEmpty()){
            throw new Exception("Lista vacia");
        }

        T elemento = lista.get(0);

        for(T e : lista){
            if(e.compareTo(elemento) > 0)
                elemento = e;
        }
        return elemento;
    }
}
