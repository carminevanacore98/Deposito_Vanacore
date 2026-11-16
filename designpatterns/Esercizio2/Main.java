package Esercizio2;

public class Main {
    
    public static void main(String[] args) {
        
        String testo = "oGgi è uNa bElla gIoRnaTa";

        Formattazione f = new PrimaLetteraMaiuscola();
        System.out.println(f.applica(testo));

        f = new TuttoMaiuscolo();
        System.out.println(f.applica(testo));

        f = new Reverse();
        System.out.println(f.applica(testo));
    }
}
