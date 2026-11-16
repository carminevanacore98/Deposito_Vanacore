public class Cioccolatino extends Cioccolato {
    
    private String forma;
    private String ripieno;

    public void produce(){

        super.produce();

        System.out.println("Forma cioccolatino: " + forma + "\nRipieno: " + ripieno);
    }
}
