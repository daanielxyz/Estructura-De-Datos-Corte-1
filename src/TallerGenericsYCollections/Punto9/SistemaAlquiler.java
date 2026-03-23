package TallerGenericsYCollections.Punto9;

import java.util.List;

public class SistemaAlquiler {

    public void alquilar(List<? extends Vehiculo> lista){
        for(Vehiculo v : lista){
            v.alquilar();
        }
    }
}
