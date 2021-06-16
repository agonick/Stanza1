



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
    private HashMap<Noleggio, Utente> DbNoleggi =new HashMap();

    public HashMap<Noleggio, Utente> getDbNoleggi() {
        return DbNoleggi;
    }

    public void setDbNoleggi(HashMap<Noleggio, Utente> dbNoleggi) {
        DbNoleggi = dbNoleggi;
    }
    
    public void aggiungiNoleggio(Noleggio n, Utente u){
        this.getDbNoleggi().put(n,u);
    }

    public void rimuoviNoleggio(Noleggio n){
        if(this.getDbNoleggi().containsKey(n)){
            this.getDbNoleggi().remove(n)
        }else{
            System.out.println("Noleggio non presente");
             }

    public Database(){

    }

}







