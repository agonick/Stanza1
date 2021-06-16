public abstract class VeicoliSenzaTarga extends Veicolo {

    private boolean casco;

    //costruttore

    public VeicoliSenzaTarga(String ID,String posGeo, StatoVeicolo stato, double prezzoXMin,boolean disponibile, boolean casco) {
        super(ID,posGeo,stato,prezzoXMin,disponibile);
        setCasco(casco);
    }


    //get e set

    public boolean isCasco() {
        return casco;
    }

    public void setCasco(boolean casco) {
        this.casco = casco;
    }

    
}
