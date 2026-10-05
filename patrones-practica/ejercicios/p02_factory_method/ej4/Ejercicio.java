/*
 * ==============================================================
 *  Factory Method — Ejercicio 4
 * ==============================================================
 *  Completa la fábrica de Figura geométrica.
 *
 *  - Figura: interfaz con dibujar().
 *  - Circulo y Cuadrado: implementan dibujar().
 *  - FiguraFactory: clase abstracta con crearFigura().
 *  - CirculoFactory y CuadradoFactory: implementaciones concretas.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Para probarlo, ejecutá el main de PruebaFactoryMethod4.java (no lo modifiques).
 * ==============================================================
 */

package p02_factory_method.ej4;

interface Figura {
    void dibujar();
}

class Circulo implements Figura {
    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo");
    }
}

class Cuadrado implements Figura {
    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado");
    }
}

abstract class FiguraFactory {
    // Completar
}

class CirculoFactory extends FiguraFactory {
    // Completar
}

class CuadradoFactory extends FiguraFactory {
    // Completar
}
