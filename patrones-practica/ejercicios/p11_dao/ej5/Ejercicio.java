/*
 * ==============================================================
 *  DAO — Ejercicio 5
 * ==============================================================
 *  Completa FacturaDAO, con el método adicional calcularTotalFacturado() que suma el
 *  monto de todas las facturas guardadas.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaDao5.java (no lo modifiques).
 * ==============================================================
 */

package p11_dao.ej5;

import java.util.ArrayList;
import java.util.List;

class Factura {
    private int id;
    private double monto;

    public Factura(int id, double monto) {
        this.id = id;
        this.monto = monto;
    }

    public int getId() { return id; }
    public double getMonto() { return monto; }
}

interface FacturaDAO {
    void guardar(Factura factura);
    Factura buscarPorId(int id);
    List<Factura> listarTodos();
    double calcularTotalFacturado();
}

class FacturaDAOImpl implements FacturaDAO {
    private List<Factura> baseDeDatos = new ArrayList<>();

    @Override
    public void guardar(Factura factura) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public Factura buscarPorId(int id) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public List<Factura> listarTodos() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public double calcularTotalFacturado() {
        // Completar: recorrer la lista y sumar los montos
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
