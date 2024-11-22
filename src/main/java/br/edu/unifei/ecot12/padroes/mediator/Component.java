package br.edu.unifei.ecot12.padroes.mediator;

public abstract class Component {
    private Mediator mediator;

    public void operation(){
        mediator.sendNotification(this);
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    
}
