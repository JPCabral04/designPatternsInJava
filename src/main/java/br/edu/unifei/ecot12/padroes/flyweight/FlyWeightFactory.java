package br.edu.unifei.ecot12.padroes.flyweight;

import java.util.HashMap;

public class FlyWeightFactory {

    private HashMap<String, SharedConcreteFlyWeight> shares = new HashMap<>();

    public SharedConcreteFlyWeight getShare(String key) {
        SharedConcreteFlyWeight share = shares.get(key);
        if (share == null) {
            share = new SharedConcreteFlyWeight(key);
            shares.put(key, share);
        }
        return share;
    }

    public HashMap<String, SharedConcreteFlyWeight> getShares() {
        return shares;
    }

    public void setShares(HashMap<String, SharedConcreteFlyWeight> shares) {
        this.shares = shares;
    }
}
