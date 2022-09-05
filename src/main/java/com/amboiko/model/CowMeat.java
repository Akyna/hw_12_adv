package com.amboiko.model;

import com.amboiko.annotation.ContainsBones;

@ContainsBones
public class CowMeat extends Meat {
    @Override
    public String getTitle() {
        return "Cow";
    }

    @Override
    public double getPrice() {
        return 90;
    }
}
