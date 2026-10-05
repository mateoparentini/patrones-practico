/*
 * ==============================================================
 *  Tablas Hash (HashMap) — Ejercicio 4
 * ==============================================================
 *  Completa CacheResultados, que usa un Map<Integer, Long> para memoizar (cachear) el
 *  resultado de una operación costosa (simulada), evitando recalcular si ya se pidió ese
 *  valor antes.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaHash4.java (no lo modifiques).
 * ==============================================================
 */

package p17_hash.ej4;

import java.util.HashMap;
import java.util.Map;

public class CacheResultados {
    private Map<Integer, Long> cache = new HashMap<>();

    public long calcularCuadradoCostoso(int n) {
        // Completar: si "n" ya está en cache, devolver el valor cacheado sin recalcular
        // si no está, calcular (long) n * n, guardarlo en cache y devolverlo
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
