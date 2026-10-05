/*
 * ==============================================================
 *  Decorator — Ejercicio 4
 * ==============================================================
 *  Completa el decorador ConDescuento para Producto (precio() double, nombre() String),
 *  que aplica un 10% de descuento sobre el precio.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaDecorator4.java (no lo modifiques).
 * ==============================================================
 */

package p07_decorator.ej4;

interface Producto {
    double precio();
    String nombre();
}

class ProductoSimple implements Producto {
    private String nombre;
    private double precio;

    public ProductoSimple(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double precio() { return precio; }
    @Override
    public String nombre() { return nombre; }
}

abstract class ProductoDecorator implements Producto {
    protected Producto productoDecorado;

    public ProductoDecorator(Producto producto) {
        this.productoDecorado = producto;
    }
}

class ConDescuento extends ProductoDecorator {
    public ConDescuento(Producto producto) {
        super(producto);
    }

    @Override
    public double precio() {
        // Completar: aplicar 10% de descuento
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public String nombre() {
        // Completar: devolver el nombre del producto decorado
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
