/*
 * ==============================================================
 *  Composite — Ejercicio 1
 * ==============================================================
 *  Completa Carpeta (puede contener Archivo u otras Carpeta) para calcular el tamaño
 *  total, siguiendo el mismo modelo que un sistema de archivos.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaComposite1.java (no lo modifiques).
 * ==============================================================
 */

package p08_composite.ej1;

import java.util.ArrayList;
import java.util.List;

interface ElementoArchivo {
    int tamano();
}

class Archivo implements ElementoArchivo {
    private int tamano;

    public Archivo(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public int tamano() {
        return tamano;
    }
}

class Carpeta implements ElementoArchivo {
    private List<ElementoArchivo> elementos = new ArrayList<>();

    public void agregar(ElementoArchivo elemento) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public void eliminar(ElementoArchivo elemento) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public int tamano() {
        // Completar: sumar el tamaño de todos los elementos
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
