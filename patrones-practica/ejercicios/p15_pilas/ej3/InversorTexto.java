/*
 * ==============================================================
 *  Pilas (Stack) — Ejercicio 3
 * ==============================================================
 *  Completa InversorTexto, que usa una Stack<Character> para invertir un String.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaPilas3.java (no lo modifiques).
 * ==============================================================
 */

package p15_pilas.ej3;

import java.util.Stack;

public class InversorTexto {

    public String invertir(String texto) {
        Stack<Character> pila = new Stack<>();

        for (char c : texto.toCharArray()) {
            // Completar: apilar cada carácter
            throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
        }

        StringBuilder resultado = new StringBuilder();
        while (!pila.isEmpty()) {
            // Completar: desapilar y agregar al resultado
            throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
        }

        return resultado.toString();
    }
}
