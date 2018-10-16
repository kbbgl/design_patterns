package org.kbbgl.dp.decorator_pattern.concrete_decorators;

import org.kbbgl.dp.decorator_pattern.parent.Beverage;
import org.kbbgl.dp.decorator_pattern.decorators.AddonDecorator;

public class Caramel extends AddonDecorator {

    public Caramel(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " with caramel";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 1;
    }
}
