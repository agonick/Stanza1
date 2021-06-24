package AirBnb;

import java.util.UUID;

/**
 * Classe utente con attributi
 * id
 * nome
 * cognome
 * indirizzomail
 * indirizzo
 * id
 * Prenotazioni--> Pila
 *
 *
 * metodi;
 * ultimaPrenotazione(id)
 *
 */

public class Utente {

    //ATTRIBUTI
    private String id;
    private String nome;
    private String cognome;
    private String indirizzoEmail;


    // COSTRUTTORE
    public Utente(String nome, String cognome, String indirizzoEmail) {
        setId();
        setNome(nome);
        setCognome(cognome);
        setIndirizzoEmail(indirizzoEmail);
    }

    // GETTER AND SETTER

    public String getId() { return id; }
    public void setId() { this.id = UUID.randomUUID().toString(); }

    public String getNome() { return nome; }
    public void setNome(String nome) {
        //Andrebbe gestita l'eccezione null / formato nome senza numeri o simboli.
        this.nome = nome;
    }

    public String getCognome() { return cognome; }
    public void setCognome(String cognome) {
        //Andrebbe gestita l'eccezione null / formato nome senza numeri o simboli.
        this.cognome = cognome; }

    public String getIndirizzoEmail() { return indirizzoEmail; }
    public void setIndirizzoEmail(String indirizzoEmail) {
        //Andrebbe gestita l'eccezione -> il formato deve essere ******@****.it/com/org ...etc
        this.indirizzoEmail = indirizzoEmail;
    }



}
