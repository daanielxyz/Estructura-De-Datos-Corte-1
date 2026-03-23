package TallerGenericsYCollections.Punto9;

public class Vehiculo {

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public String marca;

    public void alquilar(){
        System.out.println("alquilando...");
    }
}
