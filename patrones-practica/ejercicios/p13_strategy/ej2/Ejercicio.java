/*
 * ==============================================================
 *  Strategy — Ejercicio 2
 * ==============================================================
 *  Completa el sistema de descuentos de una tienda con distintas estrategias.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaStrategy2.java (no lo modifiques).
 * ==============================================================
 */

package p13_strategy.ej2;

interface EstrategiaDescuento {
    double aplicar(double precio);
}

class SinDescuento implements EstrategiaDescuento {
    @Override
    public double aplicar(double precio) {
        return precio;
    }
}

class DescuentoPorcentaje implements EstrategiaDescuento {
    private double porcentaje;

    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicar(double precio) {
        return precio - (precio * porcentaje / 100);
    }
}

class CarritoConDescuento {
    private EstrategiaDescuento estrategia;

    public void setEstrategia(EstrategiaDescuento estrategia) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public double calcularPrecioFinal(double precio) {
        // Completar: validar estrategia no nula (lanzar IllegalStateException con
        // mensaje "No se ha seleccionado una estrategia de descuento") y delegar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
