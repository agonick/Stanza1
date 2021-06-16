
public abstract class Veicolo {

    //ATTRIBUTI
    private String ID;
    private String posGeo;
    private StatoVeicolo stato;
    private double prezzoXMin;


    //GET AND SET
    public String getID() { return ID; }
    public void setID(String ID) { this.ID = ID; }

    public String getPosGeo() { return posGeo; }
    public void setPosGeo(String posGeo) {this.posGeo = posGeo; }

    public StatoVeicolo getStato() { return stato; }
    public void setStato(StatoVeicolo stato) { this.stato = stato; }

    public double getPrezzoXMin() { return prezzoXMin; }
    public void setPrezzoXMin(double prezzoXMin) { this.prezzoXMin = prezzoXMin; }


}

enum StatoVeicolo{
    DISPONIBILE,NONDISPONIBILE;
}