package org.example.designpatterns.structural.flyweight.racecar;
/*
/*
Imagine you need 1000 car objects in an online car racing game,
 and the car objects vary only in their current position on the race track.
 Instead of creating 1000 car objects and adding more as users join in,
 you can create a single car object with common data and a client object to maintain the state (position of a car).
  The Flyweight Pattern reduces repeated data,
 thus reduces memory consumption when dealing with large numbers of objects.
 NOTE – Notice how the moveCar()  method does not store state in the flyweight object.
 Object pools like integer pool, boolean pool, string pool, etc. are examples of the flyweight pattern.
 */

public class RaceCarClientTest {
    public static void main (String[] args) {
        RaceCarClient raceCars[] = {
                new RaceCarClient("Midget"),
                new RaceCarClient("Midget"),
                new RaceCarClient("Midget"),
                new RaceCarClient("Sprint"),
                new RaceCarClient("Sprint"),
                new RaceCarClient("Sprint")
        };
        raceCars[0].moveCar(29, 3112);
        raceCars[1].moveCar(39, 2002);
        raceCars[2].moveCar(49, 1985);
        raceCars[3].moveCar(59, 2543);
        raceCars[4].moveCar(69, 2322);
        raceCars[5].moveCar(79, 2135);
        /*Output and observe the number of instances created*/
        System.out.println("Midget Car Instances: " + FlyweightMidgetCar.num);
        System.out.println("Sprint Car Instances: " + FlyweightSprintCar.num);
    }
}
