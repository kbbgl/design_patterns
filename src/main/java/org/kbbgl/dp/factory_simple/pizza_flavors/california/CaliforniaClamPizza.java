package org.kbbgl.dp.factory_simple.pizza_flavors.california;

import org.kbbgl.dp.factory_simple.Pizza;

public class CaliforniaClamPizza extends Pizza {

    private final String description = this.getClass().getSimpleName();

    public CaliforniaClamPizza(String size) {
        super(size);
    }

    @Override
    public String toString() {
        return description + ", " + super.toString();
    }
}
