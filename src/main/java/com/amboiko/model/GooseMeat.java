package com.amboiko.model;

import com.amboiko.annotation.Expired;

@Expired
public class GooseMeat extends Meat {
    @Override
    public String getTitle() {
        return "Goose";
    }

    @Override
    public double getPrice() {
        return 37;
    }
}
