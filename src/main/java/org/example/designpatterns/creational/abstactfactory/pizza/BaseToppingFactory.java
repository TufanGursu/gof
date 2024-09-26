package org.example.designpatterns.creational.abstactfactory.pizza;

import org.example.designpatterns.creational.abstactfactory.pizza.cheese.Cheese;
import org.example.designpatterns.creational.abstactfactory.pizza.sauce.Sauce;

public abstract class BaseToppingFactory {
    public abstract Cheese createCheese();
    public abstract Sauce createSauce();
}
