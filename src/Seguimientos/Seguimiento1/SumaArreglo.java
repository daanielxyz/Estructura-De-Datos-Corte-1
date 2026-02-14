package Seguimientos.Seguimiento1;

public class SumaArreglo {
    public static int suma(int[] arr, int inicio, int fin) {
        // Caso base: solo hay un elemento
        if (inicio == fin) {
            return arr[inicio];
        }

        // Dividir en dos mitades
        int medio = (inicio + fin) / 2;

        // Conquistar: sumar cada mitad recursivamente
        int sumaIzquierda = suma(arr, inicio, medio);
        int sumaDerecha = suma(arr, medio + 1, fin);

        // Combinar: retornar la suma de ambas mitades
        return sumaIzquierda + sumaDerecha;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(suma(arr, 0, arr.length - 1)); // 15
    }
}