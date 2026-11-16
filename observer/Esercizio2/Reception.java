package Esercizio2;

public class Reception implements Observer {
    
    @Override
    public void update(IngressoSocio evento) {
        
        if (evento.abbonamentoScaduto()) {
            
            System.out.println("Il socio " + evento.nome() + 
                           " ha l'abbonamento scaduto.");
        }
    }
}
