/*
 * ==============================================================
 *  Pilas (Stack) — Ejercicio 2
 * ==============================================================
 *  Completa HistorialAcciones, que usa una Stack<String> para implementar deshacer
 *  (undo) la última acción registrada.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaPilas2.java (no lo modifiques).
 * ==============================================================
 */

package p15_pilas.ej2;

import java.util.Stack;

public class HistorialAcciones {
    private Stack<String> acciones = new Stack<>();

    public void registrarAccion(String accion) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public String deshacerUltimaAccion() {
        // Completar: si la pila está vacía, devolver null;
        // si no, desapilar y devolver la acción deshecha
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public String verUltimaAccion() {
        // Completar: devolver (sin eliminar) la última acción, o null si está vacía
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
