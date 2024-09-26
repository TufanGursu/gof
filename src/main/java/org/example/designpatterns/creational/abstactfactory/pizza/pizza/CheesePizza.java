package org.example.designpatterns.creational.abstactfactory.pizza.pizza;

import org.example.designpatterns.creational.abstactfactory.pizza.BaseToppingFactory;

public class CheesePizza extends Pizza {
    BaseToppingFactory toppingFactory;
    public CheesePizza(BaseToppingFactory toppingFactory){
        this.toppingFactory=toppingFactory;
    }
    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for cheese pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
