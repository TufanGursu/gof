package org.example.designpatterns.creational.builder.pizzahut.pizza;

public class ExtraLargePepperoniPizza extends NonVegPizza {
    @Override
    public float price() {
        return 350.0f;
    }

    @Override
    public String name() {
        return "Pepperoni Pizza";
    }

    @Override
    public String size() {
        return "Extra-Large size";
    }
}
