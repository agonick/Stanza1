



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


    public Database(){

    }

}







