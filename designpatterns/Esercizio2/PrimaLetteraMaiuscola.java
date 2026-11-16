package Esercizio2;

public class PrimaLetteraMaiuscola implements Formattazione{

    @Override
    public String applica(String testo) {
        
        String[] arr = testo.split(" ");
        String risultato = "";

        for(int i = 0; i < arr.length; ++i){

            risultato += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1) + " ";
        }
        risultato.strip();

        return risultato;
    }
    
}
