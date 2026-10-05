/*
 * ==============================================================
 *  Árboles Binarios y Recorridos — Ejercicio 6
 * ==============================================================
 *  Completa ArbolEliminador, con un método eliminar(int valor) que borre un nodo del
 *  árbol. Para simplificar, asumí que el valor a eliminar siempre tiene como máximo un
 *  hijo (no hace falta manejar el caso de dos hijos).
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaArboles6.java (no lo modifiques).
 * ==============================================================
 */

package p18_arboles.ej6;

class NodoEliminable {
    int valor;
    NodoEliminable izquierdo;
    NodoEliminable derecho;

    public NodoEliminable(int valor) {
        this.valor = valor;
    }
}

public class ArbolEliminador {
    private NodoEliminable raiz;

    // ---- YA IMPLEMENTADO (no hace falta tocarlo): inserta siguiendo las reglas del BST ----
    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private NodoEliminable insertarRec(NodoEliminable nodo, int valor) {
        if (nodo == null) {
            return new NodoEliminable(valor);
        }
        if (valor < nodo.valor) {
            nodo.izquierdo = insertarRec(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertarRec(nodo.derecho, valor);
        }
        return nodo;
    }
    // ---- fin de lo ya implementado ----

    // ---- YA IMPLEMENTADO (solo sirve para poder probar el resultado) ----
    public String enOrden() {
        StringBuilder sb = new StringBuilder();
        enOrdenRec(raiz, sb);
        return sb.toString().trim();
    }

    private void enOrdenRec(NodoEliminable nodo, StringBuilder sb) {
        if (nodo == null) {
            return;
        }
        enOrdenRec(nodo.izquierdo, sb);
        sb.append(nodo.valor).append(" ");
        enOrdenRec(nodo.derecho, sb);
    }
    // ---- fin de lo ya implementado ----

    public void eliminar(int valor) {
        // Completar: actualizar raiz usando eliminarRec(raiz, valor)
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    private NodoEliminable eliminarRec(NodoEliminable nodo, int valor) {
        if (nodo == null) {
            return null;
        }
        if (valor < nodo.valor) {
            nodo.izquierdo = eliminarRec(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = eliminarRec(nodo.derecho, valor);
        } else {
            // Completar: este es el nodo a eliminar.
            // Si no tiene hijo izquierdo, devolver el hijo derecho (puede ser null).
            // Si no tiene hijo derecho, devolver el hijo izquierdo.
            throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
        }
        return nodo;
    }
}
