/*
 * ==============================================================
 *  DAO — Ejercicio 2
 * ==============================================================
 *  Completa ClienteDAO, agregando también el método eliminar(int id).
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaDao2.java (no lo modifiques).
 * ==============================================================
 */

package p11_dao.ej2;

import java.util.ArrayList;
import java.util.List;

class Cliente {
    private int id;
    private String nombre;
    private String email;

    public Cliente(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}

interface ClienteDAO {
    void guardar(Cliente cliente);
    Cliente buscarPorId(int id);
    List<Cliente> listarTodos();
    void actualizar(Cliente cliente);
    void eliminar(int id);
}

class ClienteDAOImpl implements ClienteDAO {
    private List<Cliente> baseDeDatos = new ArrayList<>();

    @Override
    public void guardar(Cliente cliente) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public Cliente buscarPorId(int id) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public List<Cliente> listarTodos() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public void actualizar(Cliente cliente) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public void eliminar(int id) {
        // Completar: eliminar de la lista el cliente con ese id
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
