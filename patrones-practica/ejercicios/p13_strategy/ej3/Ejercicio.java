/*
 * ==============================================================
 *  Strategy — Ejercicio 3
 * ==============================================================
 *  Completa el sistema de rutas de un GPS con distintas estrategias (más corta / más rápida).
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaStrategy3.java (no lo modifiques).
 * ==============================================================
 */

package p13_strategy.ej3;

interface EstrategiaRuta {
    String calcularRuta(String origen, String destino);
}

class RutaMasCorta implements EstrategiaRuta {
    @Override
    public String calcularRuta(String origen, String destino) {
        return "Ruta más corta de " + origen + " a " + destino;
    }
}

class RutaMasRapida implements EstrategiaRuta {
    @Override
    public String calcularRuta(String origen, String destino) {
        return "Ruta más rápida de " + origen + " a " + destino;
    }
}

class NavegadorGPS {
    private EstrategiaRuta estrategia;

    public void setEstrategia(EstrategiaRuta estrategia) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public String obtenerRuta(String origen, String destino) {
        // Completar: validar estrategia no nula (lanzar IllegalStateException con
        // mensaje "No se ha seleccionado una estrategia de ruta") y delegar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
