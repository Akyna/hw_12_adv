package com.amboiko.model;

import com.amboiko.annotation.MeatSort;
import com.amboiko.common.MeatType;

@MeatSort(sort = MeatType.PREMIUM)
public class SalmonMeat extends Meat {
    @Override
    public String getTitle() {
        return "Salmon";
    }

    @Override
    public double getPrice() {
        return 200;
    }
}
