public class Fabbrica {
    
    private int MAX_giornaliera;

    public Cioccolato produce(String tipo, int quantita){

        switch (tipo) {
            
            case "Cioccolatino":
                
                if(MAX_giornaliera - quantita >= 0){

                    MAX_giornaliera -= quantita;
                    return new Cioccolatino();
                }
                else{

                    System.out.println("Quantità rimanente giornaliera insufficiente");
                    return null;
                }

            case "Tavoletta":

                if(MAX_giornaliera - quantita >= 0){

                    MAX_giornaliera -= quantita;
                    return new Tavoletta();
                }
                else{

                    System.out.println("Quantità rimanente giornaliera insufficiente");
                    return null;
                }

            case "CioccolatoCaldo":

                if(MAX_giornaliera - quantita >= 0){

                    MAX_giornaliera -= quantita;
                    return new CioccolatoCaldo();
                }
                else{

                    System.out.println("Quantità rimanente giornaliera insufficiente");
                    return null;
                }
        
            default:

                System.out.println("Tipo inesistente");
                return null;
        }
    }

    public void resetGiorno(){

        MAX_giornaliera = 100;
    }
}
