/*
 * ==============================================================
 *  Proxy — Ejercicio 4
 * ==============================================================
 *  Completa ProxyApiExterna, que cachea (guarda en memoria) el resultado de una consulta
 *  costosa a ApiExternaReal, para no repetir la llamada si ya se consultó antes la misma clave.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaProxy4.java (no lo modifiques).
 * ==============================================================
 */

package p10_proxy.ej4;

import java.util.HashMap;
import java.util.Map;

interface ApiExterna {
    String consultar(String clave);
}

class ApiExternaReal implements ApiExterna {
    @Override
    public String consultar(String clave) {
        System.out.println("Consultando API externa para: " + clave);
        return "Resultado de " + clave;
    }
}

class ProxyApiExterna implements ApiExterna {
    private ApiExternaReal apiReal = new ApiExternaReal();
    private Map<String, String> cache = new HashMap<>();

    @Override
    public String consultar(String clave) {
        // Completar: si la clave ya está en cache, devolverla sin llamar a apiReal;
        // si no, consultar, guardar en cache y devolver el resultado
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
