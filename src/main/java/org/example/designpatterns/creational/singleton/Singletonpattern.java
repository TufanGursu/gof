package org.example.designpatterns.creational.singleton;

public class Singletonpattern {
    public static void main(String[] args) {
        BillPughSingleton instance = BillPughSingleton.getInstance();
        System.out.println(instance);
        BillPughSingleton instance_2 = BillPughSingleton.getInstance();
        System.out.println(instance_2);
        EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
        System.out.println(instance1);
        EagerInitializedSingleton instance1_2 = EagerInitializedSingleton.getInstance();
        System.out.println(instance1_2);
        LazyInitializedSingleton instance2 = LazyInitializedSingleton.getInstance();
        System.out.println(instance2);
        StaticBlockSingleton instance3 = StaticBlockSingleton.getInstance();
        System.out.println(instance3);
        ThreadSafeSingleton instance4 = ThreadSafeSingleton.getInstance();
        System.out.println(instance4);
        ThreadSafeSingleton instance5 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
        System.out.println(instance5);
        EnumSingleton instance6 = EnumSingleton.INSTANCE;
        instance6.doSomething();
    }
}
