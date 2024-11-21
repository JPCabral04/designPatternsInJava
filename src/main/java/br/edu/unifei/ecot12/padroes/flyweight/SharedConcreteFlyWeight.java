package br.edu.unifei.ecot12.padroes.flyweight;

public class SharedConcreteFlyWeight implements FlyWeight {

    private String intrinsicState;

    protected SharedConcreteFlyWeight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("Shared object with intrinsic state: " + intrinsicState +
                " and extrinsic state: " + extrinsicState);
    }

}
