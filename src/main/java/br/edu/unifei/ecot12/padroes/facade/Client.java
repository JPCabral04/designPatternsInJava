package br.edu.unifei.ecot12.padroes.facade;

public class Client {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment(300.0f);
        System.out.println(); 
        paymentProcessor.processPayment(600.0f); 
    }
}
