package br.edu.unifei.ecot12.padroes.state;

public class Main {
    public static void main(String[] args) {

        Context c = new Context(new StateA());
        
        c.request();
        c.request();

    }
}
