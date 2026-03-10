package CarritoEcommerce;

public class Main {

    public static void main(String[] args) {

        Carrito<Producto> carrito = new Carrito<>();

        carrito.agregarProducto(new Producto("Laptop", 3500.0));
        carrito.agregarProducto(new Producto("Mouse", 80000.0));
        carrito.agregarProducto(new Producto("Teclado", 150.0));
        carrito.agregarProducto(new Producto("Monitor", 1200.0));

        System.out.println(carrito.getProductoMayorPrecio().toString());
        System.out.println(carrito.precioTotal());


    }
}
