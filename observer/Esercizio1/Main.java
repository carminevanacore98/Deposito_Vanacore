package Esercizio1;

public class Main {
    
    public static void main(String[] args) {
        
        Termometro termometro = new Termometro();

        termometro.iscrivi(d -> System.out.println("Temperatura " + d));
        termometro.iscrivi(d -> System.out.println("Ventilatore " + (d >= 28D ? "acceso" : "spento")));

        termometro.registra(25D);
        termometro.registra(29D);
        termometro.registra(27D);
    }
}
