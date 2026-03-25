package Parcial_2026_1.Punto4;

import java.util.Map;
import java.util.TreeMap;
import java.util.Stack;
/// 4. (1.25) Responda las siguientes preguntas:
///     a) ¿Qué salida produce el siguiente código?
public class Test {
        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();
            stack.push(10);
            stack.push(20);
            stack.push(30);
            int a = stack.pop();
            int b = stack.peek();
            stack.push(a + b);
            System.out.println(stack.pop());
            System.out.println(stack.peek());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        }
    }



    /// Respuesta: 50, 20, 20, 10
