/*
 * ==============================================================
 *  Strategy — Ejercicio 4
 * ==============================================================
 *  Completa el sistema de compresión de archivos con distintas estrategias (ZIP / RAR).
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaStrategy4.java (no lo modifiques).
 * ==============================================================
 */

package p13_strategy.ej4;

interface EstrategiaCompresion {
    String comprimir(String nombreArchivo);
}

class CompresionZip implements EstrategiaCompresion {
    @Override
    public String comprimir(String nombreArchivo) {
        return nombreArchivo + ".zip";
    }
}

class CompresionRar implements EstrategiaCompresion {
    @Override
    public String comprimir(String nombreArchivo) {
        return nombreArchivo + ".rar";
    }
}

class CompresorArchivos {
    private EstrategiaCompresion estrategia;

    public void setEstrategia(EstrategiaCompresion estrategia) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public String comprimirArchivo(String nombreArchivo) {
        // Completar: validar estrategia no nula (lanzar IllegalStateException con
        // mensaje "No se ha seleccionado una estrategia de compresión") y delegar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
