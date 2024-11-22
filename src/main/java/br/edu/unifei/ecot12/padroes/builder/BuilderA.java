package br.edu.unifei.ecot12.padroes.builder;

public class BuilderA extends Builder{

    @Override
    public void buildProductA(Complex c) {
        c.setProductA(new ProductA());
        c.getProductA().setName("Bread");
    }

    @Override
    public void buildProductB(Complex c) {
        c.setProductB(new ProductB());
        c.getProductB().setsize(12);
    }
    
}
