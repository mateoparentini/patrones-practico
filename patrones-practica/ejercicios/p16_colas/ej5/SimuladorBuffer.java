/*
 * ==============================================================
 *  Colas (Queue) — Ejercicio 5
 * ==============================================================
 *  Completa SimuladorBuffer, una cola con capacidad máxima: si está llena, no se puede
 *  agregar más y debe informarlo.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaColas5.java (no lo modifiques).
 * ==============================================================
 */

package p16_colas.ej5;

import java.util.LinkedList;
import java.util.Queue;

public class SimuladorBuffer {
    private Queue<String> buffer = new LinkedList<>();
    private int capacidadMaxima;

    public SimuladorBuffer(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public boolean agregarDato(String dato) {
        // Completar: si buffer.size() ya alcanzó la capacidad máxima, devolver false
        // sin agregar; si hay espacio, agregar (offer) y devolver true
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public String procesarDato() {
        // Completar: usar poll()
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
