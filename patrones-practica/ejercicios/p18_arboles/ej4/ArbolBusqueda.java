/*
 * ==============================================================
 *  Árboles Binarios y Recorridos — Ejercicio 4
 * ==============================================================
 *  Completa ArbolBusqueda, con un método contiene(int valor) que indique si un valor
 *  existe en el árbol, recorriendo de forma eficiente según las reglas del BST (sin
 *  recorrer todo el árbol innecesariamente).
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaArboles4.java (no lo modifiques).
 * ==============================================================
 */

package p18_arboles.ej4;

class NodoBusqueda {
    int valor;
    NodoBusqueda izquierdo;
    NodoBusqueda derecho;

    public NodoBusqueda(int valor) {
        this.valor = valor;
    }
}

public class ArbolBusqueda {
    private NodoBusqueda raiz;

    // ---- YA IMPLEMENTADO (no hace falta tocarlo): inserta siguiendo las reglas del BST ----
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private NodoBusqueda insertarRec(NodoBusqueda nodo, int valor) {
        if (nodo == null) {
            return new NodoBusqueda(valor);
        }
        if (valor < nodo.valor) {
            nodo.izquierdo = insertarRec(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertarRec(nodo.derecho, valor);
        }
        return nodo;
    }
    // ---- fin de lo ya implementado ----

    public boolean contiene(int valor) {
        // Completar: llamar al método auxiliar desde la raíz
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    private boolean contieneRec(NodoBusqueda nodo, int valor) {
        // Completar: caso base (nodo null -> false); si coincide, true;
        // si el valor buscado es menor, seguir por la izquierda; si es mayor, por la derecha
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
