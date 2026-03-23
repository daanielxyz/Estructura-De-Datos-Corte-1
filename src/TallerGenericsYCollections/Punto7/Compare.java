package TallerGenericsYCollections.Punto7;

public class Compare implements Comparador<String>{ // ó <Integer> para el segundo ej que puse{

@Override
public int comparar(String x, String y){
    if (x.length() < y.length()) return -1;
    if (x.length() == y.length()) return 0;
    if (x.length() > y.length()) return 1;
    else{
        return 0;
    }


//Asumiendo que es una clase aparte
    //@Override
    //public int comparar(Integer x, Integer y){
    //  if (x < y) return -1;
    //  if (x.equals(y)) return 0;
    //  if (x > y) return 1;
    //  else{
    //      return 0;
    //  }
    }
}

