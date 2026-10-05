/*
 * ==============================================================
 *  Tablas Hash (HashMap) — Ejercicio 3
 * ==============================================================
 *  Completa AgrupadorAnagramas, que usa un Map<String, List<String>> para agrupar
 *  palabras que son anagramas entre sí (misma clave: sus letras ordenadas).
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaHash3.java (no lo modifiques).
 * ==============================================================
 */

package p17_hash.ej3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgrupadorAnagramas {
    private Map<String, List<String>> grupos = new HashMap<>();

    public void agregarPalabra(String palabra) {
        char[] letras = palabra.toCharArray();
        Arrays.sort(letras);
        String clave = new String(letras);

        // Completar: si "clave" no existe todavía en "grupos", crear una lista vacía
        // y asociarla a esa clave; luego, en cualquier caso, agregar "palabra" a esa lista
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public List<String> obtenerGrupo(String palabra) {
        char[] letras = palabra.toCharArray();
        Arrays.sort(letras);
        String clave = new String(letras);
        // Completar: devolver la lista asociada a esa clave, o una lista vacía si no existe
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
