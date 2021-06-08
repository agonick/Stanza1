package EserciziClassi;

/*
Esercizio 2
Progettare una classe Interruttore per la lampadina dell'esercizio 1

* Ogni interruttore regola il comportamento di una lampadina
* Definire campi e metodi necessari al funzionamento dell'interruttore
* Creare una classe di test che, dopo aver istanziato due interruttori collegati alla stessa lampadina, permetta
  all'utente di utilizzare il primo o il secondo interruttore interagendo tramite la console, finchè non decide di
  interrompere l'interazione
 */

public class Interruttore {
    private statoPulsante sp;
    private Lampadina lamp;

    public Interruttore() {
        this.sp = sp.OFF;
        Lampadina lamp = new Lampadina();
    }
    public Interruttore(statoPulsante sp,Lampadina lamp) {
        this.sp = sp;
        this.lamp = lamp;
    }

    public statoPulsante getSp() {
        return sp;
    }
    public void setSp(statoPulsante sp) {
        this.sp = sp;
    }

    public Lampadina getLamp() {
        return lamp;
    }

    public void setLamp(Lampadina lamp) {
        this.lamp = lamp;
    }

    public void click(){
        if(sp == statoPulsante.OFF) {
            setSp(statoPulsante.ON);
            lamp.click();
        }
        else if(sp == statoPulsante.ON) {
            setSp(statoPulsante.OFF);
            lamp.click();
        }
    }

}

enum statoPulsante{
    OFF,ON;
}


/* Esercizio 3:

Modificare la classe Lampadina facendo in modo che tutte le lampadine condividano l'informazione relativa alla presenza
di corrente all'interno di un ipotetico impianto. Possiamo immaginare che tutte le lampadine siano collegate allo stesso
impianto di corrente

Le lampadine devono comportarsi in modo coerente rispetto alla presenza o assenza di corrente all'interno dell'impianto

Quando non c'è corrente una lampadina può essere solamente negli stati "rotto" o "spento"

Scrivere una classe di test che verifichi il comportamento delle lampadine rispetto alla presenza di corrente nell'impianto
 */