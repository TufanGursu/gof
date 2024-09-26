package org.example.designpatterns.creational.singleton;

//https://en.wikipedia.org/wiki/William_Pugh_(computer_scientist)
//inner static helper class.
public class BillPughSingleton {

    private BillPughSingleton(){}

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
