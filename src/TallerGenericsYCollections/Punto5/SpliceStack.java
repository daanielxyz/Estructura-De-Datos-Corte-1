package TallerGenericsYCollections.Punto5;
import java.util.Stack;

public class SpliceStack {
    public Stack<Integer> spliceStack(Stack<Integer> s, int i, int j) {
        Stack<Integer> aux = new Stack<>();
        Stack<Integer> resultado = new Stack<>();

        while (!s.isEmpty()) {
            aux.push(s.pop());
        }

        int posicion = 0;
        while (!aux.isEmpty()) {
            if (posicion >= i && posicion < j) {
                resultado.push(aux.pop());
            } else {
                s.push(aux.pop());
            }
            posicion++;
        }
        return resultado;
    }
}
