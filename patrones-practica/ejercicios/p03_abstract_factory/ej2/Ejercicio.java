/*
 * ==============================================================
 *  Abstract Factory — Ejercicio 2
 * ==============================================================
 *  Fábrica de muebles según el estilo (Moderno / Clásico).
 *
 *  - Silla y Mesa: interfaces con método describir().
 *  - SillaModerna, MesaModerna, SillaClasica, MesaClasica: implementaciones.
 *  - MuebleFactory: interfaz con crearSilla() y crearMesa().
 *  - ModernoFactory y ClasicoFactory: implementaciones concretas.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Para probarlo, ejecutá el main de PruebaAbstractFactory2.java (no lo modifiques).
 * ==============================================================
 */

package p03_abstract_factory.ej2;

interface Silla {
    void describir();
}
interface Mesa {
    void describir();
}

class SillaModerna implements Silla {
    @Override
    public void describir() { System.out.println("Silla de diseño moderno"); }
}
class MesaModerna implements Mesa {
    @Override
    public void describir() { System.out.println("Mesa de diseño moderno"); }
}
class SillaClasica implements Silla {
    @Override
    public void describir() { System.out.println("Silla de estilo clásico"); }
}
class MesaClasica implements Mesa {
    @Override
    public void describir() { System.out.println("Mesa de estilo clásico"); }
}

interface MuebleFactory {
    // Completar
}

class ModernoFactory implements MuebleFactory {
    // Completar
}

class ClasicoFactory implements MuebleFactory {
    // Completar
}
