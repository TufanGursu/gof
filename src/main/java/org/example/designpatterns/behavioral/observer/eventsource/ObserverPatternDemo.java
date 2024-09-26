package org.example.designpatterns.behavioral.observer.eventsource;

public class ObserverPatternDemo {
    public static void main(String[] args) throws InterruptedException {
        EventSource eventSource = new EventSource();
        eventSource.addObserver(new ResponseHandler1());
        eventSource.addObserver(new ResponseHandler2());
        Thread thread = new Thread(eventSource);
        thread.start();
        thread.join();
//       thread.interrupt();
    }
}
