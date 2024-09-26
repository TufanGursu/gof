package org.example.designpatterns.creational.abstactfactory.pizza;

import org.example.designpatterns.creational.abstactfactory.pizza.pizza.Pizza;

public abstract class BasePizzaFactory {

    public abstract Pizza createPizza(String type);
}