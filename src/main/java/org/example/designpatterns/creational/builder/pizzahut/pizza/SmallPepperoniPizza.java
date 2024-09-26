package org.example.designpatterns.creational.builder.pizzahut.pizza;

public class SmallPepperoniPizza extends NonVegPizza {
    @Override
    public float price() {
        return 200.0f;
    }

    @Override
    public String name() {
        return "Pepperoni Pizza";
    }

    @Override
    public String size() {
        return "Medium Size";
    }
}
