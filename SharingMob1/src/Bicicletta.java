public class Bicicletta extends VeicoliSenzaTarga{

    //Non abbiamo ulteriori attributi

    //COSTRUTTORE
    public Bicicletta(String ID, String posGeo, StatoVeicolo stato, double prezzoXMin, boolean casco) {
        super(ID, posGeo, stato, prezzoXMin,casco);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
