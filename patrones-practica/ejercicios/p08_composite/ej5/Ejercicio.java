/*
 * ==============================================================
 *  Composite — Ejercicio 5
 * ==============================================================
 *  Completa Categoria de un catálogo de productos (puede contener ProductoCatalogo u
 *  otras Categoria —subcategorías—) para contar cuántos productos hay en total.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaComposite5.java (no lo modifiques).
 * ==============================================================
 */

package p08_composite.ej5;

import java.util.ArrayList;
import java.util.List;

interface ElementoCatalogo {
    int contarProductos();
}

class ProductoCatalogo implements ElementoCatalogo {
    @Override
    public int contarProductos() {
        return 1;
    }
}

class Categoria implements ElementoCatalogo {
    private List<ElementoCatalogo> elementos = new ArrayList<>();

    public void agregar(ElementoCatalogo elemento) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public void eliminar(ElementoCatalogo elemento) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public int contarProductos() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
