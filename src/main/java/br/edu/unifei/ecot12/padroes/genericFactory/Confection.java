package br.edu.unifei.ecot12.padroes.genericFactory;

public class Confection implements Factory<Shirt> {

    private String address;

    @Override
    public Shirt manufacturesClothing() {
        System.out.println("New shirt in confection...");
        return new Shirt();
    }

    public String getAddress() {
        return address;
    }



    public void setAddress(String address) {
        this.address = address;
    }
    
}
