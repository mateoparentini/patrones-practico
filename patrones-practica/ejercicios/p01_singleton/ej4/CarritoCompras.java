/*
 * ==============================================================
 *  Singleton — Ejercicio 4
 * ==============================================================
 *  Completa CarritoCompras como Singleton compartido entre distintas partes de una tienda.
 *  Debe mantener una lista de productos (List<String>).
 *
 *  - getInstance(): única instancia.
 *  - agregarProducto(String producto): agrega un producto a la lista.
 *  - vaciarCarrito(): elimina todos los productos.
 *  - cantidadProductos(): devuelve cuántos productos hay.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaSingleton4.java (no lo modifiques).
 * ==============================================================
 */

package p01_singleton.ej4;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {
    private static CarritoCompras instancia;
    private List<String> productos;

    private CarritoCompras() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public static CarritoCompras getInstance() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public void agregarProducto(String producto) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public void vaciarCarrito() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public int cantidadProductos() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
