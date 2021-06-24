



import Veicoli.StatoVeicolo;
import Veicoli.Veicolo;

import java.util.HashMap;
import java.util.Map;

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
    private HashMap<String, Noleggio> DbNoleggi =new HashMap();

    public HashMap<String, Noleggio> getDbNoleggi() {
        return DbNoleggi;
    }

    public void setDbNoleggi(HashMap<String, Noleggio> dbNoleggi) {
        DbNoleggi = dbNoleggi;
    }

    public void aggiungiNoleggio(String idNoleggio, Noleggio n){
        this.getDbNoleggi().put(idNoleggio,n);
    }

    public void rimuoviNoleggio(String idNoleggio) {
        if (this.getDbNoleggi().containsKey(idNoleggio)) {
            this.getDbNoleggi().remove(idNoleggio);
        } else {
            System.out.println("Noleggio non presente");
        }
    }


        public void AggiungiUtente(String id ,Utente U){
            if(getDbUtenti().containsKey(id)){
                System.out.println("Utente Registrato");
            }
            else{
                getDbUtenti().put(id,U);

            }

        }
        public void EliminaUtente(Utente U){
            if(getDbUtenti().containsValue(U)) {
                getDbUtenti().remove(U.getId(),U);
                System.out.println("Utente Eliminato");
            }
            else {
                System.out.println("Utente Inesistente");
            }
        }
    //Metodi Per Ricerca Veicolo se quello selezionato e' gia occupato
    public Veicolo ricercaVeicoloDisponibile(Veicolo vc){
        Veicolo vu=null;
        for (Map.Entry<String, Veicolo> entry : getDbVeicoli().entrySet()) {
            //manca il controllo della disponibilita
            if(entry.getValue().getClass().equals(vc.getClass()) && entry.getValue().getStato()==StatoVeicolo.DISPONIBILE){
                vu= getDbVeicoli().get(entry.getKey());
                System.out.println("il veicolo da ta e' gia prenotato ");
            }
            else {
                System.out.println("nessun");
            }


        }
        System.out.println("eccoti un altro mezzo "+vu.toString());
        return vu;

    }


    public Database(){

    }

}







