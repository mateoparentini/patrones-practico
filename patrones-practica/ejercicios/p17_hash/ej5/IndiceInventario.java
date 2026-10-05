/*
 * ==============================================================
 *  Tablas Hash (HashMap) — Ejercicio 5
 * ==============================================================
 *  Completa IndiceInventario, que usa un Map<String, Integer> para mapear nombre de
 *  producto a stock, con el método adicional transferir que mueve unidades de un
 *  producto a otro (ambos deben existir).
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaHash5.java (no lo modifiques).
 * ==============================================================
 */

package p17_hash.ej5;

import java.util.HashMap;
import java.util.Map;

public class IndiceInventario {
    private Map<String, Integer> stock = new HashMap<>();

    public void agregarProducto(String nombre, int cantidad) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public boolean transferir(String origen, String destino, int cantidad) {
        // Completar: si alguno de los dos productos no existe en el mapa, devolver false;
        // si el origen no tiene suficiente stock, devolver false;
        // si todo es válido, restar "cantidad" del origen, sumarla al destino y devolver true
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
