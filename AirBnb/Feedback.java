package AirBnb;

/**
 * titolo
 * testo
 * id
 * punteggio
 *
 */

public class Feedback {
    public String getTitolo() { return titolo; }
    public void setTitolo(String titolo) { this.titolo = titolo;}
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getTesto() { return testo; }
    public void setTesto(String testo) { this.testo = testo; }
    public int getValutazione() { return valutazione.getValue(); }
    //fine Costruttori


    public void setValutazione(Valutazione valutazione) {
        this.valutazione = valutazione;
    }

    private String titolo;
    private String id;
    private String testo;
    private Valutazione valutazione;

    public Feedback(String titolo,String id,String testo) {
        this.titolo = titolo;
    }
}
enum Valutazione{
    //valutazione che prenderea in ingresso sempre un int(1-5) restituira valore del feedback
    PESSIMO(1),SCARSO(2),DISCRETO(3),BUONO(4),OTTIMO(5);
    private final int value;
    private Valutazione(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}

