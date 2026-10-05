/*
 * ==============================================================
 *  Pilas (Stack) — Ejercicio 4
 * ==============================================================
 *  Completa EvaluadorPostfijo, que usa una Stack<Integer> para evaluar una expresión
 *  en notación postfija (por ejemplo, "3 4 +" da 7), con operadores +, -, *.
 *  Asumí que los tokens vienen separados por espacios.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaPilas4.java (no lo modifiques).
 * ==============================================================
 */

package p15_pilas.ej4;

import java.util.Stack;

public class EvaluadorPostfijo {

    public int evaluar(String expresion) {
        Stack<Integer> pila = new Stack<>();
        String[] tokens = expresion.split(" ");

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*")) {
                int b = pila.pop();
                int a = pila.pop();
                // Completar: calcular el resultado según el operador y apilarlo
                throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
            } else {
                // Completar: convertir el token a número (Integer.parseInt) y apilarlo
                throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
            }
        }

        return pila.pop();
    }
}
