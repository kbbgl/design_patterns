package org.kbbgl.dp.factory_simple;

abstract class PizzaStore {

    Pizza orderPizza(String type, String size){

        Pizza pizza;

        pizza = createPizza(type, size);
        System.out.println("Pizza ordered: " + pizza.toString());
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        pizza.delivering();

        return pizza;
    }

    abstract Pizza createPizza(String type, String size);
}
