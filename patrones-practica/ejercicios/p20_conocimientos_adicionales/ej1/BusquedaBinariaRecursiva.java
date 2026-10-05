/*
 * ==============================================================
 *  Conocimientos Adicionales (búsqueda binaria y bits) — Ejercicio 1
 * ==============================================================
 *  Completa BusquedaBinariaRecursiva, una versión recursiva (en vez de iterativa) de la
 *  búsqueda binaria sobre un arreglo int[] ya ordenado.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaConocimientosAdicionales1.java (no lo modifiques).
 * ==============================================================
 */

package p20_conocimientos_adicionales.ej1;

public class BusquedaBinariaRecursiva {

    public int buscar(int[] arreglo, int objetivo) {
        return buscarRec(arreglo, objetivo, 0, arreglo.length - 1);
    }

    private int buscarRec(int[] arreglo, int objetivo, int low, int high) {
        // Completar: caso base — si low > high, el elemento no está, devolver -1

        int mid = low + (high - low) / 2;

        if (arreglo[mid] == objetivo) {
            // Completar: devolver mid
            throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
        } else if (arreglo[mid] < objetivo) {
            // Completar: llamar recursivamente buscando en la mitad derecha
            throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
        } else {
            // Completar: llamar recursivamente buscando en la mitad izquierda
            throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
        }
    }
}
