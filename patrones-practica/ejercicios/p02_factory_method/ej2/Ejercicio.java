/*
 * ==============================================================
 *  Factory Method — Ejercicio 2
 * ==============================================================
 *  Completa la fábrica de MedioTransporte para una app de logística.
 *
 *  - MedioTransporte: interfaz con entregar().
 *  - Camion y Barco: implementan entregar().
 *  - TransporteFactory: clase abstracta con crearTransporte().
 *  - CamionFactory y BarcoFactory: implementaciones concretas.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Para probarlo, ejecutá el main de PruebaFactoryMethod2.java (no lo modifiques).
 * ==============================================================
 */

package p02_factory_method.ej2;

interface MedioTransporte {
    void entregar();
}

class Camion implements MedioTransporte {
    @Override
    public void entregar() {
        System.out.println("Entregando por carretera");
    }
}

class Barco implements MedioTransporte {
    @Override
    public void entregar() {
        System.out.println("Entregando por mar");
    }
}

abstract class TransporteFactory {
    // Completar
}

class CamionFactory extends TransporteFactory {
    // Completar
}

class BarcoFactory extends TransporteFactory {
    // Completar
}
