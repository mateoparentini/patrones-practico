/*
 * ==============================================================
 *  Builder — Ejercicio 1
 * ==============================================================
 *  Completa PizzaBuilder para construir objetos Pizza (atributos: tamano String, queso boolean, pepperoni boolean) paso a paso, encadenando métodos.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaBuilder1.java (no lo modifiques).
 * ==============================================================
 */

package p04_builder.ej1;

class Pizza {
    private String tamano;
    private boolean queso;
    private boolean pepperoni;

    public Pizza(String tamano, boolean queso, boolean pepperoni) {
        this.tamano = tamano;
        this.queso = queso;
        this.pepperoni = pepperoni;
    }

    @Override
    public String toString() {
        return "Pizza [tamano=" + tamano + ", queso=" + queso + ", pepperoni=" + pepperoni + "]";
    }
}

class PizzaBuilder {
    private String tamano;
    private boolean queso;
    private boolean pepperoni;

    public PizzaBuilder setTamano(String tamano) {
        // Completar: asignar y devolver this
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public PizzaBuilder setQueso(boolean queso) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public PizzaBuilder setPepperoni(boolean pepperoni) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public Pizza build() {
        // Completar: devolver una nueva Pizza con los datos acumulados
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
