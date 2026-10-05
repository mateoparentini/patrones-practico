/*
 * ==============================================================
 *  Builder — Ejercicio 5
 * ==============================================================
 *  Completa ViajeBuilder para construir un Viaje (destino, dias int, conHotel boolean, conVuelo boolean).
 *
 *  QUÉ HACER:
 *   - Completá el código donde dice "// Completar".
 *   - Borrá las líneas "throw new UnsupportedOperationException" cuando completes.
 *   - Para probarlo, ejecutá el main de PruebaBuilder5.java (no lo modifiques).
 * ==============================================================
 */

package p04_builder.ej5;

class Viaje {
    private String destino;
    private int dias;
    private boolean conHotel;
    private boolean conVuelo;

    public Viaje(String destino, int dias, boolean conHotel, boolean conVuelo) {
        this.destino = destino;
        this.dias = dias;
        this.conHotel = conHotel;
        this.conVuelo = conVuelo;
    }

    @Override
    public String toString() {
        return "Viaje [destino=" + destino + ", dias=" + dias + ", conHotel=" + conHotel + ", conVuelo=" + conVuelo + "]";
    }
}

class ViajeBuilder {
    private String destino;
    private int dias;
    private boolean conHotel;
    private boolean conVuelo;

    public ViajeBuilder setDestino(String destino) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public ViajeBuilder setDias(int dias) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public ViajeBuilder setConHotel(boolean conHotel) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public ViajeBuilder setConVuelo(boolean conVuelo) {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }

    public Viaje build() {
        // Completar
        throw new UnsupportedOperationException("Falta completar"); // <- borrá esta línea cuando completes
    }
}
