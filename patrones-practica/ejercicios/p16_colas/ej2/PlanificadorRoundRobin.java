/*
 * ==============================================================
 *  Colas (Queue) — Ejercicio 2
 * ==============================================================
 *  Completa PlanificadorRoundRobin, que reparte turnos de CPU entre procesos usando una
 *  Queue<String>: cada vez que se atiende un proceso, se lo vuelve a poner al final de la cola.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaColas2.java (no lo modifiques).
 * ==============================================================
 */

package p16_colas.ej2;

import java.util.LinkedList;
import java.util.Queue;

public class PlanificadorRoundRobin {
    private Queue<String> procesos = new LinkedList<>();

    public void agregarProceso(String nombre) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public String ejecutarSiguienteTurno() {
        // Completar: sacar el proceso del frente (poll), volver a agregarlo
        // al final (offer) y devolver su nombre; si la cola está vacía, devolver null
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
