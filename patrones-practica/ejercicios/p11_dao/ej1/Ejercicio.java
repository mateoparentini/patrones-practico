/*
 * ==============================================================
 *  DAO — Ejercicio 1
 * ==============================================================
 *  Completa LibroDAO (usando una List<Libro> en memoria como "base de datos") con las
 *  operaciones básicas de un DAO: guardar, buscar por id, listar todos y actualizar.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaDao1.java (no lo modifiques).
 * ==============================================================
 */

package p11_dao.ej1;

import java.util.ArrayList;
import java.util.List;

class Libro {
    private int id;
    private String titulo;

    public Libro(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
}

interface LibroDAO {
    void guardar(Libro libro);
    Libro buscarPorId(int id);
    List<Libro> listarTodos();
    void actualizar(Libro libro);
}

class LibroDAOImpl implements LibroDAO {
    private List<Libro> baseDeDatos = new ArrayList<>();

    @Override
    public void guardar(Libro libro) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public Libro buscarPorId(int id) {
        // Completar: recorrer la lista y devolver el libro cuyo id coincida, o null
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public List<Libro> listarTodos() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public void actualizar(Libro libro) {
        // Completar: buscar el libro existente por id y actualizar su título
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
