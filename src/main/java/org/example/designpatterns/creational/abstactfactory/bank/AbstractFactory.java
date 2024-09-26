package org.example.designpatterns.creational.abstactfactory.bank;

abstract class AbstractFactory{
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
} // End of the AbstractFactory class.