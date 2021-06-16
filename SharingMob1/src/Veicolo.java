
public abstract class Veicolo {

    //ATTRIBUTI
    private String ID;
    private String posGeo;
    private StatoVeicolo stato;
    private double prezzoXMin;
    private boolean disponibile;

    //COSTRUTTORE
    public Veicolo(String ID, String posGeo, StatoVeicolo stato, double prezzoXMin,boolean disponibile) {
        setID(ID);
        setPosGeo(posGeo);
        setStato(stato);
        setPrezzoXMin(prezzoXMin);
        setDisponibile(disponibile);
    }

    //GET AND SET
    public String getID() { return ID; }
    public void setID(String ID) { this.ID = ID; }

    public String getPosGeo() { return posGeo; }
    public void setPosGeo(String posGeo) {this.posGeo = posGeo; }

    public StatoVeicolo getStato() { return stato; }
    public void setStato(StatoVeicolo stato) { this.stato = stato; }

    public double getPrezzoXMin() { return prezzoXMin; }
    public void setPrezzoXMin(double prezzoXMin) { this.prezzoXMin = prezzoXMin; }

    public boolean isDisponibile() { return disponibile; }

    public void setDisponibile(boolean disponibile) { this.disponibile = disponibile; }
}

enum StatoVeicolo{
    DISPONIBILE,NONDISPONIBILE;
}