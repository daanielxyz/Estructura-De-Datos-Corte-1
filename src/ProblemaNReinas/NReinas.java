package ProblemaNReinas;

public class NReinas {
    ///Dado un tablero de ajedrez n*n, colocar n reinas en el tablero de manera que ninguna amenace a otra.
    ///El objetivo es encontrar todas las configuraciones posibles del tablero donde el enunciado anterior sea posible.

    ///Entrada: Un numero entero n>=1 que representa el tamaño del tablero
    ///Salida: Una lista de configuraciones posibles del tablero donde cada configuracion muestra la posicion de
    ///        las reinas en el tablero, o un mensaje indicando que no hay solucion.

    private int n;
    private int[] tablero;

    public NReinas(int n){
        this.n = n;
        this.tablero = new int[n];
    }

    private boolean esSeguro(int fila, int col){
        for(int i = 0; i < fila; i++){
            int colReina = tablero[i];
            if(colReina == col) return false;
            if (Math.abs(colReina - col) == Math.abs(i-fila)) return false;
        }
        return true;
    }

    private boolean resolver(int fila){
        if (fila == n) return true;
        for (int col = 0; col < n; col++){
            if (esSeguro(fila,col)){
                tablero[fila] = col;
                if (resolver(fila + 1)) return true;
            }
        }
        return false;
    }

    private void imprimirTablero(){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (tablero[i] == j){
                    System.out.print("Q");
                } else {
                    System.out.print(".");
                }
            }
        }
        System.out.println();
    }

    public void resolverNReinas(){
        if (resolver(0)){
            System.out.println("Solucion encontrada: ");
            imprimirTablero();
        } else {
            System.out.println("No Solucion encontrada");
        }
    }
}
