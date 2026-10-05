/*
 * ==============================================================
 *  Adapter — Ejercicio 1
 * ==============================================================
 *  La app espera la interfaz Impresora (método imprimir()), pero existe una impresora
 *  antigua ImpresoraLegacy con un método distinto imprimirEnPapel(). Completa el adaptador.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaAdapter1.java (no lo modifiques).
 * ==============================================================
 */

package p06_adapter.ej1;

interface Impresora {
    void imprimir();
}

class ImpresoraLegacy {
    public void imprimirEnPapel() {
        System.out.println("Imprimiendo con impresora antigua...");
    }
}

class ImpresoraAdapter implements Impresora {
    private ImpresoraLegacy impresoraLegacy;

    public ImpresoraAdapter(ImpresoraLegacy impresoraLegacy) {
        this.impresoraLegacy = impresoraLegacy;
    }

    @Override
    public void imprimir() {
        // Completar: delegar al método real de ImpresoraLegacy
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
