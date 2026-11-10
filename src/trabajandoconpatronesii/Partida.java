package trabajandoconpatronesii;

public class Partida {

    private Sala sala;
    private Ayuda sistemaAyudaActual;
    private int puntuacion;
    // ... otros atributos

    public Partida(Sala sala, Ayuda sistemaAyudaInicial) {
        this.sala = sala;
        this.sistemaAyudaActual = sistemaAyudaInicial;
    }

    public void setSistemaAyuda(Ayuda nuevoSistema) {
        this.sistemaAyudaActual = nuevoSistema;
    }

    public String solicitarAyuda(Enigma enigmaActual) {
        return sistemaAyudaActual.obtenerPista(enigmaActual, this);
    }
}
