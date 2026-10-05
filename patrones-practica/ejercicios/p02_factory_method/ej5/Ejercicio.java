/*
 * ==============================================================
 *  Factory Method — Ejercicio 5
 * ==============================================================
 *  Completa la fábrica de Documento para un editor.
 *
 *  - Documento: interfaz con abrir().
 *  - DocumentoTexto y DocumentoHoja: implementan abrir().
 *  - DocumentoFactory: clase abstracta con crearDocumento().
 *  - DocumentoTextoFactory y DocumentoHojaFactory: implementaciones concretas.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Para probarlo, ejecutá el main de PruebaFactoryMethod5.java (no lo modifiques).
 * ==============================================================
 */

package p02_factory_method.ej5;

interface Documento {
    void abrir();
}

class DocumentoTexto implements Documento {
    @Override
    public void abrir() {
        System.out.println("Abriendo documento de texto");
    }
}

class DocumentoHoja implements Documento {
    @Override
    public void abrir() {
        System.out.println("Abriendo hoja de cálculo");
    }
}

abstract class DocumentoFactory {
    // Completar
}

class DocumentoTextoFactory extends DocumentoFactory {
    // Completar
}

class DocumentoHojaFactory extends DocumentoFactory {
    // Completar
}
