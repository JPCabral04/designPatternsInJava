package br.edu.unifei.ecot12.padroes.observer;

public class ConcreteSubscriber implements Subscriber {

    private String name;

    @Override
    public void update(Publisher publisher) {
        System.out.println(this.name + " is signing " + publisher.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
