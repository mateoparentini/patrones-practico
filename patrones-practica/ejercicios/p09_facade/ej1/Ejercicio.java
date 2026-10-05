/*
 * ==============================================================
 *  Facade — Ejercicio 1
 * ==============================================================
 *  Un sistema de compra online tiene los subsistemas Inventario, Pago y Envio
 *  (ya implementados). Completa TiendaFacade con el método
 *  void comprar(String producto, int cantidad, double monto, String direccion)
 *  que orqueste los tres subsistemas en orden y al final imprima
 *  "Compra completada: " + cantidad + " x " + producto.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaFacade1.java (no lo modifiques).
 * ==============================================================
 */

package p09_facade.ej1;

class Inventario {
    public void reservarStock(String producto, int cantidad) {
        System.out.println("Reservando " + cantidad + " de " + producto);
    }
}

class Pago {
    public void cobrar(double monto) {
        System.out.println("Cobrando $" + monto);
    }
}

class Envio {
    public void programarEnvio(String direccion) {
        System.out.println("Programando envío a " + direccion);
    }
}

class TiendaFacade {
    private Inventario inventario = new Inventario();
    private Pago pago = new Pago();
    private Envio envio = new Envio();

    public void comprar(String producto, int cantidad, double monto, String direccion) {
        // Completar: llamar a los 3 subsistemas en orden y luego imprimir el mensaje final
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
