

public class Noleggio {
    private Utente utente ;

    public Utente getUtente() {
        return utente;
    }

    public Veicolo getVeicolo() {
        return veicolo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setVeicolo(Veicolo veicolo) {
        this.veicolo = veicolo;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    private Veicolo veicolo;
    private String id;
    public  Noleggio (String id,Veicolo veicolo,Utente utente){
        setId(id);
        setUtente(utente);
        setVeicolo(veicolo);


    }






}