package org.kbbgl.dp.factory_simple.pizza_flavors.chicago;

import org.kbbgl.dp.factory_simple.Pizza;

public class ChicagoClamPizza extends Pizza {

    final String description = this.getClass().getSimpleName();

    public ChicagoClamPizza(String size) {
        super(size);
    }

    @Override
    public String toString() {
        return description + ", " + super.toString();
    }
}
