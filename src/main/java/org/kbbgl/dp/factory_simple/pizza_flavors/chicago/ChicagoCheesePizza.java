package org.kbbgl.dp.factory_simple.pizza_flavors.chicago;

import org.kbbgl.dp.factory_simple.Pizza;

public class ChicagoCheesePizza extends Pizza {

    final String description = this.getClass().getSimpleName();

    public ChicagoCheesePizza(String size) {
        super(size);
    }

    @Override
    public String toString() {
        return description + ", " + super.toString();
    }
}
