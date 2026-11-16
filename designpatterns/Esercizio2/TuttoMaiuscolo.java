package Esercizio2;

public class TuttoMaiuscolo implements Formattazione{

    @Override
    public String applica(String testo) {
        
        return testo.toUpperCase();
    }
    
}
