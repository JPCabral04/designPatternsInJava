package br.edu.unifei.ecot12.padroes.observer;

public class Main {
    public static void main(String[] args) {

        Publisher publisher = new Publisher();
        publisher.setName("Channel");

        ConcreteSubscriber subscriber1 = new ConcreteSubscriber();
        ConcreteSubscriber subscriber2 = new ConcreteSubscriber();

        subscriber1.setName("User1");
        subscriber2.setName("User2");

        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);

        publisher.notifySubscribers();

        publisher.unsubscribe(subscriber1);
        System.out.println("\nRemoving first user...");
        publisher.notifySubscribers();
    }
}
