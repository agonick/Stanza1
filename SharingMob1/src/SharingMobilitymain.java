public class SharingMobilitymain {

    private static int progressivo=0;

    public static int getProgressivo(){
        return progressivo;
    }

    public void incrementaProgressivo(){
        progressivo++;
    }

    public void registraUtente(Utente utente) {
        if (utente.getId() == null) {
            utente.setId(generaStringautente(utente));
            incrementaProgressivo();
            System.out.println("Utente registrato correttamente!");
        } else { System.out.println("utente già registrato"); }
    }

    public static String generaStringautente(Utente u){
    return u.getCognome().charAt(0)+u.getCognome().charAt(1)+u.getNome().charAt(0)+u.getNome().charAt(1) + String.valueOf(getProgressivo());
    }


    


}
