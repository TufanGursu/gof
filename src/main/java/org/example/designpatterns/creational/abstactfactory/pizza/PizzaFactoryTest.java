package org.example.designpatterns.creational.abstactfactory.pizza;

import org.example.designpatterns.creational.abstactfactory.pizza.pizza.Pizza;
import org.example.designpatterns.creational.abstactfactory.pizza.sicillian.SicilianPizzaFactory;

public class PizzaFactoryTest {
    public static void main(String[] args) {
        SicilianPizzaFactoryTest();
        System.out.println("-------------------------------------------------");
        GourmetPizzaFactoryTest();
    }

    private static void GourmetPizzaFactoryTest () {
        BasePizzaFactory pizzaFactory=new SicilianPizzaFactory();
        Pizza cheesePizza=pizzaFactory.createPizza("cheese");
        Pizza pepperoniPizza =pizzaFactory.createPizza("pepperoni");
    }

    private static void SicilianPizzaFactoryTest () {
        BasePizzaFactory pizzaFactory=new SicilianPizzaFactory();
        Pizza cheesePizza=pizzaFactory.createPizza("cheese");
        Pizza pepperoniPizza =pizzaFactory.createPizza("pepperoni");
    }

}
