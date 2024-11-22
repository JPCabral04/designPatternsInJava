package br.edu.unifei.ecot12.padroes.state;

public class StateB extends State{
    @Override
    public void manipulator(Context context) {
        System.out.println("State B -> State A");
        context.setState(new StateA()); 
    }
}
