package br.edu.unifei.ecot12.padroes.state;

public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void request(){
        state.manipulator(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    
}
