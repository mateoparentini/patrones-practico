/*
 * ==============================================================
 *  Composite — Ejercicio 4
 * ==============================================================
 *  Completa Equipo de trabajo (puede contener Persona u otros Equipo —subequipos—)
 *  para calcular el costo total de nómina.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaComposite4.java (no lo modifiques).
 * ==============================================================
 */

package p08_composite.ej4;

import java.util.ArrayList;
import java.util.List;

interface ElementoEquipo {
    double costoNomina();
}

class Persona implements ElementoEquipo {
    private double salario;

    public Persona(double salario) {
        this.salario = salario;
    }

    @Override
    public double costoNomina() {
        return salario;
    }
}

class Equipo implements ElementoEquipo {
    private List<ElementoEquipo> miembros = new ArrayList<>();

    public void agregar(ElementoEquipo miembro) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public void eliminar(ElementoEquipo miembro) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public double costoNomina() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
