/*
 * ==============================================================
 *  Singleton — Ejercicio 2
 * ==============================================================
 *  Completa ContadorVisitas como Singleton. Debe llevar la cuenta de visitas a una página.
 *
 *  - getInstance(): única instancia.
 *  - registrarVisita(): incrementa el contador en 1.
 *  - obtenerTotalVisitas(): devuelve el total.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaSingleton2.java (no lo modifiques).
 * ==============================================================
 */

package p01_singleton.ej2;

public class ContadorVisitas {
    private static ContadorVisitas instancia;
    private int total;

    private ContadorVisitas() {
        // Completar
    }

    public static ContadorVisitas getInstance() {
        // Completar
        if (instancia == null){
            instancia = new ContadorVisitas();
        }
        return instancia;
    }

    public void registrarVisita() {
        // Completar
        total++;
    }

    public int obtenerTotalVisitas() {
        // Completar
        return total;
    }
}
