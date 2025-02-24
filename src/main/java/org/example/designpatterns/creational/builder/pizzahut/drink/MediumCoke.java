package org.example.designpatterns.creational.builder.pizzahut.drink;

public class MediumCoke extends Coke{

    @Override
    public String name() {
        return "500 ml Coke";
    }

    @Override
    public String size() {

        return "Medium Size";
    }

    @Override
    public float price() {

        return  35.0f;
    }
}// End of the MediumCoke class
