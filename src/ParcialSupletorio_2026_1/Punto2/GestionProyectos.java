package ParcialSupletorio_2026_1.Punto2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GestionProyectos {
    public void ordenarPorCosto(List<Proyecto> lista){
        Collections.sort(lista, new Comparator<Proyecto>() {
            @Override
            public int compare(Proyecto p1, Proyecto p2) {
                return p2.getCosto() - p1.getCosto();
            }
        });
    }
}
