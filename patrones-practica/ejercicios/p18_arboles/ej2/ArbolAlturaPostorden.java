/*
 * ==============================================================
 *  Árboles Binarios y Recorridos — Ejercicio 2
 * ==============================================================
 *  Completa ArbolEnteros (continuación) con el recorrido en postorden
 *  (izquierda, derecha, nodo) y el cálculo de la altura del árbol.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaArboles2.java (no lo modifiques).
 * ==============================================================
 */

package p18_arboles.ej2;

class NodoEntero2 {
    int valor;
    NodoEntero2 izquierdo;
    NodoEntero2 derecho;

    public NodoEntero2(int valor) {
        this.valor = valor;
    }
}

public class ArbolAlturaPostorden {
    private NodoEntero2 raiz;

    // ---- YA IMPLEMENTADO (no hace falta tocarlo): inserta siguiendo las reglas del BST ----
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private NodoEntero2 insertarRec(NodoEntero2 nodo, int valor) {
        if (nodo == null) {
            return new NodoEntero2(valor);
        }
        if (valor < nodo.valor) {
            nodo.izquierdo = insertarRec(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertarRec(nodo.derecho, valor);
        }
        return nodo;
    }
    // ---- fin de lo ya implementado ----

    public void postOrden() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    private void postOrdenRec(NodoEntero2 nodo) {
        // Completar: izquierda, derecha, imprimir valor
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public int altura() {
        // Completar: llamar al método auxiliar desde la raíz
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    private int alturaRec(NodoEntero2 nodo) {
        // Completar: si el nodo es null, la altura es -1 (o 0, según el criterio que uses);
        // si no, es 1 + el máximo entre la altura del subárbol izquierdo y el derecho
        // (usa Math.max)
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
