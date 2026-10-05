/*
 * ==============================================================
 *  DAO — Ejercicio 6
 * ==============================================================
 *  Completa ReservaDAO, con el método cancelar(int id) que elimina una reserva, y
 *  contarReservasActivas() que devuelve cuántas reservas quedan.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaDao6.java (no lo modifiques).
 * ==============================================================
 */

package p11_dao.ej6;

import java.util.ArrayList;
import java.util.List;

class Reserva {
    private int id;
    private String nombreCliente;

    public Reserva(int id, String nombreCliente) {
        this.id = id;
        this.nombreCliente = nombreCliente;
    }

    public int getId() { return id; }
    public String getNombreCliente() { return nombreCliente; }
}

interface ReservaDAO {
    void guardar(Reserva reserva);
    List<Reserva> listarTodos();
    void cancelar(int id);
    int contarReservasActivas();
}

class ReservaDAOImpl implements ReservaDAO {
    private List<Reserva> baseDeDatos = new ArrayList<>();

    @Override
    public void guardar(Reserva reserva) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public List<Reserva> listarTodos() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public void cancelar(int id) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public int contarReservasActivas() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
