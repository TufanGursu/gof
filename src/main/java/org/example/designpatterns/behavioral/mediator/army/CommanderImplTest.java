package org.example.designpatterns.behavioral.mediator.army;

public class CommanderImplTest {
    public static void main(String[] args) {
        Commander commander = new CommanderImpl();
        SoldierUnit soldierUnit = new SoldierUnit(commander);
        ArmedUnit tankUnit=new TankUnit(commander);
        commander.registerArmedUnits(soldierUnit, tankUnit);
        commander.startAttack(soldierUnit);
        commander.startAttack(tankUnit);
        commander.ceaseAttack(soldierUnit);
        commander.startAttack(tankUnit);
    }
}
