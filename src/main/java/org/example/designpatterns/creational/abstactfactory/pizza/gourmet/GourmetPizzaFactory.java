package org.example.designpatterns.creational.abstactfactory.pizza.gourmet;

import org.example.designpatterns.creational.abstactfactory.pizza.BasePizzaFactory;
import org.example.designpatterns.creational.abstactfactory.pizza.BaseToppingFactory;
import org.example.designpatterns.creational.abstactfactory.pizza.pizza.CheesePizza;
import org.example.designpatterns.creational.abstactfactory.pizza.pizza.PepperoniPizza;
import org.example.designpatterns.creational.abstactfactory.pizza.pizza.Pizza;
import org.example.designpatterns.creational.abstactfactory.pizza.pizza.VeggiePizza;

public class GourmetPizzaFactory extends BasePizzaFactory {
    @Override
    public Pizza createPizza(String type){
        Pizza pizza;
        BaseToppingFactory toppingFactory= new GourmetToppingFactory();
        switch (type.toLowerCase())
        {
            case "cheese":
                pizza = new CheesePizza(toppingFactory);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(toppingFactory);
                break;
            case "veggie":
                pizza = new VeggiePizza(toppingFactory);
                break;
            default: throw new IllegalArgumentException("No such pizza.");
        }
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}