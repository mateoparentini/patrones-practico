/*
 * ==============================================================
 *  Proxy — Ejercicio 2
 * ==============================================================
 *  Completa ProxyCuentaBancaria, que controla el acceso a CuentaBancariaReal según el
 *  PIN ingresado. Si el PIN es correcto, delega la operación; si no, imprime
 *  "PIN incorrecto, acceso denegado".
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaProxy2.java (no lo modifiques).
 * ==============================================================
 */

package p10_proxy.ej2;

interface CuentaBancaria {
    void retirar(double monto);
}

class CuentaBancariaReal implements CuentaBancaria {
    @Override
    public void retirar(double monto) {
        System.out.println("Retirando $" + monto);
    }
}

class ProxyCuentaBancaria implements CuentaBancaria {
    private CuentaBancariaReal cuentaReal = new CuentaBancariaReal();
    private int pinCorrecto;
    private int pinIngresado;

    public ProxyCuentaBancaria(int pinCorrecto, int pinIngresado) {
        this.pinCorrecto = pinCorrecto;
        this.pinIngresado = pinIngresado;
    }

    @Override
    public void retirar(double monto) {
        // Completar: comparar pines y actuar en consecuencia
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
