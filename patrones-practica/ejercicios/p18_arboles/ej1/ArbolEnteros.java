/*
 * ==============================================================
 *  Árboles Binarios y Recorridos — Ejercicio 1
 * ==============================================================
 *  Completa ArbolEnteros para insertar valores siguiendo las reglas de un árbol binario
 *  de búsqueda (menor a la izquierda, mayor a la derecha, sin duplicados) y recorrerlo
 *  en inorden (izquierda, nodo, derecha).
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaArboles1.java (no lo modifiques).
 * ==============================================================
 */

package p18_arboles.ej1;

class NodoEntero {
    int valor;
    NodoEntero izquierdo;
    NodoEntero derecho;

    public NodoEntero(int valor) {
        this.valor = valor;
    }
}

public class ArbolEnteros {
    private NodoEntero raiz;

    public void insertar(int valor) {
        // Completar: actualizar raiz usando insertarRec(raiz, valor)
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    private NodoEntero insertarRec(NodoEntero nodo, int valor) {
        // Completar: caso base (nodo null), y recursión por izquierda/derecha según
        // corresponda; si el valor ya existe, no insertar nada
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public void inOrden() {
        // Completar: llamar al método auxiliar recursivo desde la raíz
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    private void inOrdenRec(NodoEntero nodo) {
        // Completar: izquierda, imprimir valor, derecha
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
