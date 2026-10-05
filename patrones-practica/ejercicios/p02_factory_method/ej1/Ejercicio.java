/*
 * ==============================================================
 *  Factory Method — Ejercicio 1
 * ==============================================================
 *  Completa el sistema para crear distintos tipos de Instrumento musical.
 *
 *  - Instrumento: interfaz con tocar().
 *  - Guitarra y Piano: implementan tocar().
 *  - InstrumentoFactory: clase abstracta con crearInstrumento().
 *  - GuitarraFactory y PianoFactory: devuelven el instrumento correspondiente.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Para probarlo, ejecutá el main de PruebaFactoryMethod1.java (no lo modifiques).
 * ==============================================================
 */

package p02_factory_method.ej1;

interface Instrumento {
    void tocar();
}

class Guitarra implements Instrumento {
    @Override
    public void tocar() {
        System.out.println("Rasgueando la guitarra");
    }
}

class Piano implements Instrumento {
    @Override
    public void tocar() {
        System.out.println("Tocando el piano");
    }
}

abstract class InstrumentoFactory {
    // Completar: método abstracto de creación
}

class GuitarraFactory extends InstrumentoFactory {
    // Completar
}

class PianoFactory extends InstrumentoFactory {
    // Completar
}
