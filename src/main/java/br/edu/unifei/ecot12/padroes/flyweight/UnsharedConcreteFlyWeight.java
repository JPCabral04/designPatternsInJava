package br.edu.unifei.ecot12.padroes.flyweight;

public class UnsharedConcreteFlyWeight implements FlyWeight {

    @Override
    public void operation(String extrinsicState) {
        System.out.println("Operation in an unshared object with state: " + extrinsicState);
    }
}
