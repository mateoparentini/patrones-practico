/*
 * ==============================================================
 *  Árboles Binarios y Recorridos — Ejercicio 3
 * ==============================================================
 *  Completa ArbolContador, que cuenta cuántos nodos tiene el árbol y cuántos son hojas
 *  (nodos sin hijos).
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaArboles3.java (no lo modifiques).
 * ==============================================================
 */

package p18_arboles.ej3;

class NodoContador {
    int valor;
    NodoContador izquierdo;
    NodoContador derecho;

    public NodoContador(int valor) {
        this.valor = valor;
    }
}

public class ArbolContador {
    private NodoContador raiz;

    // ---- YA IMPLEMENTADO (no hace falta tocarlo): inserta siguiendo las reglas del BST ----
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private NodoContador insertarRec(NodoContador nodo, int valor) {
        if (nodo == null) {
            return new NodoContador(valor);
        }
        if (valor < nodo.valor) {
            nodo.izquierdo = insertarRec(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertarRec(nodo.derecho, valor);
        }
        return nodo;
    }
    // ---- fin de lo ya implementado ----

    public int contarNodos() {
        // Completar: llamar al método auxiliar desde la raíz
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    private int contarNodosRec(NodoContador nodo) {
        // Completar: si nodo es null, devolver 0; si no, 1 + los nodos de ambos subárboles
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public int contarHojas() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    private int contarHojasRec(NodoContador nodo) {
        // Completar: si nodo es null, devolver 0;
        // si nodo no tiene ni izquierdo ni derecho, devolver 1;
        // si no, sumar las hojas de ambos subárboles
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
