/*
 * ==============================================================
 *  Algoritmos de Ordenamiento — Ejercicio 2
 * ==============================================================
 *  Completa OrdenamientoSeleccion (Selection Sort) sobre un arreglo int[]: en cada
 *  vuelta, buscar el menor elemento restante y colocarlo en su posición correcta.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaOrdenamiento2.java (no lo modifiques).
 * ==============================================================
 */

package p19_ordenamiento.ej2;

public class OrdenamientoSeleccion {

    public void ordenar(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    // Completar: actualizar indiceMinimo
                    throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
                }
            }
            // Completar: intercambiar arreglo[i] y arreglo[indiceMinimo]
            throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
        }
    }
}
