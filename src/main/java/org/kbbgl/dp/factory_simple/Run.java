package org.kbbgl.dp.factory_simple;

public class Run {

    public static void main(String[] args) {

        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);
        pizzaStore.orderPizza("Pepperoni", "XL");

    }

}
