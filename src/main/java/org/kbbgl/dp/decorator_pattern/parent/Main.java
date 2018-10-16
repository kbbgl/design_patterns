package org.kbbgl.dp.decorator_pattern.parent;

import org.kbbgl.dp.decorator_pattern.parent.concrete_beverages.Decaf;
import org.kbbgl.dp.decorator_pattern.parent.concrete_beverages.Espresso;
import org.kbbgl.dp.decorator_pattern.concrete_decorators.Caramel;

public class Main {

    public static void main(String[] args) {
        Decaf decaf = new Decaf();
        Espresso espresso = new Espresso();
        Caramel caramel = new Caramel(decaf);

        System.out.println("You ordered:");
        System.out.println(caramel.getDescription());
        System.out.println("Charged: ");
        System.out.println(caramel.cost());

        // What if we had Tea instantiated here?
        // But you can't order Tea with Beverage.hasChocolate()
        // This would violate the interface aggregation principle.


    }
}
