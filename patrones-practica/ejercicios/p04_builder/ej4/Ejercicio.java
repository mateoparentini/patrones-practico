/*
 * ==============================================================
 *  Builder — Ejercicio 4
 * ==============================================================
 *  Completa ContratoBuilder para construir un Contrato (cliente, monto double, plazoMeses int).
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaBuilder4.java (no lo modifiques).
 * ==============================================================
 */

package p04_builder.ej4;

class Contrato {
    private String cliente;
    private double monto;
    private int plazoMeses;

    public Contrato(String cliente, double monto, int plazoMeses) {
        this.cliente = cliente;
        this.monto = monto;
        this.plazoMeses = plazoMeses;
    }

    @Override
    public String toString() {
        return "Contrato [cliente=" + cliente + ", monto=" + monto + ", plazoMeses=" + plazoMeses + "]";
    }
}

class ContratoBuilder {
    private String cliente;
    private double monto;
    private int plazoMeses;

    public ContratoBuilder setCliente(String cliente) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public ContratoBuilder setMonto(double monto) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public ContratoBuilder setPlazoMeses(int plazoMeses) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public Contrato build() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
