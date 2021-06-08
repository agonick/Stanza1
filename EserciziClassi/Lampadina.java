package EserciziClassi;

/*Progettare una classe Lampadina che rappresenta una
lampadina elettrica
• La lampadina può essere accesa, spenta o rotta
• Espone due metodi
• stato() che indica lo stato corrente della lampadina
• click() che cambia lo stato da accesa a spenta o da spenta
ad accesa, oppure rompe la lampadina
• Una lampadina si rompe dopo un numero di click
definito dal produttore
• La classe deve contenere uno o più campi che ne descrivano
lo stato
• Un costruttore
• I metodi indicati sopra
Scrivere un main che verifica le funzioni delle classi */

import java.util.Scanner;

public class Lampadina {

    //ATTRIBUTI
    private stato s;
    private int numclick;
    private static corrente presenza;

    //METODI:
    //Costruttori
    public Lampadina(){
        setStato(stato.Spento);
        setNumclick(0);
    }

    public Lampadina(stato s){ //Ho supposto di lasciare comunque il numero di click a 0
        setStato(s);
        setNumclick(0);
    }


    //Set/Get
    public void setStato(stato s) {
        this.s = s;
    }
    public stato getStato() {
        return s;
    }

    public void setNumclick(int numclick) {
        this.numclick = numclick;
    }
    public int getNumclick() {
        return numclick;
    }

    public static corrente getPresenza() { return presenza; }
    public static void setPresenza(corrente presenza) { Lampadina.presenza = presenza; }



    //MetodoCheVogliamoDaTraccia
    public void click(){
        if(getStato() != stato.Rotto){

            if(getNumclick() == 10){
            setStato(stato.Rotto);
                System.out.println("Hai rotto la lampadina!");
            }
            else if(s == stato.Spento) {
                if(getPresenza() == corrente.Si) {
                    setStato(stato.Acceso);
                    System.out.println("Hai acceso la lampadina");
                }
                else {
                    System.out.println("Non c'è corrente! Non puoi accendere la lampadina, vuoi ripristinare la corrente? (Digita 3)");
                } setNumclick(numclick + 1); //HO SUPPOSTO CHE I CLICK VENGONO INCREMENTATI LO STESSO, E MI PORTANO COMUNQUE NELLA CONDIZIONE DI ROMPERE LA LAMPADINA

            }
            else if (s == stato.Acceso) {
                setStato(stato.Spento);
                setNumclick(numclick+1);
                System.out.println("Hai spento la lampadina");
            }

        }
        else System.out.println("Non puoi accendere/spegnere la lampadina, è rotta!");
    }


    public static void main(String[] args) {
        int selezione;
        Scanner scan = new Scanner(System.in);

        Lampadina lamp = new Lampadina();
        Lampadina lamp2 = new Lampadina();
        Interruttore i1 = new Interruttore(statoPulsante.OFF,lamp);
        Interruttore i2 = new Interruttore(statoPulsante.OFF,lamp2);

        //PROVO SE TUTTO FUNZIONA CON LA CORRENTE
        lamp.setPresenza(corrente.No);

        System.out.println("Digita 1 per clickare l'interruttore: ");
        while(lamp.getStato() != stato.Rotto && lamp2.getStato() != stato.Rotto) {
            selezione = scan.nextInt();
            if (selezione == 1) {
                System.out.println("Hai clickato l'interruttore della 1 lampadina!");
                i1.click();
            }
            else if (selezione == 2){
                System.out.println("Hai clickato l'interruttore della 2 lampadina!");
                i2.click();
            }
            else if(selezione == 3 && lamp.getPresenza() == corrente.No){
                lamp.setPresenza(corrente.Si);
                System.out.println("Hai ripristinato la corrente!");
            }
            else System.out.println("Devi digitare 1 per clickare!");
        }

        /*Interruttore i2 = new Interruttore(statoPulsante.OFF,lamp);

        System.out.println("Digita 1 per premere il primo interruttore,2 per premere il secondo: ");

        while(lamp.getStato() != stato.Rotto){

            selezione = scan.nextInt();
            if(selezione == 1)
            i1.click();
            else if (selezione == 2)
            i2.click();
            else System.out.println("Selezione non valida! Puoi premere 1 o 2");

        }*/



    }


}

//ENUM Per l'attributo stato.
enum stato{
    Acceso,Spento,Rotto
}

enum corrente{
    Si,No
}