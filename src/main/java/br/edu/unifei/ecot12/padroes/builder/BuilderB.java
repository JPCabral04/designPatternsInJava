package br.edu.unifei.ecot12.padroes.builder;

public class BuilderB extends Builder{

    @Override
    public void buildProductA(Complex c) {
        c.setProductA(new ProductA());
        c.getProductA().setName("Cake");
    }

    @Override
    public void buildProductB(Complex c) {
        c.setProductB(new ProductB());
        c.getProductB().setsize(22);
    }
    
}
