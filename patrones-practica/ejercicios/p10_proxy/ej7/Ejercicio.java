/*
 * ==============================================================
 *  Proxy — Ejercicio 7
 * ==============================================================
 *  Completa ProxyDocumentoConfidencial, similar al ejercicio de documentos visto en clase,
 *  pero ahora controlando el acceso según el departamento del empleado (solo
 *  "Legal" puede ver el documento). Si no pertenece a Legal, debe registrar el intento
 *  fallido con registrarIntentoFallido().
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaProxy7.java (no lo modifiques).
 * ==============================================================
 */

package p10_proxy.ej7;

interface Documento {
    void mostrar();
}

class DocumentoReal implements Documento {
    private String nombre;

    public DocumentoReal(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrar() {
        System.out.println("Mostrando documento confidencial: " + nombre);
    }
}

class Empleado {
    private String nombre;
    private String departamento;

    public Empleado(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public String getNombre() { return nombre; }
    public String getDepartamento() { return departamento; }
}

class ProxyDocumentoConfidencial implements Documento {
    private String nombre;
    private Empleado empleado;
    private DocumentoReal documentoReal;

    public ProxyDocumentoConfidencial(String nombre, Empleado empleado) {
        this.nombre = nombre;
        this.empleado = empleado;
    }

    @Override
    public void mostrar() {
        // Completar: si empleado.getDepartamento() es "Legal", crear (si hace falta)
        // y mostrar el documento real, imprimiendo "Acceso concedido a " + nombre del empleado;
        // si no, imprimir "Acceso denegado a " + nombre + " para el documento " + nombre del documento,
        // y llamar a registrarIntentoFallido()
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public void registrarIntentoFallido() {
        // Completar: imprimir "Intento de acceso fallido registrado para " + nombre del empleado
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
