/*
 * ==============================================================
 *  Algoritmos de Ordenamiento — Ejercicio 3
 * ==============================================================
 *  Completa OrdenamientoInsercion (Insertion Sort) sobre una List<Integer>: tomar cada
 *  elemento y desplazarlo hacia atrás hasta encontrar su posición correcta entre los ya
 *  ordenados.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaOrdenamiento3.java (no lo modifiques).
 * ==============================================================
 */

package p19_ordenamiento.ej3;

import java.util.List;

public class OrdenamientoInsercion {

    public void ordenar(List<Integer> lista) {
        int n = lista.size();
        for (int i = 1; i < n; i++) {
            int clave = lista.get(i);
            int j = i - 1;

            while (j >= 0 && lista.get(j) > clave) {
                // Completar: mover lista.get(j) una posición a la derecha
                // (list.set(j+1, lista.get(j))) y decrementar j
                throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
            }

            // Completar: colocar "clave" en la posición j+1
            throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
        }
    }
}
