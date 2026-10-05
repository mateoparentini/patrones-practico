/*
 * ==============================================================
 *  Algoritmos de Ordenamiento — Ejercicio 1
 * ==============================================================
 *  Completa OrdenamientoBurbuja (Bubble Sort) sobre una List<Integer>: en cada pasada,
 *  comparar elementos adyacentes e intercambiarlos si están en el orden incorrecto.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaOrdenamiento1.java (no lo modifiques).
 * ==============================================================
 */

package p19_ordenamiento.ej1;

import java.util.List;

public class OrdenamientoBurbuja {

    public void ordenar(List<Integer> lista) {
        int n = lista.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (lista.get(j) > lista.get(j + 1)) {
                    // Completar: intercambiar lista.get(j) y lista.get(j+1)
                    // usando una variable temporal y list.set(...)
                    throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
                }
            }
        }
    }
}
