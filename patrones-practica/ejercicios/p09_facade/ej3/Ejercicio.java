/*
 * ==============================================================
 *  Facade — Ejercicio 3
 * ==============================================================
 *  Un sistema de matrícula universitaria tiene VerificacionRequisitos, RegistroCurso
 *  y GeneracionFactura. Completa MatriculaFacade con
 *  void matricular(String alumno, String curso, double costo) que orqueste los tres pasos
 *  y al final imprima "Matrícula completada para " + alumno + " en " + curso.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaFacade3.java (no lo modifiques).
 * ==============================================================
 */

package p09_facade.ej3;

class VerificacionRequisitos {
    public void verificar(String alumno, String curso) {
        System.out.println("Verificando requisitos de " + alumno + " para " + curso);
    }
}

class RegistroCurso {
    public void registrar(String alumno, String curso) {
        System.out.println("Registrando a " + alumno + " en " + curso);
    }
}

class GeneracionFactura {
    public void generar(double costo) {
        System.out.println("Generando factura por $" + costo);
    }
}

class MatriculaFacade {
    private VerificacionRequisitos verificacion = new VerificacionRequisitos();
    private RegistroCurso registro = new RegistroCurso();
    private GeneracionFactura factura = new GeneracionFactura();

    public void matricular(String alumno, String curso, double costo) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
