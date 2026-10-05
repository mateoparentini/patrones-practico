/*
 * ==============================================================
 *  Prototype — Ejercicio 1
 * ==============================================================
 *  Completa Empleado para que pueda clonarse a sí mismo, conservando nombre y puesto.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaPrototype1.java (no lo modifiques).
 * ==============================================================
 */

package p05_prototype.ej1;

interface EmpleadoClonable {
    EmpleadoClonable clonar();
}

class Empleado implements EmpleadoClonable {
    private String nombre;
    private String puesto;

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
    }

    @Override
    public EmpleadoClonable clonar() {
        // Completar: crear y devolver un nuevo Empleado con los mismos datos
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    @Override
    public String toString() {
        return nombre + " - " + puesto;
    }
}
