package ParcialSupletorio_2026_1.Punto1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static java.util.Spliterators.iterator;

public class TallerMecanico {
    public boolean buscar(HashMap<String, List<Integer>> mapa, int monto) {
        if(mapa.isEmpty())return false;
        Iterator<Map.Entry<String, List<Integer>>> iterator = mapa.entrySet().iterator();
        return buscarRecursivo(iterator, monto);
    }

    public boolean buscarRecursivo(Iterator<Map.Entry<String, List<Integer>>> iterator, int monto) {
        if(!iterator.hasNext())return false;
        Map.Entry<String, List<Integer>> entrada = iterator.next();
        if(sumarRecursivo(entrada.getValue()) == monto){
            return true;
        } else {
            return buscarRecursivo(iterator, monto);
        }
    }

    public int sumarRecursivo(List<Integer> lista) {
        Iterator<Integer> it = iterator();
        Integer total = 0;
        while (it.hasNext()) {
            Integer valor = it.next();
            total += valor;
        }
        return total;
    }
}
