/*
 * ==============================================================
 *  Composite — Ejercicio 2
 * ==============================================================
 *  Completa UnidadMilitar (puede contener Soldado u otras unidades) para calcular el
 *  total de efectivos.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaComposite2.java (no lo modifiques).
 * ==============================================================
 */

package p08_composite.ej2;

import java.util.ArrayList;
import java.util.List;

interface ElementoMilitar {
    int cantidadEfectivos();
}

class Soldado implements ElementoMilitar {
    @Override
    public int cantidadEfectivos() {
        return 1;
    }
}

class UnidadMilitar implements ElementoMilitar {
    private List<ElementoMilitar> miembros = new ArrayList<>();

    public void agregar(ElementoMilitar elemento) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public void eliminar(ElementoMilitar elemento) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public int cantidadEfectivos() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
