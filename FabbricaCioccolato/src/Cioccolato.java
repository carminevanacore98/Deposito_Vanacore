/**
 * Cioccolato
 */
public abstract class Cioccolato {

    private String tipoCioccolato;
    private float percentualeCacao;
    
    private int MAX_giornaliera;

    public void produce(){

        System.out.println("Tipo di cioccolato: " + tipoCioccolato + "\nPercentuale di cacao: " + percentualeCacao);
    }

}