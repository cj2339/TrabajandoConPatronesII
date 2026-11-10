package trabajandoconpatronesii;

public class SalaBuilder {

    private String nombre;
    private String tematica;
    private int max_jugadores;
    private Sala.Dificultad nivel_dificultad;
    private String tiempo_limite;
    private int max_pistas;
    private Boolean sonido_ambiental;
    private String mensaje_bienvenida;
    private int codigo_acceso;

    public SalaBuilder conNombre(String nombre) {
        return this;
    }

    public SalaBuilder conTematica(String tematica) {
        return this;
    }

    public SalaBuilder conMaxJugadores(int maxJugadores) {
        return this;
    }

    public SalaBuilder conTiempoLimite(int tiempoLimite) {
        return this;
    }
    // ... resto de métodos

    public Sala build() {
        return null;
    }
}
