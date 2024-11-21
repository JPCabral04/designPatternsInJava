package br.edu.unifei.ecot12.padroes.facade;

public class PaymentProcessor {
    private Internet internet = new Internet();
    private CardMachine creditCardMachine = new CardMachine();
    private BankSystem bankSystem = new BankSystem();

    public void processPayment(float price){
        internet.connect();
        if(bankSystem.checkSystem(price)){
            bankSystem.deductAmount(price);
            creditCardMachine.payBill();
            System.out.println("Payment successful!");
        } else {
            System.out.println("Payment failed: Insufficient balance.");
        }
    }
}
