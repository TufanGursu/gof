package org.example.designpatterns.behavioral.state.connection;

//This is a class.
public class Accounting implements Connection {

    @Override
    public void open() {
        System.out.println("open database for accounting");
    }
    @Override
    public void close() {
        System.out.println("close the database");
    }

    @Override
    public void log() {
        System.out.println("log activities");
    }

    @Override
    public void update() {
        System.out.println("Accounting has been updated");
    }
}// End of the Accounting class.
