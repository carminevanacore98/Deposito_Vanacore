package Esercizio2;

public class Log implements Observer {
    
    @Override
    public void update(IngressoSocio evento) {
        
        System.out.println("Ingresso registrato.\nSocio: " + evento.nome() + 
                           "\nAbbonamento scaduto: " + evento.abbonamentoScaduto());
    }
}
