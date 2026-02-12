package TallerDeRecursividad.Faciles;

public class ContarDigitosDeUnNumero {

    /// Funcion que cuente cuantos digitos tiene un numero
    public static int contar(int n){
        if (n<10) return 1;
        return 1 + contar(n/10);
    }
}
