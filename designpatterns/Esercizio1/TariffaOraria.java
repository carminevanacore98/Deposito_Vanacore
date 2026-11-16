package Esercizio1;

public class TariffaOraria implements Parcheggio{

    @Override
    public double calcolaCosto(int n_ore) {
        
        return n_ore * tariffaOraria;
    }
    
}
