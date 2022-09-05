package com.amboiko.model;

import com.amboiko.annotation.Frozen;

@Frozen
public class ChickenMeat extends Meat {
    @Override
    public String getTitle() {
        return "Chicken";
    }

    @Override
    public double getPrice() {
        return 40;
    }
}
