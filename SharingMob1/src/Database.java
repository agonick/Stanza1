package Database;


import Utente.Utente;
import Veicoli.Veicolo;

import java.util.HashMap;

public class Database {
    public HashMap<String, Veicolo> getDbVeicoli() {
        return DbVeicoli;
    }

    public void setDbVeicoli(HashMap<String, Veicolo> dbVeicoli) {
        DbVeicoli = dbVeicoli;
    }

    public HashMap<String, Utente> getDbUtenti() {
        return DbUtenti;
    }

    public void setDbUtenti(HashMap<String, Utente> dbUtenti) { DbUtenti = dbUtenti;
    }

    @Override
    public String toString() {
        return "Database{" +
                "DbUtenti=" + DbUtenti +
                ", DbVeicoli=" + DbVeicoli +
                '}';
    }

    HashMap<String, Utente> DbUtenti = new HashMap();
    HashMap<String, Veicolo> DbVeicoli = new HashMap();
    public Database(){

    }

}







