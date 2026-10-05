/*
 * ==============================================================
 *  Prototype — Ejercicio 5
 * ==============================================================
 *  Completa Enemigo (tipo, puntosVida int, dano int) con clonación, para generar
 *  varios enemigos iguales en un videojuego a partir de un prototipo.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaPrototype5.java (no lo modifiques).
 * ==============================================================
 */

package p05_prototype.ej5;

interface EnemigoClonable {
    EnemigoClonable clonar();
}

class Enemigo implements EnemigoClonable {
    private String tipo;
    private int puntosVida;
    private int dano;

    public Enemigo(String tipo, int puntosVida, int dano) {
        this.tipo = tipo;
        this.puntosVida = puntosVida;
        this.dano = dano;
    }

    @Override
    public EnemigoClonable clonar() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public String toString() {
        return tipo + " [vida=" + puntosVida + ", daño=" + dano + "]";
    }
}
