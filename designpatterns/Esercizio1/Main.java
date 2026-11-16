package Esercizio1;

public class Main {
    
    public static void main(String[] args) {
        
        Parcheggio oraria = new TariffaOraria();
        System.out.println(oraria.calcolaCosto(9));

        Parcheggio giornaliera = new TariffaGiornaliera();
        System.out.println(giornaliera.calcolaCosto(9));
    }
}
