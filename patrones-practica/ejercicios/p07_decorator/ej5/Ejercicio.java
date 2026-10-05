/*
 * ==============================================================
 *  Decorator — Ejercicio 5
 * ==============================================================
 *  Completa el decorador ConRegistro (logging) para Operacion (método ejecutar()),
 *  que imprime un mensaje antes y después de ejecutar la operación real.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaDecorator5.java (no lo modifiques).
 * ==============================================================
 */

package p07_decorator.ej5;

interface Operacion {
    void ejecutar();
}

class OperacionSimple implements Operacion {
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando operación...");
    }
}

abstract class OperacionDecorator implements Operacion {
    protected Operacion operacionDecorada;

    public OperacionDecorator(Operacion operacion) {
        this.operacionDecorada = operacion;
    }
}

class ConRegistro extends OperacionDecorator {
    public ConRegistro(Operacion operacion) {
        super(operacion);
    }

    @Override
    public void ejecutar() {
        // Completar: imprimir "Inicio", ejecutar la operación decorada, imprimir "Fin"
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
