public class CioccolatoCaldo extends Cioccolato {

    private double temperatura;
    private String densita;
    private int quantita;

    public CioccolatoCaldo(int quantita){

        this.quantita = quantita;
    }

    public void info(){

        System.out.println("CioccolatoCaldo fatto con " + quantita + " cioccolata.");
    }
}
