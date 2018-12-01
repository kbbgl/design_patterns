package org.kbbgl.dp.decorator_pattern.starbuzz.decorators;

import org.kbbgl.dp.decorator_pattern.starbuzz.Beverage;

public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
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
        return 0.49 + beverage.cost();
    }
}
