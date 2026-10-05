/*
 * ==============================================================
 *  Conocimientos Adicionales (búsqueda binaria y bits) — Ejercicio 2
 * ==============================================================
 *  Completa ConversorBinario, que convierte un número decimal a su representación
 *  binaria como String, usando el método de dividir por 2 y acumular los restos.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Para probarlo, ejecutá el main de PruebaConocimientosAdicionales2.java (no lo modifiques).
 * ==============================================================
 */

package p20_conocimientos_adicionales.ej2;

public class ConversorBinario {

    public String decimalABinario(int numero) {
        if (numero == 0) {
            return "0";
        }

        StringBuilder binario = new StringBuilder();
        int n = numero;

        while (n > 0) {
            int resto = n % 2;
            // Completar: insertar el resto al INICIO de "binario"
            // (pista: binario.insert(0, resto))
            n = n / 2; // Completar: actualizar n dividiéndolo entre 2
        }

        return binario.toString();
    }
}
