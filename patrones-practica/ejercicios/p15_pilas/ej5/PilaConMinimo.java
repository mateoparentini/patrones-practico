/*
 * ==============================================================
 *  Pilas (Stack) — Ejercicio 5
 * ==============================================================
 *  Completa PilaConMinimo, una pila de enteros que además permite obtener el valor
 *  mínimo actual en tiempo constante, usando una segunda pila auxiliar.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaPilas5.java (no lo modifiques).
 * ==============================================================
 */

package p15_pilas.ej5;

import java.util.Stack;

public class PilaConMinimo {
    private Stack<Integer> pilaPrincipal = new Stack<>();
    private Stack<Integer> pilaMinimos = new Stack<>();

    public void push(int valor) {
        pilaPrincipal.push(valor);
        // Completar: si pilaMinimos está vacía o "valor" es menor o igual al
        // mínimo actual, apilarlo también en pilaMinimos
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public int pop() {
        int valor = pilaPrincipal.pop();
        // Completar: si "valor" es igual al tope de pilaMinimos, desapilarlo también de ahí
        return valor;
    }

    public int obtenerMinimo() {
        // Completar: devolver el tope de pilaMinimos
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
