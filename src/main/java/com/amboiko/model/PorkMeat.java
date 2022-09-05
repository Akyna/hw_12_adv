package com.amboiko.model;

public class PorkMeat extends Meat {
    @Override
    public String getTitle() {
        return "Pork";
    }

    @Override
    public double getPrice() {
        return 110;
    }
}
