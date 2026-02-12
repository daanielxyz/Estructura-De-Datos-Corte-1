package TallerDeRecursividad.Dificiles;

public class DiagonalPrincipalDeMatriz2 {
    /// Funcion recursiva que recorre una matriz diagonal de arriba-derecha a abajo-izquierda
    public static void rDiagonal(int[][] matriz, int i){
        int n = matriz.length;
        if(i >= n) return;
        System.out.print(matriz[i][n-1-i] + "");
        rDiagonal(matriz, i+1);
    }
}
