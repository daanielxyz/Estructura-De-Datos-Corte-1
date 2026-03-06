package TallerCarrito;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Carrito<T extends Producto> implements Iterable<T> {

    private List<T> productos=new ArrayList<>();

    public Carrito() {}

    public List<T> getProductos() {
        return productos;
    }

    public void setProductos(List<T> productos) {
        this.productos = productos;
    }

    public void agregarProducto(T producto) {
        productos.add(producto);
    }

    public T getProductoMayorPrecio(){
        Iterator<T> iterator=iterator();
        T productoMayor=iterator.next();
        while(iterator.hasNext()){
            T productoComparar=iterator.next();
            if(productoMayor.getPrecio()<productoComparar.getPrecio()){
                productoMayor=productoComparar;
            }
        }
        return productoMayor;
    }

    public Double precioTotal(){
        Iterator<T> iterator=iterator();
        Double total=0.0;
        while(iterator.hasNext()){
            T producto=iterator.next();
            total=total+producto.getPrecio();
        }
        return total;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            int index=0;

            @Override
            public boolean hasNext() {
                return index<productos.size();
            }

            @Override
            public T next() {
                return productos.get(index++);
            }
        };
    }
}
