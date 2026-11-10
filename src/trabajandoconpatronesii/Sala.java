package trabajandoconpatronesii;

import java.io.Serializable;
import java.util.Objects;

public class Sala implements Comparable<Sala>, Serializable {

    private static final long serialVersionUID = 1L;

    public enum Dificultad {
        BAJA, MEDIA, ALTA
    }

    private String nombre;
    private String tematica;
    private int max_jugadores;
    private Dificultad nivel_dificultad;
    private String tiempo_limite;
    private int max_pistas;
    private Boolean sonido_ambiental;
    private String mensaje_bienvenida;
    private int codigo_acceso;

    public Sala() {
        nombre = "";
        tematica = "";
        max_jugadores = 0;
        nivel_dificultad = Dificultad.BAJA;
        tiempo_limite = "";
        max_pistas = 0;
        sonido_ambiental = false;
        mensaje_bienvenida = "";
        codigo_acceso = 0;
    }

    public Sala(Sala s) {
        this.nombre = s.nombre;
        this.tematica = s.tematica;
        this.max_jugadores = s.max_jugadores;
        this.nivel_dificultad = s.nivel_dificultad;
        this.tiempo_limite = s.tiempo_limite;
        this.max_pistas = s.max_pistas;
        this.sonido_ambiental = s.sonido_ambiental;
        this.mensaje_bienvenida = s.mensaje_bienvenida;
        this.codigo_acceso = s.codigo_acceso;
    }

    private Sala(SalaBuilder builder) {
        // ...
    }

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public int getMax_jugadores() {
        return max_jugadores;
    }

    public void setMax_jugadores(int max_jugadores) {
        this.max_jugadores = max_jugadores;
    }

    public Dificultad getNivel_dificultad() {
        return nivel_dificultad;
    }

    public void setNivel_dificultad(Dificultad nivel_dificultad) {
        this.nivel_dificultad = nivel_dificultad;
    }

    public String getTiempo_limite() {
        return tiempo_limite;
    }

    public void setTiempo_limite(String tiempo_limite) {
        this.tiempo_limite = tiempo_limite;
    }

    public int getMax_pistas() {
        return max_pistas;
    }

    public void setMax_pistas(int max_pistas) {
        this.max_pistas = max_pistas;
    }

    public Boolean getSonido_ambiental() {
        return sonido_ambiental;
    }

    public void setSonido_ambiental(Boolean sonido_ambiental) {
        this.sonido_ambiental = sonido_ambiental;
    }

    public String getMensaje_bienvenida() {
        return mensaje_bienvenida;
    }

    public void setMensaje_bienvenida(String mensaje_bienvenida) {
        this.mensaje_bienvenida = mensaje_bienvenida;
    }

    public int getCodigo_acceso() {
        return codigo_acceso;
    }

    public void setCodigo_acceso(int codigo_acceso) {
        this.codigo_acceso = codigo_acceso;
    }

    // toString()
    @Override
    public String toString() {
        return ("Nombre: " + nombre + ", temática: " + tematica + ", número máximo de jugadores: " + max_jugadores + ", tiempo límite: " + tiempo_limite);
    }

    // hashCode
    @Override
    public int hashCode() {
        return Objects.hash(nombre, tematica, max_jugadores, nivel_dificultad, tiempo_limite, max_pistas, sonido_ambiental, mensaje_bienvenida, codigo_acceso);
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        // Si es el mismo objeto...
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }
        Sala other = (Sala) obj;

        return nombre.equals(other.nombre);
    }

    @Override
    public int compareTo(Sala other) {
        return this.nombre.compareTo(other.nombre);
    }
}
