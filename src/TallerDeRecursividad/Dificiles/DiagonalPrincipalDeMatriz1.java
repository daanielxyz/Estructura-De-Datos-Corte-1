package TallerDeRecursividad.Dificiles;

public class DiagonalPrincipalDeMatriz1 {
    /// Funcion que recorre una matriz diagonal de arriba-izquierda a abajo-derecha
    public static void rDiagonal(int[][] matriz, int i){
        if (i >= matriz.length || i >= matriz[0].length){
            return;
        }
        System.out.print(matriz[i][i] + "");
        rDiagonal(matriz, i+1);
    }
}
