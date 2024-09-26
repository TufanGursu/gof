package org.example.designpatterns.creational.builder.house;

public class HouseAntiPattern {
    public static void main(String[] args) {
// public House(String foundation, String structure, String roof) {...}
//public House(String foundation, String structure, String roof, boolean painted){...}
//public House(String foundation, String structure, String roof, boolean painted, boolean furnished){...}

        House house=new House();
        //building roof before the structure was in place,
        house.setRoof("Concrete and reinforced steel");
        house.setStructure("Concrete, mortar, brick, and reinforced steel");
        house.setFurnished(true);
        house.setPainted(true);
    }
}
