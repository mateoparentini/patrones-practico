/*
 * ==============================================================
 *  Adapter — Ejercicio 2
 * ==============================================================
 *  La app espera ReproductorMedia (método reproducir()), pero hay una clase externa
 *  ReproductorMP4 con el método playVideo(). Completa el adaptador.
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaAdapter2.java (no lo modifiques).
 * ==============================================================
 */

package p06_adapter.ej2;

interface ReproductorMedia {
    void reproducir();
}

class ReproductorMP4 {
    public void playVideo() {
        System.out.println("Reproduciendo video MP4...");
    }
}

class ReproductorAdapter implements ReproductorMedia {
    private ReproductorMP4 reproductorMP4;

    public ReproductorAdapter(ReproductorMP4 reproductorMP4) {
        this.reproductorMP4 = reproductorMP4;
    }

    @Override
    public void reproducir() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
