package TallerDeRecursividad.Faciles;

public class CalcularBaseExp {

    /// Funcion recursiva que calcule base^exp
    public static int potencia(int base, int exp){
        if (exp==0) return 1;
        return base*potencia(base, exp-1);
    }
}
