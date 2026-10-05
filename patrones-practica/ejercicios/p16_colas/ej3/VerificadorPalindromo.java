/*
 * ==============================================================
 *  Colas (Queue) — Ejercicio 3
 * ==============================================================
 *  Completa VerificadorPalindromo, que usa una Queue<Character> y una Stack<Character>
 *  en paralelo para comprobar si una palabra es un palíndromo.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaColas3.java (no lo modifiques).
 * ==============================================================
 */

package p16_colas.ej3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class VerificadorPalindromo {

    public boolean esPalindromo(String palabra) {
        Queue<Character> cola = new LinkedList<>();
        Stack<Character> pila = new Stack<>();

        for (char c : palabra.toCharArray()) {
            // Completar: agregar el carácter tanto a la cola (offer) como a la pila (push)
            throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
        }

        while (!cola.isEmpty()) {
            // Completar: comparar el frente de la cola (poll) contra el tope de la pila (pop);
            // si en algún momento son distintos, devolver false
            throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
        }

        return true;
    }
}
