/*
 * ==============================================================
 *  Observer — Ejercicio 5
 * ==============================================================
 *  Completa SistemaTickets (sujeto) que notifica a AgenteSoporte cuando se crea un
 *  nuevo ticket.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaObserver5.java (no lo modifiques).
 * ==============================================================
 */

package p12_observer.ej5;

import java.util.ArrayList;
import java.util.List;

interface AgenteSoporte {
    void notificarNuevoTicket(String descripcion);
}

interface SujetoTickets {
    void agregarAgente(AgenteSoporte agente);
    void eliminarAgente(AgenteSoporte agente);
    void notificarAgentes();
}

class SistemaTickets implements SujetoTickets {
    private List<AgenteSoporte> agentes = new ArrayList<>();
    private String ultimoTicket;

    @Override
    public void agregarAgente(AgenteSoporte agente) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public void eliminarAgente(AgenteSoporte agente) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public void notificarAgentes() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public void crearTicket(String descripcion) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
