package Parcial_2026_1.Bonificacion;

import java.util.Stack;

public class StackExtract {
    public Stack<Integer> extractStack(Stack<Integer> s, int i, int j) {
        Stack<Integer> aux = new Stack<>();
        Stack<Integer> resultado = new Stack<>();

        while(!s.isEmpty()){
            aux.push(s.pop());
        }

        int contador = 0;
        while(!aux.isEmpty()){
            int elemento = aux.pop();
            if(contador >= i && contador <=j){
                resultado.push(elemento);
            } else{
                s.push(elemento);
            }
            contador++;
        }
        return resultado;
    }
}
