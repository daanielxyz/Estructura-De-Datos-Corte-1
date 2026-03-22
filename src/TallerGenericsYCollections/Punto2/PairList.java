package TallerGenericsYCollections.Punto2;

import java.util.ArrayList;
import java.util.List;

public class PairList<K,V>{

    public List<Par<K,V>> lista = new ArrayList<>();

    public void agregar(K clave, V valor){
        lista.add(new Par<>(clave, valor));
    }

    public boolean eliminar(K clave){
        for(Par<K,V> par : lista){
            if(par.getKey().equals(clave)){
                lista.remove(par);
                return true;
            }
        }
        return false;
    }

    public Par<K,V> obtenerPar(K clave){
        for (Par<K,V> par : lista){
            if(par.getKey().equals(clave)){
                return par;
            } else{
                System.out.println("No se encontro");
            }
        }
        return null;
    }
}
