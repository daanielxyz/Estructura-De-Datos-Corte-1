package TallerDeRecursividad.Dificiles;

public class RecorrerArreglo {

    /// Funcion que recorra un arreglo de forma recursiva
    public static void recorrerArreglo(int[] arr, int index){
        if (index >= arr.length) return;
        System.out.print(arr[index] + "");
        recorrerArreglo(arr, index + 1);
    }
}
