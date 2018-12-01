package org.kbbgl.dp.factory_simple;

import org.kbbgl.dp.factory_simple.pizza_flavors.chicago.ChicagoCheesePizza;
import org.kbbgl.dp.factory_simple.pizza_flavors.chicago.ChicagoClamPizza;
import org.kbbgl.dp.factory_simple.pizza_flavors.chicago.ChicagoPepperoniPizza;
import org.kbbgl.dp.factory_simple.pizza_flavors.chicago.ChicagoVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type, String size) {

        Pizza pizza = null;

        switch (type.toLowerCase()) {
            case "pepperoni":
                pizza = new ChicagoPepperoniPizza(size);
                break;
            case "clam":
                pizza = new ChicagoClamPizza(size);
                break;
            case "cheese":
                pizza = new ChicagoCheesePizza(size);
                break;
            case "veggie":
                pizza = new ChicagoVeggiePizza(size);
                break;
        }

        return pizza;
    }

    @Override
    Pizza orderPizza(String type, String size) {
        return super.orderPizza(type, size);
    }
}
