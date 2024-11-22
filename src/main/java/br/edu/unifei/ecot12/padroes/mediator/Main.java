package br.edu.unifei.ecot12.padroes.mediator;

public class Main {
    public static void main(String[] args) {
        ComponentA a = new ComponentA();
        ComponentB b = new ComponentB();
        ConcreteMediator m = new ConcreteMediator(a,b);

        m.sendNotification(a);
        m.sendNotification(b);
        m.sendNotification(b);
    }
}
