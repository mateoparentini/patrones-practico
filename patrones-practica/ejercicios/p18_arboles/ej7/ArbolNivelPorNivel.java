/*
 * ==============================================================
 *  Árboles Binarios y Recorridos — Ejercicio 7
 * ==============================================================
 *  Completa ArbolNivelPorNivel, que recorre el árbol por niveles (BFS), usando una
 *  Queue<NodoNivel>, e imprime los valores en el orden en que se visitan.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaArboles7.java (no lo modifiques).
 * ==============================================================
 */

package p18_arboles.ej7;

import java.util.LinkedList;
import java.util.Queue;

class NodoNivel {
    int valor;
    NodoNivel izquierdo;
    NodoNivel derecho;

    public NodoNivel(int valor) {
        this.valor = valor;
    }
}

public class ArbolNivelPorNivel {
    private NodoNivel raiz;

    // ---- YA IMPLEMENTADO (no hace falta tocarlo): inserta siguiendo las reglas del BST ----
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private NodoNivel insertarRec(NodoNivel nodo, int valor) {
        if (nodo == null) {
            return new NodoNivel(valor);
        }
        if (valor < nodo.valor) {
            nodo.izquierdo = insertarRec(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertarRec(nodo.derecho, valor);
        }
        return nodo;
    }
    // ---- fin de lo ya implementado ----

    public void recorrerPorNiveles() {
        if (raiz == null) {
            return;
        }

        Queue<NodoNivel> cola = new LinkedList<>();
        // Completar: agregar la raíz a la cola

        while (!cola.isEmpty()) {
            NodoNivel actual = cola.poll();
            System.out.print(actual.valor + " ");

            // Completar: si actual tiene hijo izquierdo, agregarlo a la cola;
            // si tiene hijo derecho, agregarlo también
            throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
        }
    }
}
