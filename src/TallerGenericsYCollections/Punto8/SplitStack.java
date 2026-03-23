package TallerGenericsYCollections.Punto8;
import TallerGenericsYCollections.Punto2.Par;

import java.util.Stack;

public class SplitStack {
    public Par<Stack<Integer>, Stack<Integer>> splitStack(Stack<Integer> s, int i){

        Stack<Integer> aux = new Stack<>();
        Stack<Integer> par2 = new Stack<>();

        int posicion = s.size()-1;
        while(posicion > i){
            aux.push(s.pop());
            posicion--;
        }

        while(!aux.isEmpty()){
            par2.push(aux.pop());
        }


        Par<Stack<Integer>, Stack<Integer>> resultado = new Par<>(s, par2);
        return resultado;

    }
}
