package br.edu.unifei.ecot12.padroes.genericFactory;

public class Main {
    public static void main(String[] args) {
        Dressmaker d = new Dressmaker();
        Confection c = new Confection();

        d.setName("Ana");
        c.setAddress("Brazil");

        System.out.println(d.getName() + ": " + d.manufacturesClothing());
        System.out.println(c.getAddress() + ": " +c.manufacturesClothing());
    }
}
