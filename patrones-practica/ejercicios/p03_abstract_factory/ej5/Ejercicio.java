/*
 * ==============================================================
 *  Abstract Factory — Ejercicio 5
 * ==============================================================
 *  Fábrica de componentes de base de datos (MySQL / MongoDB).
 *
 *  - Conexion y Consulta: interfaces con método ejecutar().
 *  - ConexionMySQL, ConsultaMySQL, ConexionMongo, ConsultaMongo: implementaciones.
 *  - BaseDatosFactory: interfaz con crearConexion() y crearConsulta().
 *  - MySQLFactory y MongoFactory: implementaciones concretas.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Para probarlo, ejecutá el main de PruebaAbstractFactory5.java (no lo modifiques).
 * ==============================================================
 */

package p03_abstract_factory.ej5;

interface Conexion {
    void ejecutar();
}
interface Consulta {
    void ejecutar();
}

class ConexionMySQL implements Conexion {
    @Override
    public void ejecutar() { System.out.println("Conectando a MySQL"); }
}
class ConsultaMySQL implements Consulta {
    @Override
    public void ejecutar() { System.out.println("Ejecutando consulta SQL"); }
}
class ConexionMongo implements Conexion {
    @Override
    public void ejecutar() { System.out.println("Conectando a MongoDB"); }
}
class ConsultaMongo implements Consulta {
    @Override
    public void ejecutar() { System.out.println("Ejecutando consulta NoSQL"); }
}

interface BaseDatosFactory {
    // Completar
}

class MySQLFactory implements BaseDatosFactory {
    // Completar
}

class MongoFactory implements BaseDatosFactory {
    // Completar
}
