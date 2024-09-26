package org.example.designpatterns.creational.abstactfactory.pizza.gourmet;

import org.example.designpatterns.creational.abstactfactory.pizza.BaseToppingFactory;
import org.example.designpatterns.creational.abstactfactory.pizza.cheese.Cheese;
import org.example.designpatterns.creational.abstactfactory.pizza.cheese.GoatCheese;
import org.example.designpatterns.creational.abstactfactory.pizza.sauce.CaliforniaOilSauce;
import org.example.designpatterns.creational.abstactfactory.pizza.sauce.Sauce;

public class GourmetToppingFactory extends BaseToppingFactory {
    @Override
    public Cheese createCheese(){return new GoatCheese();}
    @Override
    public Sauce createSauce(){return new CaliforniaOilSauce();}
}