package ParcialSupletorio_2026_1.Punto4;

import java.util.Stack;

public class rotarSegmento {
    public Stack<Integer> rotarSegmento(Stack<Integer> s, int inicio, int fin){
        Stack<Integer> aux = new Stack<>();
        Stack<Integer> aux2 = new Stack<>();
        Stack<Integer> aux3 = new Stack<>();
        Stack<Integer> resultado = new Stack<>();


        while(!s.isEmpty()){
            aux.push(s.pop());
        }

        int pos = 0;
        while(!aux.isEmpty()){
            int elemento = aux.pop();
            if(pos >= inicio && pos <= fin){
                aux2.push(elemento);
            }
        }

        while(!aux2.isEmpty()){
            aux3.push(aux2.pop());
        }

        int pos2 = 0;
        while(!aux3.isEmpty()||!aux.isEmpty()){
            if(pos2>=inicio && pos2<=fin){
                resultado.push(aux3.pop());
            } else{
                resultado.push(aux.pop());
            }
        }
        return resultado;
    }
}
