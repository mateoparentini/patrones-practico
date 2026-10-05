/*
 * ==============================================================
 *  Adapter — Ejercicio 4
 * ==============================================================
 *  La app espera Notificador (método enviar(String mensaje)), pero existe un servicio
 *  externo ServicioSMSExterno con el método sendText(String texto). Completa el adaptador.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaAdapter4.java (no lo modifiques).
 * ==============================================================
 */

package p06_adapter.ej4;

interface Notificador {
    void enviar(String mensaje);
}

class ServicioSMSExterno {
    public void sendText(String texto) {
        System.out.println("SMS enviado: " + texto);
    }
}

class SMSAdapter implements Notificador {
    private ServicioSMSExterno servicioSMS;

    public SMSAdapter(ServicioSMSExterno servicioSMS) {
        this.servicioSMS = servicioSMS;
    }

    @Override
    public void enviar(String mensaje) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
