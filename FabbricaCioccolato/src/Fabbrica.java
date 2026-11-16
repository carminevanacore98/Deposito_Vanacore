import java.util.ArrayList;
import java.util.List;

public class Fabbrica {
    
    private int MAX_giornaliera;
    private List<Cioccolato> cioccolataProdottaOggi = new ArrayList<>();

    public Cioccolato produce(String tipo, int quantita){

        switch (tipo) {
            
            case "Cioccolatino":
                
                if(MAX_giornaliera - quantita >= 0){

                    MAX_giornaliera -= quantita;
                    cioccolataProdottaOggi.addFirst(new Cioccolatino());
                    return cioccolataProdottaOggi.getFirst();
                }
                else{

                    System.out.println("Quantità rimanente giornaliera insufficiente");
                    return null;
                }

            case "Tavoletta":

                if(MAX_giornaliera - quantita >= 0){

                    MAX_giornaliera -= quantita;
                    cioccolataProdottaOggi.addFirst(new Tavoletta());
                    return cioccolataProdottaOggi.getFirst();
                }
                else{

                    System.out.println("Quantità rimanente giornaliera insufficiente");
                    return null;
                }

            case "CioccolatoCaldo":

                if(MAX_giornaliera - quantita >= 0){

                    if(quantita >= 20){

                        MAX_giornaliera -= quantita;
                        cioccolataProdottaOggi.addFirst(new CioccolatoCaldo(quantita));
                        return cioccolataProdottaOggi.getFirst();
                    }
                    else{

                        System.out.println("Per fare la cioccolata calda servono almeno 20 cioccolato");
                        return null;
                    }
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
        cioccolataProdottaOggi.clear();
    }

    public void stampaResoconto(){

        System.out.println("");
    }
}
