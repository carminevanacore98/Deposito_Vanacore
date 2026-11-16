package Esercizio2;

public class Main {
    public static void main(String[] args) {
        
        Palestra palestra = new Palestra();

        Observer reception = new Reception();

        palestra.addObserver(new Log());
        palestra.addObserver(reception);

        System.out.println("Socio in regola");
        palestra.registraIngresso("Mario Rossi", false);

        System.out.println("\nSocio con abbonamento scaduto");
        palestra.registraIngresso("Luigi Verdi", true);

        System.out.println("\nSocio in regola");
        palestra.registraIngresso("Anna Bianchi", false);

        palestra.removeObserver(reception);
        System.out.println("\nReception rimossa dagli osservatori");

        System.out.println("\nSocio con abbonamento scaduto");
        palestra.registraIngresso("Giulia Neri", true);
    }
}
