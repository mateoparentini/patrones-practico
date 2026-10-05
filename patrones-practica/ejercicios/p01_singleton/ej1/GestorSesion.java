/*
 * ==============================================================
 *  Singleton — Ejercicio 1
 * ==============================================================
 *  Completa la clase GestorSesion para implementar el patrón Singleton.
 *  La clase debe mantener una única instancia y un atributo usuarioActivo (String).
 *
 *  - getInstance(): obtiene la única instancia. Si no existe, la crea.
 *  - iniciarSesion(String usuario): asigna el usuario activo.
 *  - cerrarSesion(): pone usuarioActivo en null.
 *  - getUsuarioActivo(): devuelve el usuario activo.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaSingleton1.java (no lo modifiques).
 * ==============================================================
 */

package p01_singleton.ej1;

public class GestorSesion {
    private static GestorSesion instance;
    private String usuarioActivo;

    private GestorSesion() {
        // Completar
    }

    public static GestorSesion getInstance() {
        // Completar
        if(instance == null){
            instance = new GestorSesion();
        }
        return instance;
    }

    public void iniciarSesion(String usuario) {
        // Completar
        usuarioActivo = usuario;
    }

    public void cerrarSesion() {
      usuarioActivo = null;
        // Completar
    }

    public String getUsuarioActivo() {
     return usuarioActivo;   // Completar
    }
}
