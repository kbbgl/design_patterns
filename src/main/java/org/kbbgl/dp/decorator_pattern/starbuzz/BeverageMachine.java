package org.kbbgl.dp.decorator_pattern.starbuzz;

import org.kbbgl.dp.decorator_pattern.starbuzz.beverages.DarkRoast;
import org.kbbgl.dp.decorator_pattern.starbuzz.beverages.Espresso;
import org.kbbgl.dp.decorator_pattern.starbuzz.beverages.HouseBlend;
import org.kbbgl.dp.decorator_pattern.starbuzz.decorators.Milk;
import org.kbbgl.dp.decorator_pattern.starbuzz.decorators.Mocha;
import org.kbbgl.dp.decorator_pattern.starbuzz.decorators.Soy;
import org.kbbgl.dp.decorator_pattern.starbuzz.decorators.Whip;

public class BeverageMachine {

    public static void main(String[] args) {

        Beverage beverage = new Espresso("Large");
        System.out.println(beverage.getDescription() + " $" +beverage.cost());

        Beverage secondBeverage = new DarkRoast("Small");
        secondBeverage = new Mocha(secondBeverage);
        secondBeverage = new Mocha(secondBeverage);
        secondBeverage = new Whip(secondBeverage);
        System.out.println(secondBeverage.getDescription() + " $" + secondBeverage.cost());


        Beverage thirdBeverage = new HouseBlend("Medium");
        thirdBeverage = new Milk(thirdBeverage);
        thirdBeverage = new Soy(thirdBeverage);
        System.out.println(thirdBeverage.getDescription() + " $" + thirdBeverage.cost());

    }

}
