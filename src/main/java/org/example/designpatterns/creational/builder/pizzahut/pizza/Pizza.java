package org.example.designpatterns.creational.builder.pizzahut.pizza;

import org.example.designpatterns.creational.builder.pizzahut.Item;

public abstract class Pizza implements Item {
    @Override
    public abstract float price();
}