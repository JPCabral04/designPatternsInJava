package br.edu.unifei.ecot12.padroes.templateMethod;

public abstract class Game {
    public int KD(){
        return kill() - death();
    }

    public abstract int kill();
    public abstract int death();
}
