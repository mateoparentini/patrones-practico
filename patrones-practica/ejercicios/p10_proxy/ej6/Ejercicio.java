/*
 * ==============================================================
 *  Proxy — Ejercicio 6
 * ==============================================================
 *  Completa ProxyRecursoRed, que verifica la conexión a internet (simulada con un
 *  boolean conectado) antes de permitir descargar un recurso.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaProxy6.java (no lo modifiques).
 * ==============================================================
 */

package p10_proxy.ej6;

interface RecursoRed {
    void descargar(String url);
}

class RecursoRedReal implements RecursoRed {
    @Override
    public void descargar(String url) {
        System.out.println("Descargando desde: " + url);
    }
}

class ProxyRecursoRed implements RecursoRed {
    private RecursoRedReal recursoReal = new RecursoRedReal();
    private boolean conectado;

    public ProxyRecursoRed(boolean conectado) {
        this.conectado = conectado;
    }

    @Override
    public void descargar(String url) {
        // Completar: si no hay conexión, imprimir "Sin conexión a internet";
        // si hay, delegar la descarga
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
