package br.edu.unifei.ecot12.padroes.builder;

public class Director {
    private Builder builder;

    public Complex build(){
        Complex c = null;
        if(builder != null){
            c = new Complex();
            builder.buildProductA(c);
            builder.buildProductB(c);
        }
        return c;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    
}
