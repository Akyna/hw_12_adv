package com.amboiko.model;

public class WildfowlMeat extends Meat {
    @Override
    public String getTitle() {
        return "Wild";
    }

    @Override
    public double getPrice() {
        return 150;
    }

    public boolean isBird() {
        return true;
    }

    protected boolean isBoar() {
        return true;
    }

    private boolean isBear() {
        return true;
    }
}
