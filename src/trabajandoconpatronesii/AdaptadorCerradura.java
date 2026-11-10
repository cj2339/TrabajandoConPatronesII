package trabajandoconpatronesii;

public class AdaptadorCerradura implements Dispositivo {

    private CerraduraElectronica cerraduraExterna;

    public AdaptadorCerradura(CerraduraElectronica cerraduraExterna) {
        this.cerraduraExterna = cerraduraExterna;
    }

    @Override
    public void activar() {
    }

    @Override
    public void desactivar() {
    }
}
