package org.example.designpatterns.structural.decorator.bouquet;

public abstract class FlowerBouquet {
    String description;
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}