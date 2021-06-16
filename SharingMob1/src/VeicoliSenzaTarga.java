public class VeicoliSenzaTarga extends Veicolo {


    private boolean casco;



    private int batteria;

    //costruttore
    public VeicoliSenzaTarga(int batteria) {
        this.batteria = batteria;
    }


    public VeicoliSenzaTarga(boolean casco) {
        this.casco = casco;
    }


    //get e set

    public boolean isCasco() {
        return casco;
    }

    public void setCasco(boolean casco) {
        this.casco = casco;
    }

    public int getBatteria() {
        return batteria;
    }

    public void setBatteria(int batteria) {
        this.batteria = batteria;
    }
    
}
