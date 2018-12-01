package org.kbbgl.dp.decorator_pattern.starbuzz.beverages;

import org.kbbgl.dp.decorator_pattern.starbuzz.Beverage;

public class DarkRoast extends Beverage {

    private String size;

    public DarkRoast(String size) {
        this.size = size;
    }

    @Override
    public String getDescription() {
        return "Dark Roast, " + size;
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
        return 1.85;
    }
}
