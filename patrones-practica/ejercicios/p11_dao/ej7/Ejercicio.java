/*
 * ==============================================================
 *  DAO — Ejercicio 7
 * ==============================================================
 *  Completa EmpleadoDAO, con el método actualizar(Empleado empleado) que si el
 *  empleado no existe, debe guardarlo como nuevo en lugar de fallar (upsert).
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaDao7.java (no lo modifiques).
 * ==============================================================
 */

package p11_dao.ej7;

import java.util.ArrayList;
import java.util.List;

class Empleado {
    private int id;
    private String nombre;
    private double salario;

    public Empleado(int id, String nombre, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}

interface EmpleadoDAO {
    void guardar(Empleado empleado);
    Empleado buscarPorId(int id);
    List<Empleado> listarTodos();
    void actualizar(Empleado empleado);
}

class EmpleadoDAOImpl implements EmpleadoDAO {
    private List<Empleado> baseDeDatos = new ArrayList<>();

    @Override
    public void guardar(Empleado empleado) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public Empleado buscarPorId(int id) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public List<Empleado> listarTodos() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public void actualizar(Empleado empleado) {
        // Completar: si existe, actualizar su salario; si no existe, guardarlo como nuevo
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
