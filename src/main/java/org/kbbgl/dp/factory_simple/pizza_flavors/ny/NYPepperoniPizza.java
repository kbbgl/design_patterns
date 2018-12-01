package org.kbbgl.dp.factory_simple.pizza_flavors.ny;

import org.kbbgl.dp.factory_simple.Pizza;

public class NYPepperoniPizza extends Pizza {

    private final String description = this.getClass().getSimpleName();

    public NYPepperoniPizza(String size) {
        super(size);
    }

    @Override
    public String toString() {
        return description + ", " + super.toString();
    }
}
