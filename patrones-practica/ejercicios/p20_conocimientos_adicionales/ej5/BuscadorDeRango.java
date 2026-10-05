/*
 * ==============================================================
 *  Conocimientos Adicionales (búsqueda binaria y bits) — Ejercicio 5
 * ==============================================================
 *  Completa BuscadorDeRango, que usa búsqueda binaria para encontrar la primera
 *  posición de un arreglo ordenado donde el valor es mayor o igual a un umbral dado
 *  (útil para búsquedas por rango).
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaConocimientosAdicionales5.java (no lo modifiques).
 * ==============================================================
 */

package p20_conocimientos_adicionales.ej5;

public class BuscadorDeRango {

    public int primeraPosicionMayorOIgual(int[] arreglo, int umbral) {
        int low = 0;
        int high = arreglo.length - 1;
        int resultado = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arreglo[mid] >= umbral) {
                // Completar: este índice es un candidato válido, guardarlo en "resultado"
                // y seguir buscando más a la izquierda por si hay uno anterior (ajustar high)
                throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
            } else {
                // Completar: el valor es muy chico, buscar a la derecha (ajustar low)
                throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
            }
        }

        return resultado;
    }
}
