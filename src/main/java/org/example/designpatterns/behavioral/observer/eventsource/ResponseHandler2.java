package org.example.designpatterns.behavioral.observer.eventsource;

//This is a class.

import java.util.Observable;
import java.util.Observer;

//This is a class.


public class ResponseHandler2 implements Observer {
    private String resp;
    public void update(Observable obj, Object arg) {
        if (arg instanceof String) {
            resp = (String) arg;
            System.out.println("\nReceived Response: " + resp );
        }
    }
}// End of the ResponseHandler2 interface.
