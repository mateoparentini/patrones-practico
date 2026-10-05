/*
 * ==============================================================
 *  Tablas Hash (HashMap) — Ejercicio 2
 * ==============================================================
 *  Completa DetectorDuplicados, que usa un Set<Integer> (basado en hash) para detectar
 *  si un arreglo tiene números repetidos.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaHash2.java (no lo modifiques).
 * ==============================================================
 */

package p17_hash.ej2;

import java.util.HashSet;
import java.util.Set;

public class DetectorDuplicados {

    public boolean tieneDuplicados(int[] numeros) {
        Set<Integer> vistos = new HashSet<>();

        for (int numero : numeros) {
            // Completar: si "numero" ya está en "vistos", devolver true;
            // si no, agregarlo al set
            throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
        }

        return false;
    }
}
