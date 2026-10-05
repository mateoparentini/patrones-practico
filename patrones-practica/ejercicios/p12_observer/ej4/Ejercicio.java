/*
 * ==============================================================
 *  Observer — Ejercicio 4
 * ==============================================================
 *  Completa EstacionMeteorologica (sujeto) que notifica a PantallaClima la humedad
 *  actual.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaObserver4.java (no lo modifiques).
 * ==============================================================
 */

package p12_observer.ej4;

import java.util.ArrayList;
import java.util.List;

interface PantallaClima {
    void actualizar(float humedad);
}

interface SujetoClima {
    void agregarPantalla(PantallaClima pantalla);
    void eliminarPantalla(PantallaClima pantalla);
    void notificarPantallas();
}

class EstacionMeteorologica implements SujetoClima {
    private List<PantallaClima> pantallas = new ArrayList<>();
    private float humedad;

    @Override
    public void agregarPantalla(PantallaClima pantalla) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public void eliminarPantalla(PantallaClima pantalla) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public void notificarPantallas() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public void setHumedad(float humedad) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
