/*
 * ==============================================================
 *  Prototype — Ejercicio 7
 * ==============================================================
 *  Completa ConfiguracionJuego (dificultad, volumen int, pantallaCompleta boolean)
 *  con clonación, para poder tener distintos perfiles de configuración a partir de uno base.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaPrototype7.java (no lo modifiques).
 * ==============================================================
 */

package p05_prototype.ej7;

interface ConfiguracionClonable {
    ConfiguracionClonable clonar();
}

class ConfiguracionJuego implements ConfiguracionClonable {
    private String dificultad;
    private int volumen;
    private boolean pantallaCompleta;

    public ConfiguracionJuego(String dificultad, int volumen, boolean pantallaCompleta) {
        this.dificultad = dificultad;
        this.volumen = volumen;
        this.pantallaCompleta = pantallaCompleta;
    }

    @Override
    public ConfiguracionClonable clonar() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public String toString() {
        return dificultad + ", vol=" + volumen + ", fullscreen=" + pantallaCompleta;
    }
}
