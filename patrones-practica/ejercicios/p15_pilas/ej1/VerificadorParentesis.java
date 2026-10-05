/*
 * ==============================================================
 *  Pilas (Stack) — Ejercicio 1
 * ==============================================================
 *  Completa VerificadorParentesis, que usa una Stack<Character> para comprobar si una
 *  cadena tiene los paréntesis ( y ) correctamente balanceados.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaPilas1.java (no lo modifiques).
 * ==============================================================
 */

package p15_pilas.ej1;

import java.util.Stack;

public class VerificadorParentesis {

    public boolean estaBalanceado(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (char c : expresion.toCharArray()) {
            if (c == '(') {
                // Completar: apilar
                throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
            } else if (c == ')') {
                // Completar: si la pila está vacía, devolver false (no hay par);
                // si no, desapilar
                throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
            }
        }

        // Completar: devolver true solo si la pila quedó vacía al final
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
