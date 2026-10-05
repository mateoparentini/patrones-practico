/*
 * ==============================================================
 *  Conocimientos Adicionales (búsqueda binaria y bits) — Ejercicio 3
 * ==============================================================
 *  Completa OperacionesBitwise, que usa operadores bit a bit para resolver tareas
 *  comunes sin usar operaciones aritméticas normales.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaConocimientosAdicionales3.java (no lo modifiques).
 * ==============================================================
 */

package p20_conocimientos_adicionales.ej3;

public class OperacionesBitwise {

    public boolean esPar(int numero) {
        // Completar: usar el operador AND (&) contra 1; si da 0, es par
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public int multiplicarPorDos(int numero) {
        // Completar: usar desplazamiento a la izquierda (<<) en 1 posición
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public int dividirEntreDos(int numero) {
        // Completar: usar desplazamiento a la derecha (>>) en 1 posición
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public boolean mismoSigno(int a, int b) {
        // Completar: usar XOR (^) entre a y b; si el resultado es >= 0,
        // ambos tienen el mismo signo
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
