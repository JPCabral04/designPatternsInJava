package br.edu.unifei.ecot12.padroes.singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();

    // Construtor privado para evitar criação de novas instâncias
    private Singleton() {
    }

    // Método público e estático para obter a única instância
    public static Singleton getInstance() {
        return singleton;
    }

}
