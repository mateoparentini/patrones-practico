/*
 * ==============================================================
 *  Abstract Factory — Ejercicio 3
 * ==============================================================
 *  Fábrica de ingredientes para pizzas (Vegetariana / Carnívora).
 *
 *  - Base y Topping: interfaces con método agregar().
 *  - BaseVegetariana, ToppingVegetariano, BaseCarnivora, ToppingCarnivoro: implementaciones.
 *  - PizzaFactory: interfaz con crearBase() y crearTopping().
 *  - VegetarianaFactory y CarnivoraFactory: implementaciones concretas.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Para probarlo, ejecutá el main de PruebaAbstractFactory3.java (no lo modifiques).
 * ==============================================================
 */

package p03_abstract_factory.ej3;

interface Base {
    void agregar();
}
interface Topping {
    void agregar();
}

class BaseVegetariana implements Base {
    @Override
    public void agregar() { System.out.println("Base integral"); }
}
class ToppingVegetariano implements Topping {
    @Override
    public void agregar() { System.out.println("Verduras y queso"); }
}
class BaseCarnivora implements Base {
    @Override
    public void agregar() { System.out.println("Base clásica"); }
}
class ToppingCarnivoro implements Topping {
    @Override
    public void agregar() { System.out.println("Carnes variadas"); }
}

interface PizzaFactory {
    // Completar
}

class VegetarianaFactory implements PizzaFactory {
    // Completar
}

class CarnivoraFactory implements PizzaFactory {
    // Completar
}
