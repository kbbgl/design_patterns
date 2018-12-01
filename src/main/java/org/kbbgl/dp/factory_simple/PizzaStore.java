package org.kbbgl.dp.factory_simple;

class PizzaStore {

    private SimplePizzaFactory factory;

    PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    Pizza orderPizza(String type, String size){

        Pizza ordered = factory.createPizza(type, size);
        System.out.println("Pizza ordered: " + ordered.toString());
        ordered.prepare();
        ordered.bake();
        ordered.cut();
        ordered.box();
        ordered.delivering();

        return ordered;
    }
}
