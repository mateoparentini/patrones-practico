/*
 * ==============================================================
 *  Facade — Ejercicio 6
 * ==============================================================
 *  Un sistema de taller mecánico tiene DiagnosticoVehiculo, ReparacionVehiculo y
 *  FacturacionTaller. Completa TallerFacade con
 *  void atenderVehiculo(String placa, String falla, double costo) que orqueste los tres
 *  pasos y al final imprima "Vehículo " + placa + " listo para retirar".
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaFacade6.java (no lo modifiques).
 * ==============================================================
 */

package p09_facade.ej6;

class DiagnosticoVehiculo {
    public void diagnosticar(String placa, String falla) {
        System.out.println("Diagnosticando " + placa + ": " + falla);
    }
}

class ReparacionVehiculo {
    public void reparar(String placa) {
        System.out.println("Reparando vehículo " + placa);
    }
}

class FacturacionTaller {
    public void facturar(double costo) {
        System.out.println("Facturando $" + costo);
    }
}

class TallerFacade {
    private DiagnosticoVehiculo diagnostico = new DiagnosticoVehiculo();
    private ReparacionVehiculo reparacion = new ReparacionVehiculo();
    private FacturacionTaller facturacion = new FacturacionTaller();

    public void atenderVehiculo(String placa, String falla, double costo) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
