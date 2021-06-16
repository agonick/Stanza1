public class Utente {
    /**
     * Classe Utente che permettere di gestire gli utenti del servizio
     * Gli utenti hanno i parametri:
     * param: id, nome, cognome, codice fiscale, credito residuo, casco, patente.
     *
     */
    private String id; // stringa generata da metodo registrazione() in sharingmobilitymain()
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private double creditoResiduo;
    private boolean casco;
    private Patente patente;

    // costruttore
    public Utente(String nome, String cognome, String codiceFiscale, double creditoResiduo, boolean casco, Patente patente) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.creditoResiduo = creditoResiduo;
        this.casco = casco;
        this.patente = patente;
    }

 // getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public double getCreditoResiduo() {
        return creditoResiduo;
    }

    public void setCreditoResiduo(double creditoResiduo) {
        this.creditoResiduo = creditoResiduo;
    }

    public boolean isCasco() {
        return casco;
    }

    public void setCasco(boolean casco) {
        this.casco = casco;
    }

    public Patente getPatente() {
        return patente;
    }

    public void setPatente(Patente patente) {
        this.patente = patente;
    }



}
