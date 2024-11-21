package br.edu.unifei.ecot12.padroes.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private String name;
    private List<Subscriber> subscribers = new ArrayList<>();

    
    public void subscribe(Subscriber s) {
        subscribers.add(s);  
    }

    
    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);  
    }

    
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(this);
        }
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
