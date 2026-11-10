package trabajandoconpatronesii;

import java.util.List;

public class Enigma {

    private String nombre;
    private String descripcion;
    private String solucion;
    private boolean resuelto;
    private List<String> pistasDisponibles;
    private int indicePistaActual;

    public Enigma(String nombre, String descripcion, String solucion) {
    }

    public void agregarPista(String pista) {
    }

    public List<String> getPistasDisponibles() {
        return null;
    }

    public int getIndicePistaActual() {
        return 0;
    }

    public void avanzarIndicePista() {
    }

    public String getSolucion() {
        return null;
    }

    public boolean intentarResolver(String intento) {
        return false;
    }

    public boolean isResuelto() {
        return false;
    }
}
