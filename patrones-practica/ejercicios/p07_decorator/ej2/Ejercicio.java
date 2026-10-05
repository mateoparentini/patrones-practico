/*
 * ==============================================================
 *  Decorator — Ejercicio 2
 * ==============================================================
 *  Completa el decorador ConQueso para Hamburguesa (precio() double, ingredientes() String),
 *  que agrega $1.5 al precio y ", queso" a los ingredientes.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaDecorator2.java (no lo modifiques).
 * ==============================================================
 */

package p07_decorator.ej2;

interface Hamburguesa {
    double precio();
    String ingredientes();
}

class HamburguesaSimple implements Hamburguesa {
    @Override
    public double precio() { return 5.0; }
    @Override
    public String ingredientes() { return "Pan, carne"; }
}

abstract class HamburguesaDecorator implements Hamburguesa {
    protected Hamburguesa hamburguesaDecorada;

    public HamburguesaDecorator(Hamburguesa hamburguesa) {
        this.hamburguesaDecorada = hamburguesa;
    }
}

class ConQueso extends HamburguesaDecorator {
    public ConQueso(Hamburguesa hamburguesa) {
        super(hamburguesa);
    }

    @Override
    public double precio() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public String ingredientes() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
