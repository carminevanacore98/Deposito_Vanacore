package Esercizio2;

public class Reverse implements Formattazione{

    @Override
    public String applica(String testo) {
        
        return new StringBuilder(testo).reverse().toString();
    }
    
}
