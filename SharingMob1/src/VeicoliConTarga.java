public class VeicoliConTarga extends Veicolo {



    private String targa;
    private Patente patente;
    private int carburante;

//costruttore
    public VeicoliConTarga(String targa, Patente patente, int carburante) {
        this.targa = targa;
        this.patente = patente;
        this.carburante = carburante;
    }

    //get e set
    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }


    public Patente getPatente() {
        return patente;
    }

    public void setPatente(Patente patente) {
        this.patente = patente;
    }


    public int getCarburante() {
        return carburante;
    }

    public void setCarburante(int carburante) {
        this.carburante = carburante;
    }


}
