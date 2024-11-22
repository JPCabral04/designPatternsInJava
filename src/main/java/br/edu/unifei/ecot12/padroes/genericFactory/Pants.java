package br.edu.unifei.ecot12.padroes.genericFactory;

public class Pants extends Dressing {
    private boolean hasZipper;

    protected Pants() {}

    public boolean hasZipper() {
        return hasZipper;
    }

    public void setHasZipper(boolean hasZipper) {
        this.hasZipper = hasZipper;
    }

    @Override
    public String toString() {
        return "Pants [hasZipper=" + hasZipper + "]";
    }
}
