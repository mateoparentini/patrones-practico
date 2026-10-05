package p03_abstract_factory.ej3;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.*;

/*
 * PRUEBA AUTOMATICA - no hace falta modificar este archivo.
 *
 * Como usarlo: ejecuta el main de esta clase (boton Run del IDE).
 * Es la unica clase de este ejercicio con main.
 *
 * Mientras el ejercicio no este completo, es normal que el compilador
 * marque errores (por ejemplo "missing return statement").
 */
public class PruebaAbstractFactory3 {

    static final PrintStream OUT = System.out;

    static int aciertos = 0;
    static int fallos = 0;

    static void ok(String descripcion) {
        aciertos++;
        OUT.println("  [OK]    " + descripcion);
    }

    static void mal(String descripcion, String detalle) {
        fallos++;
        OUT.println("  [FALLA] " + descripcion);
        if (detalle != null) {
            OUT.println("          " + detalle);
        }
    }

    static void verificar(String descripcion, boolean condicion) {
        if (condicion) {
            ok(descripcion);
        } else {
            mal(descripcion, null);
        }
    }

    static void esperar(String descripcion, Object esperado, Object obtenido) {
        if (Objects.equals(esperado, obtenido)) {
            ok(descripcion);
        } else {
            mal(descripcion, "esperado: " + esperado + "  |  obtenido: " + obtenido);
        }
    }

    static void esperarDouble(String descripcion, double esperado, double obtenido) {
        if (Math.abs(esperado - obtenido) < 1e-6) {
            ok(descripcion);
        } else {
            mal(descripcion, "esperado: " + esperado + "  |  obtenido: " + obtenido);
        }
    }

    // Llama por nombre a un metodo sin parametros (se usa cuando el metodo lo tiene que declarar el alumno,
    // asi el proyecto compila aunque todavia no lo hayas escrito).
    static Object crear(Object objeto, String metodo) {
        java.lang.reflect.Method m = null;
        try {
            m = objeto.getClass().getMethod(metodo);
        } catch (NoSuchMethodException e) {
            Class<?> c = objeto.getClass();
            while (c != null && m == null) {
                try {
                    m = c.getDeclaredMethod(metodo);
                } catch (NoSuchMethodException e2) {
                    c = c.getSuperclass();
                }
            }
        }
        if (m == null) {
            throw new RuntimeException("falta el metodo " + metodo + "() en " + objeto.getClass().getSimpleName());
        }
        try {
            m.setAccessible(true);
            return m.invoke(objeto);
        } catch (java.lang.reflect.InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static String repetir(String texto, int veces) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < veces; i++) {
            sb.append(texto);
        }
        return sb.toString();
    }

    static String capturar(Runnable accion) {
        PrintStream original = OUT;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try {
            System.setOut(new PrintStream(buffer, true, "UTF-8"));
            accion.run();
        } catch (java.io.UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } finally {
            System.setOut(original);
        }
        return new String(buffer.toByteArray(), StandardCharsets.UTF_8);
    }

    static String norm(String s) {
        return s.trim().replaceAll("\\s+", " ");
    }

    static void esperarSalida(String descripcion, String esperado, Runnable accion) {
        String salida;
        try {
            salida = capturar(accion);
        } catch (Throwable t) {
            mal(descripcion, "se lanzo una excepcion: " + t);
            return;
        }
        if (norm(esperado).equals(norm(salida))) {
            ok(descripcion);
        } else {
            mal(descripcion, "esperado: \"" + norm(esperado) + "\"  |  obtenido: \"" + norm(salida) + "\"");
        }
    }

    static void salidaContiene(String descripcion, Runnable accion, String... partes) {
        String salida;
        try {
            salida = norm(capturar(accion));
        } catch (Throwable t) {
            mal(descripcion, "se lanzo una excepcion: " + t);
            return;
        }
        for (String parte : partes) {
            if (!salida.contains(parte)) {
                mal(descripcion, "falta \"" + parte + "\" en la salida: \"" + salida + "\"");
                return;
            }
        }
        ok(descripcion);
    }

    static void salidaNoContiene(String descripcion, Runnable accion, String parte) {
        String salida;
        try {
            salida = norm(capturar(accion));
        } catch (Throwable t) {
            mal(descripcion, "se lanzo una excepcion: " + t);
            return;
        }
        if (salida.contains(parte)) {
            mal(descripcion, "no deberia aparecer \"" + parte + "\" en la salida: \"" + salida + "\"");
        } else {
            ok(descripcion);
        }
    }

    static void esperarExcepcion(String descripcion, Class<? extends Throwable> tipo, String mensaje, Runnable accion) {
        try {
            accion.run();
        } catch (Throwable t) {
            if (!tipo.isInstance(t)) {
                mal(descripcion, "se esperaba " + tipo.getSimpleName() + " pero se lanzo " + t);
            } else if (mensaje != null && !mensaje.equals(t.getMessage())) {
                mal(descripcion, "mensaje esperado: \"" + mensaje + "\"  |  mensaje obtenido: \"" + t.getMessage() + "\"");
            } else {
                ok(descripcion);
            }
            return;
        }
        mal(descripcion, "se esperaba una excepcion " + tipo.getSimpleName() + " pero no se lanzo ninguna");
    }

    public static void main(String[] args) {
        OUT.println("=== Abstract Factory - Ejercicio 3 ===");
        Thread hilo = new Thread(() -> {
            try {
                probar();
            } catch (Throwable t) {
                mal("Se produjo una excepcion inesperada", t.toString());
                StackTraceElement[] pila = t.getStackTrace();
                if (pila.length > 0) {
                    OUT.println("          en " + pila[0]);
                }
            }
        });
        hilo.setDaemon(true);
        hilo.start();
        try {
            hilo.join(10000);
        } catch (InterruptedException e) {
            // nada
        }
        boolean colgado = hilo.isAlive();
        if (colgado) {
            mal("El programa tardo demasiado (posible bucle infinito)", "revisa los while/for del ejercicio");
        }
        OUT.println();
        if (fallos == 0) {
            OUT.println(">>> TODO OK (" + aciertos + " pruebas) <<<");
        } else {
            OUT.println(">>> " + fallos + " prueba(s) fallaron, " + aciertos + " OK <<<");
        }
        if (colgado) {
            System.exit(1);
        }
    }

    static void probar() {
        PizzaFactory a = new VegetarianaFactory();
        PizzaFactory b = new CarnivoraFactory();
        esperarSalida("VegetarianaFactory.crearBase()", "Base integral", () -> ((Base) crear(a, "crearBase")).agregar());
        esperarSalida("VegetarianaFactory.crearTopping()", "Verduras y queso", () -> ((Topping) crear(a, "crearTopping")).agregar());
        esperarSalida("CarnivoraFactory.crearBase()", "Base clásica", () -> ((Base) crear(b, "crearBase")).agregar());
        esperarSalida("CarnivoraFactory.crearTopping()", "Carnes variadas", () -> ((Topping) crear(b, "crearTopping")).agregar());
    }
}
