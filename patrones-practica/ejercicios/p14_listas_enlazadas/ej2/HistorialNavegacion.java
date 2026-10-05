/*
 * ==============================================================
 *  Listas Enlazadas — Ejercicio 2
 * ==============================================================
 *  Completa HistorialNavegacion usando LinkedList<String>, que permita moverse
 *  hacia atrás y hacia adelante como el historial de un navegador.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaListasEnlazadas2.java (no lo modifiques).
 * ==============================================================
 */

package p14_listas_enlazadas.ej2;

import java.util.LinkedList;

public class HistorialNavegacion {
    private LinkedList<String> historial = new LinkedList<>();

    public void visitar(String url) {
        // Completar: agregar la url al final del historial
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public String paginaAnterior() {
        // Completar: eliminar y devolver la última url visitada (removeLast),
        // o null si el historial está vacío
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public String primeraPagina() {
        // Completar: devolver (sin eliminar) la primera url del historial,
        // o null si está vacío
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
