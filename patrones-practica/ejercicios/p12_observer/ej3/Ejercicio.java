/*
 * ==============================================================
 *  Observer — Ejercicio 3
 * ==============================================================
 *  Completa CarritoCompra (sujeto) que notifica a ObservadorCarrito cuando cambia la
 *  cantidad de ítems.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaObserver3.java (no lo modifiques).
 * ==============================================================
 */

package p12_observer.ej3;

import java.util.ArrayList;
import java.util.List;

interface ObservadorCarrito {
    void actualizar(int cantidadItems);
}

interface SujetoCarrito {
    void agregarObservador(ObservadorCarrito observador);
    void eliminarObservador(ObservadorCarrito observador);
    void notificarObservadores();
}

class CarritoCompra implements SujetoCarrito {
    private List<ObservadorCarrito> observadores = new ArrayList<>();
    private int cantidadItems = 0;

    @Override
    public void agregarObservador(ObservadorCarrito observador) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public void eliminarObservador(ObservadorCarrito observador) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public void notificarObservadores() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public void agregarItem() {
        // Completar: incrementar cantidadItems y notificar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
