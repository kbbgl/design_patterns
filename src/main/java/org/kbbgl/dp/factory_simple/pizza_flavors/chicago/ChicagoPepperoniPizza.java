package org.kbbgl.dp.factory_simple.pizza_flavors.chicago;

import org.kbbgl.dp.factory_simple.Pizza;

public class ChicagoPepperoniPizza extends Pizza {

    final String description = this.getClass().getSimpleName();

    public ChicagoPepperoniPizza(String size) {
        super(size);
    }

    @Override
    public String toString() {
        return description + ", " + super.toString();
    }
}
