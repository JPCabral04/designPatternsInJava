package br.edu.unifei.ecot12.padroes.builder;

public class Client {
    public static void main(String[] args) {
        Director d = new Director();
        d.setBuilder(new BuilderA());
        Complex c = d.build();

        System.out.println("BuilderA = " + c.getProductA().getName());
        

        
    }
}
