/*
 * ==============================================================
 *  DAO — Ejercicio 3
 * ==============================================================
 *  Completa PedidoDAO, agregando un método adicional listarPorCliente(int clienteId)
 *  que devuelva solo los pedidos de un cliente dado.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaDao3.java (no lo modifiques).
 * ==============================================================
 */

package p11_dao.ej3;

import java.util.ArrayList;
import java.util.List;

class Pedido {
    private int id;
    private int clienteId;
    private double total;

    public Pedido(int id, int clienteId, double total) {
        this.id = id;
        this.clienteId = clienteId;
        this.total = total;
    }

    public int getId() { return id; }
    public int getClienteId() { return clienteId; }
    public double getTotal() { return total; }
}

interface PedidoDAO {
    void guardar(Pedido pedido);
    Pedido buscarPorId(int id);
    List<Pedido> listarTodos();
    List<Pedido> listarPorCliente(int clienteId);
}

class PedidoDAOImpl implements PedidoDAO {
    private List<Pedido> baseDeDatos = new ArrayList<>();

    @Override
    public void guardar(Pedido pedido) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public Pedido buscarPorId(int id) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public List<Pedido> listarTodos() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public List<Pedido> listarPorCliente(int clienteId) {
        // Completar: devolver una nueva lista solo con los pedidos de ese cliente
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
