package br.edu.unifei.ecot12.padroes.bridge;

public class Safe implements WallState{

    @Override
    public void state() {
        System.out.println("The wall is safe!");
    }
    
}
