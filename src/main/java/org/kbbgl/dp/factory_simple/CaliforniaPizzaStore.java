package org.kbbgl.dp.factory_simple;

import org.kbbgl.dp.factory_simple.pizza_flavors.california.CaliforniaCheesePizza;
import org.kbbgl.dp.factory_simple.pizza_flavors.california.CaliforniaClamPizza;
import org.kbbgl.dp.factory_simple.pizza_flavors.california.CaliforniaPepperoniPizza;
import org.kbbgl.dp.factory_simple.pizza_flavors.california.CaliforniaVeggiePizza;

class CaliforniaPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type, String size) {

        Pizza pizza = null;

        switch (type.toLowerCase()) {
            case "cheese":
                pizza = new CaliforniaCheesePizza(size);
                break;
            case "pepperoni":
                pizza = new CaliforniaPepperoniPizza(size);
                break;
            case "clam":
                pizza = new CaliforniaClamPizza(size);
                break;
            case "veggie":
                pizza = new CaliforniaVeggiePizza(size);
                break;
        }

        return pizza;
    }

    @Override
    Pizza orderPizza(String type, String size) {
        return super.orderPizza(type, size);
    }
}
