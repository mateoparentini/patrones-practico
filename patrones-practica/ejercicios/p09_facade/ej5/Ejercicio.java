/*
 * ==============================================================
 *  Facade — Ejercicio 5
 * ==============================================================
 *  Un sistema de streaming tiene AutenticacionUsuario, CargaContenido y
 *  RegistroReproduccion. Completa StreamingFacade con
 *  void reproducirContenido(String usuario, String titulo) que orqueste los tres pasos
 *  y al final imprima "Reproduciendo " + titulo + " para " + usuario.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaFacade5.java (no lo modifiques).
 * ==============================================================
 */

package p09_facade.ej5;

class AutenticacionUsuario {
    public void autenticar(String usuario) {
        System.out.println("Autenticando a " + usuario);
    }
}

class CargaContenido {
    public void cargar(String titulo) {
        System.out.println("Cargando contenido: " + titulo);
    }
}

class RegistroReproduccion {
    public void registrar(String usuario, String titulo) {
        System.out.println("Registrando reproducción de " + usuario);
    }
}

class StreamingFacade {
    private AutenticacionUsuario autenticacion = new AutenticacionUsuario();
    private CargaContenido carga = new CargaContenido();
    private RegistroReproduccion registro = new RegistroReproduccion();

    public void reproducirContenido(String usuario, String titulo) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
