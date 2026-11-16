public class Main {
    
    public static void main(String[] args) {
        
        Fabbrica f = new Fabbrica();
        f.resetGiorno();

        Cioccolato c1 = f.produce("CioccolatoCaldo", 10);
        c1.info();

        f.stampaResoconto();
    }
}
