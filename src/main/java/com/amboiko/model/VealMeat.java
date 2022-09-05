package com.amboiko.model;

public class VealMeat extends Meat {
    @Override
    public String getTitle() {
        return "Veal";
    }

    @Override
    public double getPrice() {
        return 100;
    }
}
