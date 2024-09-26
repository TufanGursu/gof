package org.example.designpatterns.creational.factorymethod.pizza;


public class CheesePizza extends Pizza {
    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for cheese pizza.");
    }
}
