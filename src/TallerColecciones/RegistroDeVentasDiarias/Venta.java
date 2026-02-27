package TallerColecciones.RegistroDeVentasDiarias;

public class Venta {
    private String codigoProducto;
    private String nombreProducto;
    private int cantidadVendida;
    private double valorTotal;

    public Venta(String codigoProducto, String nombreProducto, int cantidadVendida, double valorTotal) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.cantidadVendida = cantidadVendida;
        this.valorTotal = valorTotal;
    }

    public String getCodigoProducto() { return codigoProducto; }
    public String getNombreProducto()  { return nombreProducto; }
    public int getCantidadVendida()    { return cantidadVendida; }
    public double getValorTotal()      { return valorTotal; }

    @Override
    public String toString() {
        return String.format("Código: %-6s | Producto: %-20s | Cantidad: %3d | Total: $%,.2f",
                codigoProducto, nombreProducto, cantidadVendida, valorTotal);
    }
}