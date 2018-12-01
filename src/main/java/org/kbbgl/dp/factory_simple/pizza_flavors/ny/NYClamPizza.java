package org.kbbgl.dp.factory_simple.pizza_flavors.ny;

import org.kbbgl.dp.factory_simple.Pizza;

public class NYClamPizza extends Pizza {

    final String description = this.getClass().getSimpleName();

    public NYClamPizza(String size) {
        super(size);
    }

    @Override
    public String toString() {
        return description + ", "+ super.toString();
    }
}
