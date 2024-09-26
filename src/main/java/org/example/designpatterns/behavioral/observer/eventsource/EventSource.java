package org.example.designpatterns.behavioral.observer.eventsource;

//This is a class.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;

public class EventSource extends Observable implements Runnable {
    @Override
    public void run() {
        try {
            final InputStreamReader isr = new InputStreamReader(System.in);
            final BufferedReader br = new BufferedReader(isr);
            while (true) {
                if(Thread.interrupted()) {
                    break;
                }
                String response = br.readLine();
                if(response.equals("exit")) {
                    break;
                }
                setChanged();
                notifyObservers(response);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}// End of the Eventsource class.
