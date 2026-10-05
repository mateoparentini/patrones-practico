/*
 * ==============================================================
 *  Facade — Ejercicio 4
 * ==============================================================
 *  Un sistema de reserva de hotel tiene DisponibilidadHabitacion, PagoReserva y
 *  ConfirmacionReserva. Completa HotelFacade con
 *  void reservarHabitacion(String huesped, String tipoHabitacion, double monto) que
 *  orqueste los tres pasos y al final imprima "Reserva confirmada para " + huesped.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaFacade4.java (no lo modifiques).
 * ==============================================================
 */

package p09_facade.ej4;

class DisponibilidadHabitacion {
    public void verificar(String tipoHabitacion) {
        System.out.println("Verificando disponibilidad de " + tipoHabitacion);
    }
}

class PagoReserva {
    public void procesar(double monto) {
        System.out.println("Procesando pago de $" + monto);
    }
}

class ConfirmacionReserva {
    public void confirmar(String huesped) {
        System.out.println("Confirmando reserva de " + huesped);
    }
}

class HotelFacade {
    private DisponibilidadHabitacion disponibilidad = new DisponibilidadHabitacion();
    private PagoReserva pago = new PagoReserva();
    private ConfirmacionReserva confirmacion = new ConfirmacionReserva();

    public void reservarHabitacion(String huesped, String tipoHabitacion, double monto) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
