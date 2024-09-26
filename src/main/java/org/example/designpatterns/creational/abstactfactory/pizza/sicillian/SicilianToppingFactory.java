package org.example.designpatterns.creational.abstactfactory.pizza.sicillian;

import org.example.designpatterns.creational.abstactfactory.pizza.BaseToppingFactory;
import org.example.designpatterns.creational.abstactfactory.pizza.cheese.Cheese;
import org.example.designpatterns.creational.abstactfactory.pizza.cheese.MozzarellaCheese;
import org.example.designpatterns.creational.abstactfactory.pizza.sauce.Sauce;
import org.example.designpatterns.creational.abstactfactory.pizza.sauce.TomatoSauce;

public class SicilianToppingFactory extends BaseToppingFactory {
    @Override
    public Cheese createCheese(){return new MozzarellaCheese();}
    @Override
    public Sauce createSauce(){return new TomatoSauce();}
}