package org.example.designpatterns.creational.builder.pizzahut;

import org.example.designpatterns.creational.builder.pizzahut.drink.*;
import org.example.designpatterns.creational.builder.pizzahut.pizza.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderBuilder {
    public OrderedItems preparePizza () throws IOException {

        OrderedItems itemsOrder = new OrderedItems();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(" Enter the choice of Pizza ");
        System.out.println("============================");
        System.out.println("        1. Veg-Pizza       ");
        System.out.println("        2. Pepperoni Pizza   ");
        System.out.println("        3. Exit            ");
        System.out.println("============================");

        int pizzaandcolddrinkchoice = Integer.parseInt(br.readLine());
        switch (pizzaandcolddrinkchoice) {
            case 1: {
                System.out.println("You ordered Veg Pizza");
                System.out.println("\n\n");
                System.out.println(" Enter the types of Veg-Pizza ");
                System.out.println("------------------------------");
                System.out.println("        1.Cheese Pizza        ");
                System.out.println("        2.Onion Pizza        ");
                System.out.println("        3.Exit            ");
                System.out.println("------------------------------");
                int vegpizzachoice = Integer.parseInt(br.readLine());
                switch (vegpizzachoice) {
                    case 1: {
                        System.out.println("You ordered Cheese Pizza");

                        System.out.println("Enter the cheese pizza size");
                        System.out.println("------------------------------------");
                        System.out.println("    1. Small Cheese Pizza ");
                        System.out.println("    2. Medium Cheese Pizza ");
                        System.out.println("    3. Large Cheese Pizza ");
                        System.out.println("    4. Extra-Large Cheese Pizza ");
                        System.out.println("------------------------------------");
                        int cheezepizzasize = Integer.parseInt(br.readLine());
                        switch (cheezepizzasize) {
                            case 1:
                                itemsOrder.addItems(new SmallCheesePizza());
                                break;
                            case 2:
                                itemsOrder.addItems(new MediumCheesePizza());
                                break;
                            case 3:
                                itemsOrder.addItems(new LargeCheesePizza());
                                break;
                            case 4:
                                itemsOrder.addItems(new ExtraLargeCheesePizza());
                                break;
                        }
                    }
                    break;
                    case 2: {
                        System.out.println("You ordered Onion Pizza");
                        System.out.println("Enter the Onion pizza size");
                        System.out.println("----------------------------------");
                        System.out.println("    1. Small Onion Pizza ");
                        System.out.println("    2. Medium Onion Pizza ");
                        System.out.println("    3. Large Onion Pizza ");
                        System.out.println("    4. Extra-Large Onion Pizza ");
                        System.out.println("----------------------------------");
                        int onionpizzasize = Integer.parseInt(br.readLine());
                        switch (onionpizzasize) {
                            case 1:
                                itemsOrder.addItems(new SmallOnionPizza());
                                break;

                            case 2:
                                itemsOrder.addItems(new MediumOnionPizza());
                                break;

                            case 3:
                                itemsOrder.addItems(new LargeOnionPizza());
                                break;

                            case 4:
                                itemsOrder.addItems(new ExtraLargeOnionPizza());
                                break;

                        }
                    }
                    break;
                }
            }
            break;// Veg- pizza choice completed.
            case 2: {
                System.out.println("You ordered Pepperoni Pizza");
                System.out.println("Enter the Pepperoni pizza size");
                System.out.println("------------------------------------");
                System.out.println("    1. Small Pepperoni Pizza ");
                System.out.println("    2. Medium Pepperoni Pizza ");
                System.out.println("    3. Large Pepperoni Pizza ");
                System.out.println("    4. Extra-Large Pepperoni Pizza ");
                System.out.println("------------------------------------");
                int pepperonipizzasize = Integer.parseInt(br.readLine());
                switch (pepperonipizzasize) {
                    case 1:
                        itemsOrder.addItems(new SmallPepperoniPizza());
                        break;

                    case 2:
                        itemsOrder.addItems(new MediumPepperoniPizza());
                        break;

                    case 3:
                        itemsOrder.addItems(new LargePepperoniPizza());
                        break;

                    case 4:
                        itemsOrder.addItems(new ExtraLargePepperoniPizza());
                        break;

                }
            }
            break;
        }//end of main Switch

        //continued?..
        System.out.println(" Enter the choice of ColdDrink ");
        System.out.println("============================");
        System.out.println("        1. Pepsi            ");
        System.out.println("        2. Coke             ");
        System.out.println("        3. Exit             ");
        System.out.println("============================");
        int coldDrink = Integer.parseInt(br.readLine());
        switch (coldDrink) {
            case 1: {
                System.out.println("You ordered Pepsi ");
                System.out.println("Enter the  Pepsi Size ");
                System.out.println("------------------------");
                System.out.println("    1. Small Pepsi ");
                System.out.println("    2. Medium Pepsi ");
                System.out.println("    3. Large Pepsi ");
                System.out.println("------------------------");
                int pepsisize = Integer.parseInt(br.readLine());
                switch (pepsisize) {
                    case 1:
                        itemsOrder.addItems(new SmallPepsi());
                        break;

                    case 2:
                        itemsOrder.addItems(new MediumPepsi());
                        break;

                    case 3:
                        itemsOrder.addItems(new LargePepsi());
                        break;

                }
            }
            break;
            case 2: {
                System.out.println("You ordered Coke");
                System.out.println("Enter the Coke Size");
                System.out.println("------------------------");
                System.out.println("    1. Small Coke ");
                System.out.println("    2. Medium Coke  ");
                System.out.println("    3. Large Coke  ");
                System.out.println("    4. Extra-Large Coke ");
                System.out.println("------------------------");

                int cokesize = Integer.parseInt(br.readLine());
                switch (cokesize) {
                    case 1:
                        itemsOrder.addItems(new SmallCoke());
                        break;

                    case 2:
                        itemsOrder.addItems(new MediumCoke());
                        break;

                    case 3:
                        itemsOrder.addItems(new LargeCoke());
                        break;


                }

            }
            break;
            default: {
                break;

            }

        }//End of the Cold-Drink switch
        return itemsOrder;

    } //End of the preparePizza() method
}