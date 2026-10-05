/*
 * ==============================================================
 *  Listas Enlazadas — Ejercicio 3
 * ==============================================================
 *  Completa ListaDeTareas usando LinkedList<String>, con prioridad: las tareas
 *  urgentes se agregan al inicio, las normales al final.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaListasEnlazadas3.java (no lo modifiques).
 * ==============================================================
 */

package p14_listas_enlazadas.ej3;

import java.util.LinkedList;

public class ListaDeTareas {
    private LinkedList<String> tareas = new LinkedList<>();

    public void agregarUrgente(String tarea) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public void agregarNormal(String tarea) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public String completarSiguiente() {
        // Completar: elimina y devuelve la primera tarea de la lista,
        // o null si no hay tareas
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public int cantidadPendientes() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
