package org.kbbgl.dp.decorator_pattern.starbuzz.beverages;

import org.kbbgl.dp.decorator_pattern.starbuzz.Beverage;

public class HouseBlend extends Beverage {

    private String size;

    public HouseBlend(String size) {
        this.size = size;
    }

    @Override
    public String getDescription() {
        return "House Blend, " + size;
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
        return .89;
    }

}
