package org.example.designpatterns.behavioral.chainofresponsibility.logger;

public class DebugBasedLogger extends Logger {
    public DebugBasedLogger(int levels) {
        this.levels=levels;
    }
    @Override
    protected void displayLogInfo(String msg) {
        System.out.println("DEBUG LOGGER : "+  msg);
    }
}// End of the DebugBasedLogger class.
