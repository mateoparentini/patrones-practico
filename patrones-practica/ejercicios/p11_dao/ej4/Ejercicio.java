/*
 * ==============================================================
 *  DAO — Ejercicio 4
 * ==============================================================
 *  Completa EstudianteDAO, con el método existe(int id) que indica si ya hay un
 *  estudiante guardado con ese id.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaDao4.java (no lo modifiques).
 * ==============================================================
 */

package p11_dao.ej4;

import java.util.ArrayList;
import java.util.List;

class Estudiante {
    private int id;
    private String nombre;

    public Estudiante(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
}

interface EstudianteDAO {
    void guardar(Estudiante estudiante);
    Estudiante buscarPorId(int id);
    List<Estudiante> listarTodos();
    boolean existe(int id);
}

class EstudianteDAOImpl implements EstudianteDAO {
    private List<Estudiante> baseDeDatos = new ArrayList<>();

    @Override
    public void guardar(Estudiante estudiante) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public Estudiante buscarPorId(int id) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public List<Estudiante> listarTodos() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public boolean existe(int id) {
        // Completar: usar buscarPorId y verificar si no es null
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
