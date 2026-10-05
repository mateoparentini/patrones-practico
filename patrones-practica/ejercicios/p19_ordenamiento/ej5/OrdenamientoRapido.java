/*
 * ==============================================================
 *  Algoritmos de Ordenamiento — Ejercicio 5
 * ==============================================================
 *  Completa OrdenamientoRapido (Quicksort) sobre un arreglo int[], usando el último
 *  elemento del rango como pivote (misma idea que el ejemplo visto en clase, pero
 *  completando vos la partición).
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaOrdenamiento5.java (no lo modifiques).
 * ==============================================================
 */

package p19_ordenamiento.ej5;

public class OrdenamientoRapido {

    public void ordenar(int[] arreglo, int low, int high) {
        if (low < high) {
            int indicePivote = particionar(arreglo, low, high);
            ordenar(arreglo, low, indicePivote - 1);
            ordenar(arreglo, indicePivote + 1, high);
        }
    }

    private int particionar(int[] arreglo, int low, int high) {
        int pivote = arreglo[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arreglo[j] < pivote) {
                i++;
                // Completar: intercambiar arreglo[i] y arreglo[j]
                throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
            }
        }

        // Completar: intercambiar arreglo[i+1] y arreglo[high] (colocar el pivote en su lugar)
        // y devolver i + 1
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
