/*
 * ==============================================================
 *  Observer — Ejercicio 1
 * ==============================================================
 *  Completa CanalYoutube (sujeto) que notifica a sus Suscriptor (observadores) cuando
 *  sube un nuevo video.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaObserver1.java (no lo modifiques).
 * ==============================================================
 */

package p12_observer.ej1;

import java.util.ArrayList;
import java.util.List;

interface Suscriptor {
    void notificar(String tituloVideo);
}

interface Canal {
    void suscribir(Suscriptor suscriptor);
    void desuscribir(Suscriptor suscriptor);
    void notificarSuscriptores();
}

class CanalYoutube implements Canal {
    private List<Suscriptor> suscriptores = new ArrayList<>();
    private String ultimoVideo;

    @Override
    public void suscribir(Suscriptor suscriptor) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public void desuscribir(Suscriptor suscriptor) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public void notificarSuscriptores() {
        // Completar: recorrer la lista y llamar a notificar() de cada uno
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public void subirVideo(String titulo) {
        // Completar: asignar ultimoVideo y llamar a notificarSuscriptores()
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
