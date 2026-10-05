/*
 * ==============================================================
 *  Factory Method — Ejercicio 3
 * ==============================================================
 *  Completa la fábrica de Bebida para una cafetería.
 *
 *  - Bebida: interfaz con preparar().
 *  - Cafe y Te: implementan preparar().
 *  - BebidaFactory: clase abstracta con crearBebida().
 *  - CafeFactory y TeFactory: implementaciones concretas.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Para probarlo, ejecutá el main de PruebaFactoryMethod3.java (no lo modifiques).
 * ==============================================================
 */

package p02_factory_method.ej3;

interface Bebida {
    void preparar();
}

class Cafe implements Bebida {
    @Override
    public void preparar() {
        System.out.println("Preparando un café");
    }
}

class Te implements Bebida {
    @Override
    public void preparar() {
        System.out.println("Preparando un té");
    }
}

abstract class BebidaFactory {
    // Completar
}

class CafeFactory extends BebidaFactory {
    // Completar
}

class TeFactory extends BebidaFactory {
    // Completar
}
