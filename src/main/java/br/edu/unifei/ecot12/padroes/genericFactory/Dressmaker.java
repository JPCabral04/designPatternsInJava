package br.edu.unifei.ecot12.padroes.genericFactory;

public class Dressmaker implements Factory<Pants>{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Pants manufacturesClothing() {
        System.out.println("New pants being sewn...");
        return new Pants();
    }
    
    
}
