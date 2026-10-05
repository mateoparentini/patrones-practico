/*
 * ==============================================================
 *  Decorator — Ejercicio 3
 * ==============================================================
 *  Completa el decorador ConValidacionLongitud para CampoTexto (método validar(String texto)
 *  que devuelve boolean), que además de la validación base, exige que el texto tenga máximo 50 caracteres.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaDecorator3.java (no lo modifiques).
 * ==============================================================
 */

package p07_decorator.ej3;

interface CampoTexto {
    boolean validar(String texto);
}

class CampoTextoSimple implements CampoTexto {
    @Override
    public boolean validar(String texto) {
        return texto != null && !texto.isEmpty();
    }
}

abstract class CampoTextoDecorator implements CampoTexto {
    protected CampoTexto campoDecorado;

    public CampoTextoDecorator(CampoTexto campo) {
        this.campoDecorado = campo;
    }
}

class ConValidacionLongitud extends CampoTextoDecorator {
    public ConValidacionLongitud(CampoTexto campo) {
        super(campo);
    }

    @Override
    public boolean validar(String texto) {
        // Completar: debe cumplir la validación base Y tener longitud <= 50
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
