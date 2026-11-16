package Esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Palestra implements Subject {
    
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        
        observers.remove(o);
    }

    @Override
    public void notifyObservers(IngressoSocio evento) {
        
        for (Observer o : observers) {
            
            o.update(evento);
        }
    }

    public void registraIngresso(String nome, boolean abbonamentoScaduto) {
        
        IngressoSocio evento = new IngressoSocio(nome, abbonamentoScaduto);
        notifyObservers(evento);
    }
}
