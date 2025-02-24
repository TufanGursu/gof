package org.example.designpatterns.creational.builder.pizzahut.drink;

public class LargePepsi extends Pepsi{
    @Override
    public String name() {
        return "750 ml Pepsi";
    }

    @Override
    public String size() {
        return "Large Size";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}// End of the LargePepsi class
