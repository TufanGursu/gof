package org.example.designpatterns.creational.builder.pizzahut.pizza;

public class SmallCheesePizza extends VegPizza{
    @Override
    public float price() {
        return 170.0f;
    }
    @Override
    public String name() {
        return "Cheese Pizza";
    }
    @Override
    public String size() {
        return "Small size";
    }
}// End of the SmallCheesePizza class.