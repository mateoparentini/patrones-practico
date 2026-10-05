/*
 * ==============================================================
 *  Prototype — Ejercicio 4
 * ==============================================================
 *  Completa Receta de cocina (nombre, porciones int) con clonación, de forma que
 *  al clonar una receta se pueda ajustar las porciones sin afectar a la original.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaPrototype4.java (no lo modifiques).
 * ==============================================================
 */

package p05_prototype.ej4;

interface RecetaClonable {
    RecetaClonable clonar();
}

class Receta implements RecetaClonable {
    private String nombre;
    private int porciones;

    public Receta(String nombre, int porciones) {
        this.nombre = nombre;
        this.porciones = porciones;
    }

    @Override
    public RecetaClonable clonar() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public void setPorciones(int porciones) {
        this.porciones = porciones;
    }

    @Override
    public String toString() {
        return nombre + " (" + porciones + " porciones)";
    }
}
