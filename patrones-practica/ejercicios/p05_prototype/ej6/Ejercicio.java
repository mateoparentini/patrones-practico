/*
 * ==============================================================
 *  Prototype — Ejercicio 6
 * ==============================================================
 *  Completa Oferta comercial (producto, descuento double) con clonación, de manera
 *  que se puedan generar variantes de una oferta base para distintos productos.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaPrototype6.java (no lo modifiques).
 * ==============================================================
 */

package p05_prototype.ej6;

interface OfertaClonable {
    OfertaClonable clonar();
}

class Oferta implements OfertaClonable {
    private String producto;
    private double descuento;

    public Oferta(String producto, double descuento) {
        this.producto = producto;
        this.descuento = descuento;
    }

    @Override
    public OfertaClonable clonar() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return producto + " (" + descuento + "% off)";
    }
}
