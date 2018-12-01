package org.kbbgl.dp.decorator_pattern.starbuzz.beverages;

import org.kbbgl.dp.decorator_pattern.starbuzz.Beverage;

public class Espresso extends Beverage {

    private String size;

    public Espresso(String size) {
        this.size = size;
    }

    @Override
    public String getDescription() {
        return "Espresso, " + size;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
