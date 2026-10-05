/*
 * ==============================================================
 *  Strategy — Ejercicio 1
 * ==============================================================
 *  Completa el sistema de cálculo de impuestos con distintas estrategias.
 *  Completa la interfaz EstrategiaImpuesto y la clase CalculadoraImpuesto.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaStrategy1.java (no lo modifiques).
 * ==============================================================
 */

package p13_strategy.ej1;

interface EstrategiaImpuesto {
    double calcular(double montoBase);
}

class ImpuestoGeneral implements EstrategiaImpuesto {
    @Override
    public double calcular(double montoBase) {
        return montoBase * 0.18;
    }
}

class ImpuestoReducido implements EstrategiaImpuesto {
    @Override
    public double calcular(double montoBase) {
        return montoBase * 0.05;
    }
}

class CalculadoraImpuesto {
    private EstrategiaImpuesto estrategia;

    public void setEstrategia(EstrategiaImpuesto estrategia) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public double calcularImpuesto(double montoBase) {
        // Completar: validar que haya estrategia asignada (si no, lanzar
        // IllegalStateException("No se ha seleccionado una estrategia de impuesto"))
        // y delegar el cálculo
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
