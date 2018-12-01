package org.kbbgl.dp.factory_simple;

import org.kbbgl.dp.factory_simple.pizza_flavors.CheesePizza;
import org.kbbgl.dp.factory_simple.pizza_flavors.ClamPizza;
import org.kbbgl.dp.factory_simple.pizza_flavors.PepperoniPizza;
import org.kbbgl.dp.factory_simple.pizza_flavors.VeggiePizza;

class SimplePizzaFactory {

    Pizza createPizza(String type, String size){


        Pizza pizza = null;
//        String typeCaseInsensitive = type.toLowerCase();

        switch (type){

            case "Pepperoni":
                pizza = new PepperoniPizza(type, size);
                break;

            case "Clam":
                pizza = new ClamPizza(type, size);
                break;

            case "Veggie":
                pizza = new VeggiePizza(type, size);
                break;

            case "Cheese":
                pizza = new CheesePizza(type, size);
                break;
        }
        return pizza;
    }
}
