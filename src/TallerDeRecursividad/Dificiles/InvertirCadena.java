package TallerDeRecursividad.Dificiles;

public class InvertirCadena {
    /// Funcion que invierta una cadena
    public static String invertir(String s){
        if (s.isEmpty()) return "";
        return s.charAt(s.length()-1) + invertir (s.substring(0, s.length()-1));
    }
}
