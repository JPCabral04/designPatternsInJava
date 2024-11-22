package br.edu.unifei.ecot12.padroes.builder;

public class Complex {
    private ProductA productA;
    private ProductB productB;

    public ProductA getProductA() {
        return productA;
    }
    public void setProductA(ProductA productA) {
        this.productA = productA;
    }
    public ProductB getProductB() {
        return productB;
    }
    public void setProductB(ProductB productB) {
        this.productB = productB;
    }

}
