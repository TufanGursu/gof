package org.example.designpatterns.creational.abstactfactory.pizza.sauce;

public class TomatoSauce implements Sauce {
    public TomatoSauce(){
        prepareSauce();
    }
    @Override
    public void prepareSauce() {
        System.out.println("Preparing tomato sauce..");
    }
}
