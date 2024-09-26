package org.example.designpatterns.structural.composite.bankmanager;
/*
1) Component
Declares interface for objects in composition.
Implements default behavior for the interface common to all classes as appropriate.
Declares an interface for accessing and managing its child components.
2) Leaf
Represents leaf objects in composition. A leaf has no children.
Defines behavior for primitive objects in the composition.
3) Composite
Defines behavior for components having children.
Stores child component.
Implements child related operations in the component interface.
4) Client
Manipulates objects in the composition through the component interface
 */
public class CompositePatternDemo {
    public static void main(String args[]){
        Employee emp1=new Cashier(101,"Sohan Kumar", 20000.0);
        Employee emp2=new Cashier(102,"Mohan Kumar", 25000.0);
        Employee emp3=new Accountant(103,"Seema Mahiwal", 30000.0);
        Employee manager1=new BankManager(100,"Ashwani Rajput",100000.0);

        manager1.add(emp1);
        manager1.add(emp2);
        manager1.add(emp3);
        manager1.print();
    }
}
