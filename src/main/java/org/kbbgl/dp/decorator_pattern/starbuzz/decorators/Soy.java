package org.kbbgl.dp.decorator_pattern.starbuzz.decorators;

import org.kbbgl.dp.decorator_pattern.starbuzz.Beverage;

public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
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
        return 0.69 + beverage.cost();
    }
}
