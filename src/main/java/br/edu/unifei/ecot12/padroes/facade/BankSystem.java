package br.edu.unifei.ecot12.padroes.facade;

public class BankSystem {

    public boolean checkSystem(float price){
        System.out.println("Checking if balance is sufficient for $" + price + "...");
        return price >= 500;
    }

    public void deductAmount(float price){
        System.out.println("Deducting $" + price + "from bank...");
    }
}
