/*
 * ==============================================================
 *  Prototype — Ejercicio 2
 * ==============================================================
 *  Completa Personaje de un videojuego (nombre, nivel int, vida int) para que soporte clonación.
 *  El clon debe ser un objeto distinto al original.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaPrototype2.java (no lo modifiques).
 * ==============================================================
 */

package p05_prototype.ej2;

interface PersonajeClonable {
    PersonajeClonable clonar();
}

class Personaje implements PersonajeClonable {
    private String nombre;
    private int nivel;
    private int vida;

    public Personaje(String nombre, int nivel, int vida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
    }

    @Override
    public PersonajeClonable clonar() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return nombre + " (nivel " + nivel + ", vida " + vida + ")";
    }
}
