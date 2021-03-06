package org.kbbgl.dp.factory_simple.pizza_flavors.california;

import org.kbbgl.dp.factory_simple.Pizza;

public class CaliforniaVeggiePizza extends Pizza {

    private final String description = this.getClass().getSimpleName();

    public CaliforniaVeggiePizza(String size) {
        super(size);
    }

    @Override
    public String toString() {
        return description + ", " + super.toString();
    }
}
