package DivideYVenceras;

public class MaximoElementoArreglo {
    ///EJERCICIO: Dado un arreglo de n numeros enteros, diseñar un algoritmo
    ///           que encuentre su maximo elemento basado en la tecnica de
    ///           divide y venceras.


    ///inicio y fin son indices                     0       arr.length-1
    public static int encontrarMayor(int[] arr, int inicio, int fin){
        if(inicio==fin) return arr[inicio];
        if(fin==inicio + 1) return Math.max(arr[inicio], arr[fin]);

        int medio = (inicio + fin)/2;
        int mayorDerecha = encontrarMayor(arr, inicio, medio);
        int mayorIzquierda = encontrarMayor(arr, medio + 1, fin);

        return Math.max(mayorIzquierda, mayorDerecha);
    }
}
