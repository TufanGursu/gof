package org.example.designpatterns.creational.singleton;
import java.io.Serializable;

public class SerializedSingleton implements Serializable  {

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }
//hashCode of both instances is the same in the test program.
//    protected Object readResolve() {
//        return getInstance();
//    }

}
