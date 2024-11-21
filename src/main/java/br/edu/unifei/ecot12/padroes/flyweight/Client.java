package br.edu.unifei.ecot12.padroes.flyweight;

public class Client {
    public static void main(String[] args) {
        FlyWeightFactory factory = new FlyWeightFactory();

        SharedConcreteFlyWeight letterA = factory.getShare("A");
        SharedConcreteFlyWeight letterB = factory.getShare("B");
        SharedConcreteFlyWeight anotherLetterA = factory.getShare("A");

        letterA.operation("Position (10, 20)");
        letterB.operation("Position (30, 40)");
        anotherLetterA.operation("Position (50, 60)");

        System.out.println(letterA == anotherLetterA); // true (the same object is 
        //used in a diffrente position)
    }
}
