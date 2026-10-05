/*
 * ==============================================================
 *  Listas Enlazadas — Ejercicio 1
 * ==============================================================
 *  Completa ListaPersonalizada para administrar nombres, usando un ArrayList<String>
 *  interno, validando los índices.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaListasEnlazadas1.java (no lo modifiques).
 * ==============================================================
 */

package p14_listas_enlazadas.ej1;

import java.util.ArrayList;

public class ListaPersonalizada {
    private ArrayList<String> lista = new ArrayList<>();

    public void agregarAlInicio(String nombre) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public void agregarAlFinal(String nombre) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public void eliminarPorIndice(int index) {
        // Completar: validar índice (0 a size()-1), lanzar
        // IndexOutOfBoundsException("Índice fuera de rango") si es inválido
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public String obtener(int index) {
        // Completar: validar índice y devolver el elemento
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
