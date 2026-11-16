/**
 * Cioccolato
 */
public abstract class Cioccolato {

    private String tipoCioccolato;
    private float percentualeCacao;

    public void info(){

        System.out.println("Tipo di cioccolato: " + tipoCioccolato + "\nPercentuale di cacao: " + percentualeCacao);
    }
}