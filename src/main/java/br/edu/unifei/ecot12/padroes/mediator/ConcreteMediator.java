package br.edu.unifei.ecot12.padroes.mediator;

public class ConcreteMediator implements Mediator{

    private ComponentA componentA;
    private ComponentB componentB;

    public ConcreteMediator(ComponentA componentA, ComponentB componentB) {
        this.componentA = componentA;
        this.componentB = componentB;

        this.componentA.setMediator(this);
        this.componentB.setMediator(this);
    }
    
    @Override
    public void sendNotification(Component sender){
        if(sender == componentA){
            System.out.println("ComponentA is being called...");
        } else if(sender == componentB){
            System.out.println("ComponentB is being called...");
        }
    }

    public ComponentA getComponentA() {
        return componentA;
    }

    public void setComponentA(ComponentA componentA) {
        this.componentA = componentA;
    }

    public ComponentB getComponentB() {
        return componentB;
    }

    public void setComponentB(ComponentB componentB) {
        this.componentB = componentB;
    }

    
}
