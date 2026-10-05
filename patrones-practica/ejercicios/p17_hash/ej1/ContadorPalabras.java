/*
 * ==============================================================
 *  Tablas Hash (HashMap) — Ejercicio 1
 * ==============================================================
 *  Completa ContadorPalabras, que usa un Map<String, Integer> para contar cuántas
 *  veces aparece cada palabra en un texto.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaHash1.java (no lo modifiques).
 * ==============================================================
 */

package p17_hash.ej1;

import java.util.HashMap;
import java.util.Map;

public class ContadorPalabras {
    private Map<String, Integer> conteo = new HashMap<>();

    public void procesarTexto(String texto) {
        String[] palabras = texto.toLowerCase().split(" ");
        for (String palabra : palabras) {
            // Completar: si la palabra ya está en el mapa, incrementar su contador en 1;
            // si no está, agregarla con valor 1
            throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
        }
    }

    public int vecesQueAparece(String palabra) {
        // Completar: devolver 0 si la palabra no está en el mapa
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
