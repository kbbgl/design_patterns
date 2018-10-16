package org.kbbgl.dp.decorator_pattern.decorators;

import org.kbbgl.dp.decorator_pattern.parent.Beverage;

public abstract class AddonDecorator extends Beverage {

    protected Beverage beverage;

    protected AddonDecorator(Beverage beverage) {
        this.beverage = beverage;
    }



    @Override
    public String getDescription() {
        return super.getDescription();
    }

}
