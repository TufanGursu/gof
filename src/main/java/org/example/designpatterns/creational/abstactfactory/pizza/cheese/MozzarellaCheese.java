package org.example.designpatterns.creational.abstactfactory.pizza.cheese;

public class MozzarellaCheese implements Cheese{
    public  MozzarellaCheese(){prepareCheese();
    }
    @Override
    public void prepareCheese() {
        System.out.println("Preparing mozzarella cheese...");
    }
}
