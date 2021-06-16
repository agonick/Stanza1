public abstract class VeicoliConTarga extends Veicolo {

    private String targa;
    private Patente patenteRichiesta;
    private int carburante;

    //costruttore
    public VeicoliConTarga(String ID, String posGeo, StatoVeicolo stato, double prezzoXMin,boolean disponibile,String targa, Patente patente, int carburante) {
        super(ID,posGeo,stato,prezzoXMin,disponibile);
        this.targa = targa;
        this.patenteRichiesta = patente;
        setCarburante(carburante);
    }

    //get e set
    public String getTarga() {
        return targa;
    }


    public Patente getPatente() {
        return patenteRichiesta;
    }


    public int getCarburante() {
        return carburante;
    }

    public void setCarburante(int carburante) {
        this.carburante = carburante;
    }


}
