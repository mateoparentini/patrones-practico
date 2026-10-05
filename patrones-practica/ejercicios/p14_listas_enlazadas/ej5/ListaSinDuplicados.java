/*
 * ==============================================================
 *  Listas Enlazadas — Ejercicio 5
 * ==============================================================
 *  Completa ListaSinDuplicados, que solo agrega un elemento si todavía no está presente.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaListasEnlazadas5.java (no lo modifiques).
 * ==============================================================
 */

package p14_listas_enlazadas.ej5;

import java.util.ArrayList;
import java.util.List;

public class ListaSinDuplicados {
    private List<String> elementos = new ArrayList<>();

    public boolean agregar(String elemento) {
        // Completar: si "elemento" ya está en la lista (contains), no agregarlo y
        // devolver false; si no está, agregarlo y devolver true
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public List<String> obtenerTodos() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
