/*
 * ==============================================================
 *  Algoritmos de Ordenamiento — Ejercicio 4
 * ==============================================================
 *  Completa BusquedaBinariaLista, que implementa búsqueda binaria sobre una
 *  List<Integer> ya ordenada, devolviendo el índice del elemento o -1 si no existe.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaOrdenamiento4.java (no lo modifiques).
 * ==============================================================
 */

package p19_ordenamiento.ej4;

import java.util.List;

public class BusquedaBinariaLista {

    public int buscar(List<Integer> listaOrdenada, int objetivo) {
        int low = 0;
        int high = listaOrdenada.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (listaOrdenada.get(mid) == objetivo) {
                // Completar: devolver mid
                throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
            } else if (listaOrdenada.get(mid) < objetivo) {
                // Completar: descartar la mitad izquierda (ajustar low)
                throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
            } else {
                // Completar: descartar la mitad derecha (ajustar high)
                throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
            }
        }

        return -1;
    }
}
