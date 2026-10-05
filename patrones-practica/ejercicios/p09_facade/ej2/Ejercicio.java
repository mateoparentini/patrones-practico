/*
 * ==============================================================
 *  Facade — Ejercicio 2
 * ==============================================================
 *  Un sistema de check-in de aeropuerto tiene los subsistemas ValidacionPasaporte,
 *  AsignacionAsiento y EmisionTarjetaEmbarque. Completa CheckInFacade con el método
 *  void realizarCheckIn(String pasajero, String vuelo) que orqueste los tres pasos y al
 *  final imprima "Check-in completado para " + pasajero.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaFacade2.java (no lo modifiques).
 * ==============================================================
 */

package p09_facade.ej2;

class ValidacionPasaporte {
    public void validar(String pasajero) {
        System.out.println("Validando pasaporte de " + pasajero);
    }
}

class AsignacionAsiento {
    public void asignar(String vuelo) {
        System.out.println("Asignando asiento para el vuelo " + vuelo);
    }
}

class EmisionTarjetaEmbarque {
    public void emitir(String pasajero) {
        System.out.println("Emitiendo tarjeta de embarque para " + pasajero);
    }
}

class CheckInFacade {
    private ValidacionPasaporte validacion = new ValidacionPasaporte();
    private AsignacionAsiento asiento = new AsignacionAsiento();
    private EmisionTarjetaEmbarque tarjeta = new EmisionTarjetaEmbarque();

    public void realizarCheckIn(String pasajero, String vuelo) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
