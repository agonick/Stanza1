public abstract class VeicoliSenzaTarga extends Veicolo {

    private boolean casco;

    //costruttore

    public VeicoliSenzaTarga(String ID,String posGeo, StatoVeicolo stato, double prezzoXMin, boolean casco) {
        super(ID,posGeo,stato,prezzoXMin);
        setCasco(casco);
    }


    //get e set

    public boolean isCasco() {
        return casco;
    }

    public void setCasco(boolean casco) {
        this.casco = casco;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
