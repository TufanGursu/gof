package org.example.designpatterns.behavioral.chainofresponsibility.logger;

public class ErrorBasedLogger extends Logger {
    public ErrorBasedLogger(int levels) {
        this.levels=levels;
    }
    @Override
    protected void displayLogInfo(String msg) {
        System.out.println("ERROR LOGGER : " +  msg);
    }
}// End of the ErrorBasedLogger class.
