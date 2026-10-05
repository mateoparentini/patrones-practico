/*
 * ==============================================================
 *  Árboles Binarios y Recorridos — Ejercicio 5
 * ==============================================================
 *  Completa ArbolExtremos, con métodos para obtener el valor mínimo y máximo del árbol
 *  (recorriendo hacia la izquierda o derecha según corresponda, sin usar recursión).
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaArboles5.java (no lo modifiques).
 * ==============================================================
 */

package p18_arboles.ej5;

class NodoExtremo {
    int valor;
    NodoExtremo izquierdo;
    NodoExtremo derecho;

    public NodoExtremo(int valor) {
        this.valor = valor;
    }
}

public class ArbolExtremos {
    private NodoExtremo raiz;

    // ---- YA IMPLEMENTADO (no hace falta tocarlo): inserta siguiendo las reglas del BST ----
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private NodoExtremo insertarRec(NodoExtremo nodo, int valor) {
        if (nodo == null) {
            return new NodoExtremo(valor);
        }
        if (valor < nodo.valor) {
            nodo.izquierdo = insertarRec(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertarRec(nodo.derecho, valor);
        }
        return nodo;
    }
    // ---- fin de lo ya implementado ----

    public int obtenerMinimo() {
        // Completar: partir desde raiz y avanzar mientras haya hijo izquierdo (while),
        // devolver el valor del último nodo alcanzado
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public int obtenerMaximo() {
        // Completar: análogo, pero avanzando por la derecha
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
