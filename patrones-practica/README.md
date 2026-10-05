# Práctica de Patrones de Diseño y Estructuras de Datos (Java)

Ejercicios de repaso para el examen final de Programación en Java.
**110 ejercicios**, cada uno en su **propia carpeta**, con una **prueba automática** para saber
al instante si tu solución funciona.

No incluye soluciones a propósito: la idea es practicar razonando como en el examen.

## Cómo funciona cada ejercicio

Cada carpeta `ejercicios/p<NN>_<tema>/ej<N>/` tiene solo dos archivos:

| Archivo | Para qué sirve |
|---|---|
| `<Clase>.java` (o `Ejercicio.java`) | La **consigna** (comentario al principio) y el código a completar, donde dice `// Completar` |
| `Prueba<Tema><N>.java` | La prueba automática (por ejemplo `PruebaSingleton1.java`). **No se modifica** |

- Cada ejercicio tiene su propio `package` y su prueba tiene un nombre único, así que podés tener
  los 110 en el mismo proyecto del IDE sin que choquen.
- **El proyecto siempre compila**, aunque no hayas completado nada: donde falta completar hay una línea
  `throw new UnsupportedOperationException("Falta completar")`. **Borrala cuando completes** esa parte.
  Así un ejercicio sin terminar nunca te frena a los demás.

### Para probar un ejercicio

**Desde el IDE:** abrí el archivo `Prueba...java` del ejercicio y ejecutá **su** `main` (el triángulo verde
que aparece junto a `public static void main`).
Si el IDE avisa que el paquete no coincide con la carpeta, marcá la carpeta `ejercicios`
como *Sources Root* (en IntelliJ: clic derecho sobre `ejercicios` → *Mark Directory as* → *Sources Root*).

**Desde la terminal** (Linux / Mac / Git Bash en Windows), parado en la raíz del repo:

```bash
./correr.sh 01 1     # Singleton, ejercicio 1
./correr.sh 10 7     # Proxy, ejercicio 7
```

O a mano, parado en la carpeta del ejercicio:

```bash
javac -encoding UTF-8 -d out *.java
java -cp out p01_singleton.ej1.PruebaSingleton1
```

### Qué vas a ver

```
=== Singleton - Ejercicio 1 ===
  [OK]    getInstance() devuelve siempre la misma instancia
  [FALLA] iniciarSesion asigna el usuario
          esperado: ana  |  obtenido: null

>>> 1 prueba(s) fallaron, 1 OK <<<
```

- Cuando todo está bien, el final dice `>>> TODO OK (N pruebas) <<<`.
- Si todavía falta completar algo, vas a ver `UnsupportedOperationException: Falta completar`
  (es lo esperado, no es un error del proyecto).
- Si tu código entra en un bucle infinito, la prueba lo corta a los 10 segundos y te avisa.
- Necesitás un JDK (Java 8 o superior).

## Notas sobre algunos ejercicios

- **Factory Method y Abstract Factory:** los métodos de creación (`crearInstrumento()`, `crearBoton()`, etc.) los tenés
  que declarar vos; la prueba los busca por nombre, así que el proyecto compila igual aunque todavía no existan.
- **Árboles 2 al 7:** el enunciado dice que `insertar()` ya está implementado, pero el código no lo traía y sin eso
  no se puede armar un árbol para probar. Por eso ya viene escrito dentro de la clase (marcado como
  `YA IMPLEMENTADO`). En el **6** también viene un `enOrden()` auxiliar, solo para poder ver el resultado.
- **Árboles 2 (altura):** se acepta tanto el criterio "árbol vacío = -1" como "árbol vacío = 0", siempre que seas consistente.

## Temas

⭐ = temas con más ejercicios (7 en vez de 5) por ser los que más costaron en la práctica.

### Patrones de diseño

| # | Tema | Ejercicios |
|---|------|------------|
| 01 | [Singleton](ejercicios/p01_singleton/) | 5 |
| 02 | [Factory Method](ejercicios/p02_factory_method/) | 5 |
| 03 | [Abstract Factory](ejercicios/p03_abstract_factory/) | 5 |
| 04 | [Builder](ejercicios/p04_builder/) | 5 |
| 05 | [Prototype](ejercicios/p05_prototype/) ⭐ | 7 |
| 06 | [Adapter](ejercicios/p06_adapter/) | 5 |
| 07 | [Decorator](ejercicios/p07_decorator/) | 5 |
| 08 | [Composite](ejercicios/p08_composite/) | 5 |
| 09 | [Facade](ejercicios/p09_facade/) ⭐ | 7 |
| 10 | [Proxy](ejercicios/p10_proxy/) ⭐ | 7 |
| 11 | [DAO](ejercicios/p11_dao/) ⭐ | 7 |
| 12 | [Observer](ejercicios/p12_observer/) | 5 |
| 13 | [Strategy](ejercicios/p13_strategy/) | 5 |

### Estructuras de datos y algoritmos

| # | Tema | Ejercicios |
|---|------|------------|
| 14 | [Listas Enlazadas](ejercicios/p14_listas_enlazadas/) | 5 |
| 15 | [Pilas (Stack)](ejercicios/p15_pilas/) | 5 |
| 16 | [Colas (Queue)](ejercicios/p16_colas/) | 5 |
| 17 | [Tablas Hash (HashMap)](ejercicios/p17_hash/) | 5 |
| 18 | [Árboles Binarios y Recorridos](ejercicios/p18_arboles/) ⭐ | 7 |
| 19 | [Algoritmos de Ordenamiento](ejercicios/p19_ordenamiento/) | 5 |
| 20 | [Conocimientos Adicionales (búsqueda binaria y bits)](ejercicios/p20_conocimientos_adicionales/) | 5 |

## Subirlo a GitHub

```bash
git init
git add .
git commit -m "Ejercicios de práctica: patrones y estructuras de datos"
git branch -M main
git remote add origin https://github.com/TU_USUARIO/TU_REPO.git
git push -u origin main
```
