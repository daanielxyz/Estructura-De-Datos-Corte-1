package TallerDeRecursividad.Faciles;

public class SumarDigitosDeUnNumero {
    /// Funcion que suma todos los digitos individuales de un numero
    public static int sumarDigitos(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumarDigitos(n / 10);
    }
}
