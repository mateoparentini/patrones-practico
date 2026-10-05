/*
 * ==============================================================
 *  Builder — Ejercicio 2
 * ==============================================================
 *  Completa ComputadoraBuilder para construir objetos Computadora (cpu, ram, almacenamiento, todos String), paso a paso.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaBuilder2.java (no lo modifiques).
 * ==============================================================
 */

package p04_builder.ej2;

class Computadora {
    private String cpu;
    private String ram;
    private String almacenamiento;

    public Computadora(String cpu, String ram, String almacenamiento) {
        this.cpu = cpu;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString() {
        return "Computadora [cpu=" + cpu + ", ram=" + ram + ", almacenamiento=" + almacenamiento + "]";
    }
}

class ComputadoraBuilder {
    private String cpu;
    private String ram;
    private String almacenamiento;

    public ComputadoraBuilder setCpu(String cpu) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public ComputadoraBuilder setRam(String ram) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public ComputadoraBuilder setAlmacenamiento(String almacenamiento) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public Computadora build() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
