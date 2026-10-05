/*
 * ==============================================================
 *  Colas (Queue) — Ejercicio 1
 * ==============================================================
 *  Completa FilaAtencion, que usa una Queue<String> (con LinkedList) para atender
 *  clientes en orden de llegada.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaColas1.java (no lo modifiques).
 * ==============================================================
 */

package p16_colas.ej1;

import java.util.LinkedList;
import java.util.Queue;

public class FilaAtencion {
    private Queue<String> fila = new LinkedList<>();

    public void llegarCliente(String nombre) {
        // Completar: usar offer()
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public String atenderSiguiente() {
        // Completar: usar poll(); si la fila está vacía poll() ya devuelve null
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public int cantidadEnEspera() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
