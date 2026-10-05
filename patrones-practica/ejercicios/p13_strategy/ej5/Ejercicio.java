/*
 * ==============================================================
 *  Strategy — Ejercicio 5
 * ==============================================================
 *  Completa el sistema de ordenamiento de una lista con distintas estrategias
 *  (ascendente / descendente), usando List<Integer>.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaStrategy5.java (no lo modifiques).
 * ==============================================================
 */

package p13_strategy.ej5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface EstrategiaOrdenamiento {
    List<Integer> ordenar(List<Integer> lista);
}

class OrdenAscendente implements EstrategiaOrdenamiento {
    @Override
    public List<Integer> ordenar(List<Integer> lista) {
        List<Integer> copia = new ArrayList<>(lista);
        Collections.sort(copia);
        return copia;
    }
}

class OrdenDescendente implements EstrategiaOrdenamiento {
    @Override
    public List<Integer> ordenar(List<Integer> lista) {
        List<Integer> copia = new ArrayList<>(lista);
        Collections.sort(copia, Collections.reverseOrder());
        return copia;
    }
}

class OrdenadorLista {
    private EstrategiaOrdenamiento estrategia;

    public void setEstrategia(EstrategiaOrdenamiento estrategia) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public List<Integer> ordenarLista(List<Integer> lista) {
        // Completar: validar estrategia no nula (lanzar IllegalStateException con
        // mensaje "No se ha seleccionado una estrategia de ordenamiento") y delegar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
