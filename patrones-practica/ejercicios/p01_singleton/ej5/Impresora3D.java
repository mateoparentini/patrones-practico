/*
 * ==============================================================
 *  Singleton — Ejercicio 5
 * ==============================================================
 *  Completa Impresora3D, Singleton que simula una cola de trabajos de impresión (List<String>).
 *
 *  - getInstance(): única instancia.
 *  - encolarTrabajo(String nombreArchivo): agrega un trabajo al final de la cola.
 *  - imprimirSiguiente(): elimina y devuelve el primer trabajo de la cola, o null si está vacía.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaSingleton5.java (no lo modifiques).
 * ==============================================================
 */

package p01_singleton.ej5;

import java.util.LinkedList;

public class Impresora3D {
    private static Impresora3D instancia;
    private LinkedList<String> cola;

    private Impresora3D() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public static Impresora3D getInstance() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public void encolarTrabajo(String nombreArchivo) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public String imprimirSiguiente() {
        // Completar: si la cola está vacía devolver null
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
