package org.example.designpatterns.behavioral.state.candyvending;

public class ContainsCoinState implements CandyVendingMachineState{
    CandyVendingMachine machine;
    public ContainsCoinState(CandyVendingMachine machine){
        this.machine=machine;
    }
    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted");
    }
    @Override
    public void pressButton() {
        machine.setState(machine.getDispensedState());
    }
    @Override
    public void dispense() {
        System.out.println("Press button to dispense");
    }
    @Override
    public String toString(){
        return "ContainsCoinState";
    }
}
