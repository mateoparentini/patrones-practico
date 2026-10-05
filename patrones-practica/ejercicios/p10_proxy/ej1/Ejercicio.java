/*
 * ==============================================================
 *  Proxy — Ejercicio 1
 * ==============================================================
 *  Completa ProxyArchivo, que controla el acceso a un ArchivoReal (carga costosa, solo
 *  se crea cuando alguien pide verlo por primera vez — Proxy Virtual).
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaProxy1.java (no lo modifiques).
 * ==============================================================
 */

package p10_proxy.ej1;

interface Archivo {
    void mostrar();
}

class ArchivoReal implements Archivo {
    private String nombre;

    public ArchivoReal(String nombre) {
        this.nombre = nombre;
        System.out.println("Cargando archivo pesado: " + nombre);
    }

    @Override
    public void mostrar() {
        System.out.println("Mostrando: " + nombre);
    }
}

class ProxyArchivo implements Archivo {
    private String nombre;
    private ArchivoReal archivoReal;

    public ProxyArchivo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrar() {
        // Completar: crear archivoReal solo si todavía es null, y luego mostrarlo
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
