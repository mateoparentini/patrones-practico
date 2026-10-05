/*
 * ==============================================================
 *  Decorator — Ejercicio 1
 * ==============================================================
 *  Completa el decorador ConAzucar para la interfaz Bebida (costo() double, descripcion() String),
 *  que agrega $0.3 al costo y " con azúcar" a la descripción.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaDecorator1.java (no lo modifiques).
 * ==============================================================
 */

package p07_decorator.ej1;

interface Bebida {
    double costo();
    String descripcion();
}

class CafeSimple implements Bebida {
    @Override
    public double costo() { return 2.0; }
    @Override
    public String descripcion() { return "Café"; }
}

abstract class BebidaDecorator implements Bebida {
    protected Bebida bebidaDecorada;

    public BebidaDecorator(Bebida bebida) {
        this.bebidaDecorada = bebida;
    }
}

class ConAzucar extends BebidaDecorator {
    public ConAzucar(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double costo() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public String descripcion() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
