/*
 * ==============================================================
 *  Adapter — Ejercicio 3
 * ==============================================================
 *  La app espera SensorTemperatura (método leerCelsius() que devuelve double), pero
 *  el sensor de un proveedor externo SensorFahrenheit solo tiene getFahrenheit().
 *  Completa el adaptador, que debe convertir Fahrenheit a Celsius: (f - 32) / 1.8.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaAdapter3.java (no lo modifiques).
 * ==============================================================
 */

package p06_adapter.ej3;

interface SensorTemperatura {
    double leerCelsius();
}

class SensorFahrenheit {
    public double getFahrenheit() {
        return 98.6; // valor de ejemplo
    }
}

class SensorAdapter implements SensorTemperatura {
    private SensorFahrenheit sensorFahrenheit;

    public SensorAdapter(SensorFahrenheit sensorFahrenheit) {
        this.sensorFahrenheit = sensorFahrenheit;
    }

    @Override
    public double leerCelsius() {
        // Completar: obtener Fahrenheit y convertir a Celsius
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
