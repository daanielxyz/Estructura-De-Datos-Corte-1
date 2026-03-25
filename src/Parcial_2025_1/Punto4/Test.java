import java.util.*;
/// 4. (1.25) Responda las siguientes preguntas:
///     a) ¿Qué salida produce el siguiente código?
public class Test {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new TreeMap<>();
        mapa.put(3, "C");
        mapa.put(1, "A");
        mapa.put(2, "B");
        for (Integer k : mapa.keySet()) {
            System.out.print(k + " ");
        }
    }



    /// Respuesta: 1,2,3
}