package org.example.designpatterns.behavioral.chainofresponsibility.logger;

public class ConsoleBasedLogger extends Logger {
    public ConsoleBasedLogger(int levels) {
        this.levels=levels;
    }
    @Override
    protected void displayLogInfo(String msg) {
        System.out.println("CONSOLE LOGGER : "+  msg);
    }
}
