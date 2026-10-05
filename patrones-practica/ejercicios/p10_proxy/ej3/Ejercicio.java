/*
 * ==============================================================
 *  Proxy — Ejercicio 3
 * ==============================================================
 *  Completa ProxyVideo, que registra ("loggea") cada vez que se reproduce un video,
 *  además de delegar la reproducción real.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaProxy3.java (no lo modifiques).
 * ==============================================================
 */

package p10_proxy.ej3;

interface Video {
    void reproducir();
}

class VideoReal implements Video {
    private String titulo;

    public VideoReal(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo: " + titulo);
    }
}

class ProxyVideo implements Video {
    private VideoReal videoReal;

    public ProxyVideo(String titulo) {
        this.videoReal = new VideoReal(titulo);
    }

    @Override
    public void reproducir() {
        // Completar: imprimir "Acceso registrado" y luego reproducir el video real
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
