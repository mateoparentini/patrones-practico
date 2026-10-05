/*
 * ==============================================================
 *  Abstract Factory — Ejercicio 1
 * ==============================================================
 *  Fábrica de componentes de interfaz según el sistema operativo.
 *
 *  - Boton y Checkbox: interfaces, cada una con un método renderizar().
 *  - BotonWindows, BotonMac, CheckboxWindows, CheckboxMac: implementaciones concretas.
 *  - UIFactory: interfaz con crearBoton() y crearCheckbox().
 *  - WindowsFactory y MacFactory: implementaciones concretas de la fábrica.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Para probarlo, ejecutá el main de PruebaAbstractFactory1.java (no lo modifiques).
 * ==============================================================
 */

package p03_abstract_factory.ej1;

interface Boton {
    void renderizar();
}
interface Checkbox {
    void renderizar();
}

class BotonWindows implements Boton {
    @Override
    public void renderizar() { System.out.println("Botón estilo Windows"); }
}
class BotonMac implements Boton {
    @Override
    public void renderizar() { System.out.println("Botón estilo Mac"); }
}
class CheckboxWindows implements Checkbox {
    @Override
    public void renderizar() { System.out.println("Checkbox estilo Windows"); }
}
class CheckboxMac implements Checkbox {
    @Override
    public void renderizar() { System.out.println("Checkbox estilo Mac"); }
}

interface UIFactory {
    // Completar: declarar los dos métodos de creación
}

class WindowsFactory implements UIFactory {
    // Completar
}

class MacFactory implements UIFactory {
    // Completar
}
