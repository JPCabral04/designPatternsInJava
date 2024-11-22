package br.edu.unifei.ecot12.padroes.genericFactory;

public class Shirt extends Dressing {
    private boolean shortSleeve;

    protected Shirt() {}

    public boolean isShortSleeve() {
        return shortSleeve;
    }

    public void setShortSleeve(boolean shortSleeve) {
        this.shortSleeve = shortSleeve;
    }

    @Override
    public String toString() {
        return "Shirt [shortSleeve=" + shortSleeve + "]";
    }
}
