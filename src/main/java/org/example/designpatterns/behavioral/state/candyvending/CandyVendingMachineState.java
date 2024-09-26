package org.example.designpatterns.behavioral.state.candyvending;

public interface CandyVendingMachineState {
    void insertCoin();
    void pressButton();
    void dispense();
}