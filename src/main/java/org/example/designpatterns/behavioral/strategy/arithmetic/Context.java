package org.example.designpatterns.behavioral.strategy.arithmetic;

//This is a class.


public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public float executeStrategy(float num1, float num2){
        return strategy.calculation(num1, num2);
    }
}// End of the Context class.