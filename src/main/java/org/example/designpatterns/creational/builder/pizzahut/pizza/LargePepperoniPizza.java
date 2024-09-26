package org.example.designpatterns.creational.builder.pizzahut.pizza;

public class LargePepperoniPizza extends NonVegPizza {
    @Override
    public float price() {
        return 280.0f;
    }

    @Override
    public String name() {
        return "Pepperoni Pizza";
    }

    @Override
    public String size() {
        return "Large size";
    }
}
