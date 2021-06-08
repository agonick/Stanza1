package EserciziClassi;

/*
Esercizio Biblioteca 🛴

Scrivere un programma che permetta di gestire una Biblioteca semplificata, in grado di gestire un array di indici (interi)
dei libri che contiene. La Biblioteca viene costruita a partire da un array di indici di libri.

In particolare, implementare i seguenti metodi:
- esisteLibro: prende un indice e restituisce true se esiste il libro con questo indice, false altrimenti
- getIndiciLibriOrdinati: ritorna la lista degli indici di libri presenti nella library, in ordine ascendente

Potete utilizzare il codice a questo indirizzo come test:

```
public static void main(String[] args) {
    int[] values = new int[7];
    values[0] = 123;
    values[1] = 4;
    values[2] = 98;
    values[3] = 33;
    values[4] = 76;
    values[5] = 2;
    values[6] = 235;
    Biblioteca library = new Biblioteca(values);
    System.out.println(library.esisteLibro(76));
    int[] libriOrdinati = library.getIndiciLibriOrdinati();
    System.out.println(libriOrdinati[0] == 2);
    System.out.println(libriOrdinati[1] == 4);
    System.out.println(libriOrdinati[2] == 33);
    System.out.println(libriOrdinati[3] == 76);
    System.out.println(libriOrdinati[4] == 98);
    System.out.println(libriOrdinati[5] == 123);
    System.out.println(libriOrdinati[6] == 235);
}
 */

import java.util.Arrays;
import java.util.Scanner;

public class Biblioteca {

    private int[] indiceLibri;

    public Biblioteca(int[] indiceLibri) {
        this.indiceLibri = indiceLibri;
    }

    public int[] getIndiceLibri() {
        return indiceLibri;
    }

    public void setIndiceLibri(int[] indiceLibri) {
        this.indiceLibri = indiceLibri;
    }

    public boolean esisteLibro(int libro) {
        for (int i = 0; i < indiceLibri.length; i++) {
            if (indiceLibri[i] == libro)
                return true;
        }
        return false;
    }

    public int[] getIndiciLibriOrdinati(){
        Arrays.sort(indiceLibri);
        return indiceLibri;
    }




    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        int[] indiciLibri = {3, 2, 5, 10, 6};
        int indice;
        Biblioteca b = new Biblioteca(indiciLibri);

        System.out.println("Inserisci l'indice del libro che vuoi cercare: ");
        indice = scan.nextInt();
        if (b.esisteLibro(indice))
            System.out.println("Il libro è presente nella biblioteca!");
        else System.out.println("Il libro NON è presente nella biblioteca");

        System.out.println("Ecco la lista ordinata degli indici di libri presenti in biblioteca: ");
        b.getIndiciLibriOrdinati();
       */

        int[] values = new int[7];
        values[0] = 123;
        values[1] = 4;
        values[2] = 98;
        values[3] = 33;
        values[4] = 76;
        values[5] = 2;
        values[6] = 235;
        Biblioteca library = new Biblioteca(values);
        if(library.esisteLibro(76))
            System.out.println("Il libro con indice 76 c'è in biblioteca!");

        int[] libriOrdinati = library.getIndiciLibriOrdinati();
        System.out.println("Ho ordinato i libri in biblioteca, ricerco in ordine crescente...");
        System.out.println("Per ogni true, allora i libri sono dove devono essere: ");
        System.out.println(libriOrdinati[0] == 2);
        System.out.println(libriOrdinati[1] == 4);
        System.out.println(libriOrdinati[2] == 33);
        System.out.println(libriOrdinati[3] == 76);
        System.out.println(libriOrdinati[4] == 98);
        System.out.println(libriOrdinati[5] == 123);
        System.out.println(libriOrdinati[6] == 235);

    }


}
