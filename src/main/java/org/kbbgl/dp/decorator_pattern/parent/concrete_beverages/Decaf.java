package org.kbbgl.dp.decorator_pattern.parent.concrete_beverages;

import org.kbbgl.dp.decorator_pattern.parent.Beverage;

public class Decaf extends Beverage {

    @Override
    public String getDescription() {
        return "Decaf";
    }

    @Override
    public double cost() {
        return 2;
    }
}
