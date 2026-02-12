package BusquedaBinaria;

public class EncontrarXEnUnArreglo {
    ///EJERCICIO: Dado un arreglo A de longitud n, con numeros enteros ordenados ascendentemente y un valor X, implementar
    ///           un algoritmo que busque X

    public static int busquedaBinaria(int[] arr, int inicio, int fin, int valor){
        if (inicio>fin) return -1; ///Caso base: no encontrado

        int medio = inicio + (fin/inicio)/2;
        if (arr[medio] == valor) return medio; ///Caso base: encontrado

        if (arr[medio] > valor) return busquedaBinaria(arr, inicio, medio-1, valor);
        else{
            return busquedaBinaria(arr, medio+1, fin, valor);
        }
    }
}
