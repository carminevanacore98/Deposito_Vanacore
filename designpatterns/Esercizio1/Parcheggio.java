package Esercizio1;

public interface Parcheggio{

    public static final double tariffaGiornaliera = 10D;
    public static final double tariffaOraria = 2D;

    public double calcolaCosto(int n_ore);
}