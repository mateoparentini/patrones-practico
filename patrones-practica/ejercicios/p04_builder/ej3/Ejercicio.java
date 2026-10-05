/*
 * ==============================================================
 *  Builder — Ejercicio 3
 * ==============================================================
 *  Completa PerfilBuilder para construir un PerfilUsuario (nombre, bio, edad int), con edad opcional (si no se setea, debe valer 0).
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaBuilder3.java (no lo modifiques).
 * ==============================================================
 */

package p04_builder.ej3;

class PerfilUsuario {
    private String nombre;
    private String bio;
    private int edad;

    public PerfilUsuario(String nombre, String bio, int edad) {
        this.nombre = nombre;
        this.bio = bio;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "PerfilUsuario [nombre=" + nombre + ", bio=" + bio + ", edad=" + edad + "]";
    }
}

class PerfilBuilder {
    private String nombre;
    private String bio = "";
    private int edad = 0;

    public PerfilBuilder setNombre(String nombre) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public PerfilBuilder setBio(String bio) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public PerfilBuilder setEdad(int edad) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public PerfilUsuario build() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
