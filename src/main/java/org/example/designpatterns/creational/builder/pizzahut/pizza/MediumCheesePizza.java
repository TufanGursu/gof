package org.example.designpatterns.creational.builder.pizzahut.pizza;

public class MediumCheesePizza extends VegPizza {
    @Override
    public float price() {
        return  220.f;
    }
    @Override
    public String name() {
        return "Cheese Pizza";
    }
    @Override
    public String size() {
        return "Medium Size";
    }
}// End of the MediumCheesePizza class.
