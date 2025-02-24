package org.example.designpatterns.structural.decorator.bouquet;

public class Glitter extends FlowerBouquetDecorator{
    FlowerBouquet flowerBouquet;
    public Glitter(FlowerBouquet flowerBouquet){
        this.flowerBouquet=flowerBouquet;
    }
    public  String getDescription(){
        return flowerBouquet.getDescription()+", glitter";
    }
    public double cost()
    {
        return 4+flowerBouquet.cost();
    }
}