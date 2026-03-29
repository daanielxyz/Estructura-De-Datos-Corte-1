package ParcialSupletorio_2026_1.Punto3;

import java.util.*;

public class GestionTienda {
    HashMap<String, List<String>> mapaOriginal;
    public HashMap<String, List<String>> getMapaOriginal() {
        return mapaOriginal;
    }
    public void setMapaOriginal(HashMap<String, List<String>> listaOriginal) {
        this.mapaOriginal = mapaOriginal;
    }

    public GestionTienda(HashMap<String, List<String>> mapaOriginal) {
        this.mapaOriginal = mapaOriginal;
    }
    Iterator<Map.Entry<String, List<String>>> iterator = mapaOriginal.entrySet().iterator();

    public TreeMap<String, Integer> ordenarPorCodigoYCantidadDeOrdenes(HashMap<String, List<String>> lista) {
        TreeMap<String, Integer> resultado = new TreeMap<>();
        Map.Entry<String, List<String>> entrada = iterator.next();
        while(iterator.hasNext()){
            resultado.put(entrada.getKey(), resultado.get(entrada.getValue().size()));
        }
        return resultado;
    }

    public Set<String> clientesHanComprado(HashMap<String, List<String>> lista){
        Set<String> resultado = new Set<>();
        Map.Entry<String, List<String>> entrada = iterator.next();
        while(iterator.hasNext()){
            resultado.add(entrada.getValue());
        }
        return resultado;
    }
}
