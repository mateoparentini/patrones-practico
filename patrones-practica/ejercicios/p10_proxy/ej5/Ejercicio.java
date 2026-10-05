/*
 * ==============================================================
 *  Proxy — Ejercicio 5
 * ==============================================================
 *  Completa ProxyImpresora, que limita la cantidad de páginas que un usuario puede
 *  imprimir por día. Si supera el límite, imprime "Límite de impresión alcanzado".
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaProxy5.java (no lo modifiques).
 * ==============================================================
 */

package p10_proxy.ej5;

interface Impresora {
    void imprimir(int paginas);
}

class ImpresoraReal implements Impresora {
    @Override
    public void imprimir(int paginas) {
        System.out.println("Imprimiendo " + paginas + " páginas");
    }
}

class ProxyImpresora implements Impresora {
    private ImpresoraReal impresoraReal = new ImpresoraReal();
    private int limiteDiario;
    private int impresasHoy = 0;

    public ProxyImpresora(int limiteDiario) {
        this.limiteDiario = limiteDiario;
    }

    @Override
    public void imprimir(int paginas) {
        // Completar: si impresasHoy + paginas supera el límite, denegar;
        // si no, imprimir, y acumular en impresasHoy
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
