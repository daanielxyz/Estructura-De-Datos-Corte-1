package TallerDeRecursividad.Dificiles;

public class RecorrerMatriz {
    /// Funcion que recorra una matriz de forma recursiva
    public static void recorrerMatriz(int[][] matriz, int fila, int col){
        if (fila >= matriz.length) return;
        if (col >= matriz[fila].length){
            System.out.println();
            recorrerMatriz(matriz, fila + 1, 0);
            return;
        }
        System.out.print(matriz[fila][col] + " ");
        recorrerMatriz(matriz, fila, col + 1);
    }
}
