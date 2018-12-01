package org.kbbgl.dp.factory_simple.pizza_flavors.california;

import org.kbbgl.dp.factory_simple.Pizza;

public class CaliforniaPepperoniPizza extends Pizza {

    private final String description = "California Pepperoni Pizza";

    public CaliforniaPepperoniPizza(String size) {
        super(size);
    }

    @Override
    public String toString() {
        return description +", " + super.toString();
    }
}
