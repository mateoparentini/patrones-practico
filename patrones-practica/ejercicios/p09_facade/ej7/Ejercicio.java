/*
 * ==============================================================
 *  Facade — Ejercicio 7
 * ==============================================================
 *  Un sistema de biblioteca tiene VerificacionSocio, RegistroPrestamo y
 *  NotificacionDevolucion. Completa BibliotecaFacade con
 *  void prestarLibro(String socio, String libro, String fechaDevolucion) que orqueste
 *  los tres pasos y al final imprima "Préstamo registrado: " + libro + " a " + socio.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaFacade7.java (no lo modifiques).
 * ==============================================================
 */

package p09_facade.ej7;

class VerificacionSocio {
    public void verificar(String socio) {
        System.out.println("Verificando membresía de " + socio);
    }
}

class RegistroPrestamo {
    public void registrar(String socio, String libro) {
        System.out.println("Registrando préstamo de " + libro + " a " + socio);
    }
}

class NotificacionDevolucion {
    public void notificar(String socio, String fechaDevolucion) {
        System.out.println("Fecha de devolución para " + socio + ": " + fechaDevolucion);
    }
}

class BibliotecaFacade {
    private VerificacionSocio verificacion = new VerificacionSocio();
    private RegistroPrestamo prestamo = new RegistroPrestamo();
    private NotificacionDevolucion notificacion = new NotificacionDevolucion();

    public void prestarLibro(String socio, String libro, String fechaDevolucion) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
