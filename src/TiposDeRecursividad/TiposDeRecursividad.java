package TiposDeRecursividad;

public class TiposDeRecursividad {

    ///Recursividad directa: Una funcion se llama a si misma directamente
    public static int sumaDirecta(int n){
        if (n==0) return 0;
        return n + sumaDirecta(n-1);
    }

    ///Recursividad indirecta: Una funcion X llama a otra funcion Y, y Y termina llamando a X
    public static int funcionA(int n){
        if (n==0) return 0;
        return n + funcionB(n-1);
    }
    public static int funcionB(int n){
        if (n==0) return 0;
        return funcionA(n);
    }

    ///Recursividad lineal: Cada llamada recursiva tiene solo una llamada adicional
    public static int factorial (int n){
        if (n<=1) return 1;
        return n*factorial(n-1);
    }

    ///Recursivdad multiple: Cada llamada recursiva genera multiples llamadas adicionales
    public static int fibonacci (int n){
        if (n<=1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    ///Recursividad de cola: La llamada recursiva es la ultima operacion que realiza la funcion
    public static int sumaConAcomulador(int n, int acu){
        if (n==0) return acu;
        return sumaConAcomulador(n-1, acu+n);
    }

    ///Recursividad no de cola: La llamada recursiva no es la ultima operacion, hay operaciones despues de la llamada
    public static int suma(int n){
        if (n==0) return 0;
        return n + suma(n-1);
    }
}
