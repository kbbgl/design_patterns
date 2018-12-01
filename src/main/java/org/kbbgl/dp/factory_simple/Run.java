package org.kbbgl.dp.factory_simple;

public class Run {

    public static void main(String[] args) {

//        SimplePizzaFactory factory = new SimplePizzaFactory();
//        PizzaStore pizzaStore = new PizzaStore(factory);
//        pizzaStore.orderPizza("Pepperoni", "XL");

//        SimplePizzaFactory factory = new SimplePizzaFactory();
        CaliforniaPizzaStore californiaPizzaStore = new CaliforniaPizzaStore();
        californiaPizzaStore.orderPizza("pepperoni", "XL");

        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("pepperoni", "XL");

        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("veggie", "XL");

    }

}
