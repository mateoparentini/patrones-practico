/*
 * ==============================================================
 *  Adapter — Ejercicio 5
 * ==============================================================
 *  La app espera LectorArchivo (método leer() que devuelve String), pero una librería
 *  externa LectorXMLAntiguo solo tiene parseXML() que devuelve String. Completa el adaptador.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaAdapter5.java (no lo modifiques).
 * ==============================================================
 */

package p06_adapter.ej5;

interface LectorArchivo {
    String leer();
}

class LectorXMLAntiguo {
    public String parseXML() {
        return "<datos>contenido del xml</datos>";
    }
}

class LectorXMLAdapter implements LectorArchivo {
    private LectorXMLAntiguo lectorXML;

    public LectorXMLAdapter(LectorXMLAntiguo lectorXML) {
        this.lectorXML = lectorXML;
    }

    @Override
    public String leer() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
