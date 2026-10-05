/*
 * ==============================================================
 *  Prototype — Ejercicio 3
 * ==============================================================
 *  Completa Plantilla de documento (titulo, contenido) con soporte de clonación,
 *  usada para generar varios documentos a partir de una misma base.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaPrototype3.java (no lo modifiques).
 * ==============================================================
 */

package p05_prototype.ej3;

interface PlantillaClonable {
    PlantillaClonable clonar();
}

class Plantilla implements PlantillaClonable {
    private String titulo;
    private String contenido;

    public Plantilla(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    @Override
    public PlantillaClonable clonar() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return titulo + ": " + contenido;
    }
}
