/*
 * ==============================================================
 *  Singleton — Ejercicio 3
 * ==============================================================
 *  Completa ConfiguracionApp, un Singleton que guarda pares clave-valor de configuración
 *  usando un Map<String, String>.
 *
 *  - getInstance(): única instancia (el mapa se crea vacío en el constructor).
 *  - set(String clave, String valor): guarda/actualiza un valor.
 *  - get(String clave): devuelve el valor asociado o null si no existe.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaSingleton3.java (no lo modifiques).
 * ==============================================================
 */

package p01_singleton.ej3;

import java.util.HashMap;
import java.util.Map;

public class ConfiguracionApp {
    private static ConfiguracionApp instancia;
    private Map<String, String> valores;

    private ConfiguracionApp() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public static ConfiguracionApp getInstance() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public void set(String clave, String valor) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public String get(String clave) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
