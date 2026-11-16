public class Tavoletta extends Cioccolato {
    
    private double peso;
    private boolean conAggiunte;
    private int nCioccolatini;

    public void info(){

        super.info();
        System.out.println("nCioccolatini: " + nCioccolatini);
    }
}
