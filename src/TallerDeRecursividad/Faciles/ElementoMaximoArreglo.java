package TallerDeRecursividad.Faciles;

public class ElementoMaximoArreglo {
    ///Funcion que encuentre el elemento maximo en un arreglo

    ///Version mia
    public static int maximo(int[] arr, int n){
        if (n==1) return arr[0];

        int maxResto = maximo(arr, n-1);
        return Math.max(arr[n-1], maxResto);
    }

    ///Version del profesor
    public static int obtenerMayorRecursivo(int[] arr){
        return obtenerMayorRecursivo(arr, 0, 0);
    }

    public static int obtenerMayorRecursivo(int[] arr, int mayor, int i){
        if(i == arr.length) return mayor;
        else{
            if (arr[i] >= mayor) return obtenerMayorRecursivo(arr, arr[i], i + 1);
            else{
                return obtenerMayorRecursivo(arr, mayor, i + 1);
            }
        }
    }
}
