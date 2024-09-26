package org.example.designpatterns.behavioral.state.candyvending;

public class CandyVendingMachineMonolithic {
    final static int NO_CANDY=0;
    final static int NO_COIN=1;
    final static int CONTAINS_COIN=2;
    final static int DISPENSE=3;
    int count;
    int state=NO_CANDY;
    public CandyVendingMachineMonolithic (int numberOfCandies){
        count=numberOfCandies;
        if(count>0) state = NO_COIN;
    }
    public void insertCoin(){
        if(state==CONTAINS_COIN){
            System.out.println("Coin already inserted");
        }
        else if(state==NO_COIN){
            state=CONTAINS_COIN;
        }
        else if(state==NO_CANDY){
            System.out.println("No candies available");
        }
        else if(state==DISPENSE){
            System.out.println("Error. System is currently dispensing");
        }
    }
    public void pressButton(){
        if(state==CONTAINS_COIN){
            state=DISPENSE;
        }
        else if(state==NO_COIN){
            System.out.println("No coin inserted");
        }
        else if(state==NO_CANDY){
            System.out.println("No candies available");
        }
        else if(state==DISPENSE){
            System.out.println("No coin inserted");
        }
    }
    public void dispense(){
        if(state==CONTAINS_COIN){
            System.out.println("No candies rolled out");
        }
        else if(state==NO_COIN){
            System.out.println("No coin inserted");
        }
        else if(state==NO_CANDY){
            System.out.println("No candies available");
        }
        else if(state==DISPENSE){
            count=count-1;
            if(count==0){
                state=NO_CANDY;
            }
            else
                state=NO_COIN;
        }
    }

    public static void main(String[] args) {
        CandyVendingMachineMonolithic cvm = new CandyVendingMachineMonolithic(3);
        cvm.insertCoin();
        cvm.pressButton();
        cvm.dispense();

        cvm.insertCoin();
        cvm.dispense();

        cvm.insertCoin();
        cvm.pressButton();
        cvm.dispense();

        cvm.insertCoin();
        cvm.pressButton();
        cvm.dispense();
    }
    /*
    We have ended up with a monolithic class with three action methods,
    each with a bunch of repeated conditional statements to handle different types of behavior of the machine –
     A clear violation of the Single Responsibility principle.
     Now, imagine that a change request comes in to add an action that allows a user to withdraw a coin.
     We need to open up the class and add a new action method again with a branch of conditional statements.
     What if a change request for the existing press button action comes in?
     Say, the machine should roll out two candies
    when a user presses the button again exactly after a random number of seconds (say after 3 seconds or 5 seconds)
    that the system decides for each transaction. Again, a whole lot of changes.
     */
}