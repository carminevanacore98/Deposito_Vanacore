package Esercizio1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Termometro {
    
    private final List<Consumer<Double>> osservatori = new ArrayList<>();

    public void iscrivi(Consumer<Double> c){

        osservatori.add(c);
    }

    public void registra(Double temp){

        for(Consumer<Double> oss : osservatori){

            oss.accept(temp);
        }
    }
}
