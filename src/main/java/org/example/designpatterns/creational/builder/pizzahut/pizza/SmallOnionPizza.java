package org.example.designpatterns.creational.builder.pizzahut.pizza;

public class SmallOnionPizza extends VegPizza {
    @Override
    public float price() {
        return 120.0f;
    }
    @Override
    public String name() {
        return  "Onion Pizza";
    }
    @Override
    public String size() {
        return  "Small Size";
    }
}// End of the SmallOnionPizza class.
