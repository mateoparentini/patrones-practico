/*
 * ==============================================================
 *  Observer — Ejercicio 2
 * ==============================================================
 *  Completa AccionBolsa (sujeto) que notifica a sus InversorObservador cuando cambia
 *  el precio.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaObserver2.java (no lo modifiques).
 * ==============================================================
 */

package p12_observer.ej2;

import java.util.ArrayList;
import java.util.List;

interface InversorObservador {
    void actualizarPrecio(double nuevoPrecio);
}

interface SujetoAccion {
    void agregarInversor(InversorObservador inversor);
    void eliminarInversor(InversorObservador inversor);
    void notificarInversores();
}

class AccionBolsa implements SujetoAccion {
    private List<InversorObservador> inversores = new ArrayList<>();
    private double precio;

    @Override
    public void agregarInversor(InversorObservador inversor) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public void eliminarInversor(InversorObservador inversor) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public void notificarInversores() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public void setPrecio(double precio) {
        // Completar: asignar precio y notificar a los inversores
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
