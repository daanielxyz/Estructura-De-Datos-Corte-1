package TallerCarrito;

public class Main {

    public static void main(String[] args) {

        Carrito<Producto> carrito = new Carrito<>();

        carrito.agregarProducto(new Producto("PC de mesa", 3400.0));
        carrito.agregarProducto(new Producto("Tarjeta grafica", 80500.0));
        carrito.agregarProducto(new Producto("Microfono USB", 1550.0));
        carrito.agregarProducto(new Producto("Camara WEB", 1600.0));

        System.out.println(carrito.getProductoMayorPrecio().toString());
        System.out.println(carrito.precioTotal());
    }
}
