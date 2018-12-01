package org.kbbgl.dp.decorator_pattern.starbuzz.decorators;

import org.kbbgl.dp.decorator_pattern.starbuzz.Beverage;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public String getSize() {
        return beverage.getSize();
    }

    @Override
    public void setSize(String size) {
        beverage.setSize(size);
    }

    @Override
    public double cost() {
        return .59 + beverage.cost();
    }
}
