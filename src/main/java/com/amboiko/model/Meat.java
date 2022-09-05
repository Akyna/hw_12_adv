package com.amboiko.model;

import com.amboiko.annotation.MeatSort;

@MeatSort
public abstract class Meat {
    public abstract String getTitle();

    public abstract double getPrice();
}
