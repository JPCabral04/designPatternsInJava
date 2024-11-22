package br.edu.unifei.ecot12.padroes.state;

public class StateA extends State{
    @Override
    public void manipulator(Context context) {
        System.out.println("State A -> State B");
        context.setState(new StateB()); 
    }
}
