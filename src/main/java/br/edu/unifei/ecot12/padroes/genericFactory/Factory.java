package br.edu.unifei.ecot12.padroes.genericFactory;

public interface Factory <T extends Dressing>{
    T manufacturesClothing();
}
