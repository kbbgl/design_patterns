package org.kbbgl.dp.decorator_pattern.parent.concrete_beverages;

import org.kbbgl.dp.decorator_pattern.parent.Beverage;

public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 5;
    }
}
