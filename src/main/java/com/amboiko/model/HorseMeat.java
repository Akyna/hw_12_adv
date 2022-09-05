package com.amboiko.model;

public class HorseMeat extends Meat {
    @Override
    public String getTitle() {
        return "Horse";
    }

    @Override
    public double getPrice() {
        return 80;
    }
}
