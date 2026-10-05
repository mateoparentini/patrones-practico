/*
 * ==============================================================
 *  Abstract Factory — Ejercicio 4
 * ==============================================================
 *  Fábrica de uniformes deportivos según el equipo (Local / Visitante).
 *
 *  - Camiseta y Short: interfaces con método mostrarColor().
 *  - CamisetaLocal, ShortLocal, CamisetaVisitante, ShortVisitante: implementaciones.
 *  - UniformeFactory: interfaz con crearCamiseta() y crearShort().
 *  - LocalFactory y VisitanteFactory: implementaciones concretas.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Para probarlo, ejecutá el main de PruebaAbstractFactory4.java (no lo modifiques).
 * ==============================================================
 */

package p03_abstract_factory.ej4;

interface Camiseta {
    void mostrarColor();
}
interface Short {
    void mostrarColor();
}

class CamisetaLocal implements Camiseta {
    @Override
    public void mostrarColor() { System.out.println("Camiseta azul (local)"); }
}
class ShortLocal implements Short {
    @Override
    public void mostrarColor() { System.out.println("Short azul (local)"); }
}
class CamisetaVisitante implements Camiseta {
    @Override
    public void mostrarColor() { System.out.println("Camiseta blanca (visitante)"); }
}
class ShortVisitante implements Short {
    @Override
    public void mostrarColor() { System.out.println("Short blanco (visitante)"); }
}

interface UniformeFactory {
    // Completar
}

class LocalFactory implements UniformeFactory {
    // Completar
}

class VisitanteFactory implements UniformeFactory {
    // Completar
}
