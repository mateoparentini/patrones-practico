/*
 * ==============================================================
 *  Colas (Queue) — Ejercicio 4
 * ==============================================================
 *  Completa ColaImpresion, que administra trabajos de impresión con prioridad usando
 *  PriorityQueue<Integer> (menor número = mayor prioridad).
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaColas4.java (no lo modifiques).
 * ==============================================================
 */

package p16_colas.ej4;

import java.util.PriorityQueue;

public class ColaImpresion {
    private PriorityQueue<Integer> trabajos = new PriorityQueue<>();

    public void agregarTrabajo(int prioridad) {
        // Completar: usar offer()
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public Integer imprimirSiguiente() {
        // Completar: usar poll()
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public boolean hayTrabajosPendientes() {
        // Completar: usar isEmpty()
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
