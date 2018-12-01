package org.kbbgl.dp.factory_simple;

import org.kbbgl.dp.factory_simple.pizza_flavors.ny.NYCheesePizza;
import org.kbbgl.dp.factory_simple.pizza_flavors.ny.NYClamPizza;
import org.kbbgl.dp.factory_simple.pizza_flavors.ny.NYPepperoniPizza;
import org.kbbgl.dp.factory_simple.pizza_flavors.ny.NYVeggiePizza;

class NYPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type, String size) {

        Pizza pizza = null;

        switch (type.toLowerCase()) {
            case "pepperoni":
                pizza = new NYPepperoniPizza(size);
                break;
            case "clam":
                pizza = new NYClamPizza(size);
                break;
            case "cheese":
                pizza = new NYCheesePizza(size);
                break;
            case "veggie":
                pizza = new NYVeggiePizza(size);
                break;
        }

        return pizza;

    }

    @Override
    Pizza orderPizza(String type, String size) {
        return super.orderPizza(type, size);
    }
}
