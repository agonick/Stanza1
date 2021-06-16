public class Monopattino extends VeicoliSenzaTarga{

    //ATTRIBUTI
    private int batteria;

    //COSTRUTTORE
    public Monopattino(String ID, String posGeo, StatoVeicolo stato, double prezzoXMin, boolean casco,int batteria) {
        super(ID, posGeo, stato, prezzoXMin,casco);
        setBatteria(batteria);
    }

    //GET AND SET
    public int getBatteria() { return batteria; }
    public void setBatteria(int batteria) { this.batteria = batteria; }

    @Override
    public String toString() {
        return "Stato batteria =" + batteria +
                '}';
    }
}
