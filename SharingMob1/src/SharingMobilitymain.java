public class SharingMobilitymain {

    private static int progressivo=0;

    public static int getProgressivo(){
        return progressivo;
    }

    public void incrementaProgressivo(){
        progressivo++;
    }

    public void registraUtente(Utente utente) {
        utente.setId(generaStringautente(utente));
        incrementaProgressivo();
         db.aggiungiUtente(utente.getId())
        System.out.println("Utente registrato correttamente!");
    }
    public static String generaStringautente(Utente u){
    return u.getCognome().charAt(0)+u.getCognome().charAt(1)+u.getNome().charAt(0)+u.getNome().charAt(1) + String.valueOf(getProgressivo());
    }

    public void affittaVeicolo(Utente U, Veicolo V, int tempo){
        // controlla se utente è registrato id != null
        // controlla se veicolo è libero stato = DISPONIBILE
        // controlla se utente ha credito minimo
        // controlla se veicolo ha carburante minimo
        // controlla tempo del noleggio
        // crea un nuovo noleggio
        // aggiunge a database noleggio
        // aggiorna gli stati
    }

    public void restituisciVeicolo(Utente u, Veicolo v){
        // togli noleggio da database noleggio
        // aggiorna stato veicolo
    }


    




    


}
