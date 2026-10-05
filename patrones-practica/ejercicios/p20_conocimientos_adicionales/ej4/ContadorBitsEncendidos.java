/*
 * ==============================================================
 *  Conocimientos Adicionales (búsqueda binaria y bits) — Ejercicio 4
 * ==============================================================
 *  Completa ContadorBitsEncendidos, que cuenta cuántos bits en 1 tiene la
 *  representación binaria de un número, usando operaciones bit a bit (sin convertir a
 *  String).
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Para probarlo, ejecutá el main de PruebaConocimientosAdicionales4.java (no lo modifiques).
 * ==============================================================
 */

package p20_conocimientos_adicionales.ej4;

public class ContadorBitsEncendidos {

    public int contarBits(int numero) {
        int contador = 0;
        int n = numero;

        while (n > 0) {
            // Completar: si el bit menos significativo de n es 1 (n & 1), incrementar contador
            n = n >> 1; // Completar: desplazar n una posición a la derecha
        }

        return contador;
    }
}
