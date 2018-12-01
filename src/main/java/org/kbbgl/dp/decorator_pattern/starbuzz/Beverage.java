package org.kbbgl.dp.decorator_pattern.starbuzz;

public abstract class Beverage {

    public abstract String getDescription();

    public abstract String getSize();

    public abstract void setSize(String size);

    public abstract double cost();
}
