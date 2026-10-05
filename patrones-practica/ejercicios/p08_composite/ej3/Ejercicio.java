/*
 * ==============================================================
 *  Composite — Ejercicio 3
 * ==============================================================
 *  Completa Menu de restaurante (puede contener PlatoIndividual u otros Menu
 *  —por ejemplo, un combo— ) para calcular el precio total.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaComposite3.java (no lo modifiques).
 * ==============================================================
 */

package p08_composite.ej3;

import java.util.ArrayList;
import java.util.List;

interface ElementoMenu {
    double precio();
}

class PlatoIndividual implements ElementoMenu {
    private double precio;

    public PlatoIndividual(double precio) {
        this.precio = precio;
    }

    @Override
    public double precio() {
        return precio;
    }
}

class Menu implements ElementoMenu {
    private List<ElementoMenu> items = new ArrayList<>();

    public void agregar(ElementoMenu item) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public void eliminar(ElementoMenu item) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public double precio() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
