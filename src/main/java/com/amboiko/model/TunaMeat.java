package com.amboiko.model;

import com.amboiko.annotation.Frozen;

@Frozen
public class TunaMeat extends Meat {
    @Override
    public String getTitle() {
        return "Tuna";
    }

    @Override
    public double getPrice() {
        return 190;
    }
}
