package TallerColecciones.RegistroDeVentasDiarias;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class RegistroVentas {

    static HashMap<String, Venta> mapaHash   = new HashMap<>();
    static LinkedHashMap<String, Venta> mapaLinked = new LinkedHashMap<>();
    static TreeMap<String, Venta> mapaTree   = new TreeMap<>();

    static void registrarVenta(String codigo, String nombre, int cantidad, double total) {
        Venta venta = new Venta(codigo, nombre, cantidad, total);
        mapaHash.put(codigo, venta);
        mapaLinked.put(codigo, venta);
        mapaTree.put(codigo, venta);
        System.out.println("✔ Registrada: " + codigo + " - " + nombre);
    }

    static void consultarVenta(String codigo) {
        System.out.println("\n--- Consultando código: " + codigo + " ---");
        Venta resultado = mapaHash.get(codigo);
        if (resultado != null) {
            System.out.println("✔ Encontrado → " + resultado);
        } else {
            System.out.println("✘ No existe producto con código: " + codigo);
        }
    }

    static void mostrarTodasLasVentas() {
        System.out.println("\n╔══════════════════════════════════╗");
        System.out.println("║  HASHMAP - orden no garantizado  ║");
        System.out.println("╚══════════════════════════════════╝");
        mapaHash.forEach((c, v) -> System.out.println(v));

        System.out.println("\n╔══════════════════════════════════╗");
        System.out.println("║  LINKEDHASHMAP - orden inserción ║");
        System.out.println("╚══════════════════════════════════╝");
        mapaLinked.forEach((c, v) -> System.out.println(v));

        System.out.println("\n╔══════════════════════════════════╗");
        System.out.println("║  TREEMAP - orden alfabético      ║");
        System.out.println("╚══════════════════════════════════╝");
        mapaTree.forEach((c, v) -> System.out.println(v));
    }

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║   REGISTRO DE VENTAS DIARIAS     ║");
        System.out.println("╚══════════════════════════════════╝\n");

        registrarVenta("P003", "Arroz x 1kg",        10,  45000.0);
        registrarVenta("P001", "Leche entera",        25,  87500.0);
        registrarVenta("P005", "Pan tajado",           8,  24000.0);
        registrarVenta("P002", "Aceite de cocina",    15, 120000.0);
        registrarVenta("P004", "Azúcar x 2kg",        12,  54000.0);

        consultarVenta("P002");
        consultarVenta("P099");

        mostrarTodasLasVentas();

        System.out.println("\n╔══════════════════════════════════════════════════════════╗");
        System.out.println("║                 COMPARACIÓN FINAL                       ║");
        System.out.println("╠══════════════════════════════════════════════════════════╣");
        System.out.println("║ HashMap      → orden IMPREDECIBLE, más rápido           ║");
        System.out.println("║ LinkedHashMap→ orden de INSERCIÓN (P003→P001→P005→...)  ║");
        System.out.println("║ TreeMap      → orden ALFABÉTICO   (P001→P002→P003→...)  ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }
}