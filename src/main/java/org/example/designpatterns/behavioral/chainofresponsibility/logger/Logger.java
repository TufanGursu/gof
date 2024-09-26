package org.example.designpatterns.behavioral.chainofresponsibility.logger;

public abstract class Logger {
    public static int ERRORINFO=1;
    public static int OUTPUTINFO=2;
    public static int DEBUGINFO=3;
    protected int levels;
    protected Logger nextLevelLogger;
    public void setNextLevelLogger(Logger nextLevelLogger) {
        this.nextLevelLogger = nextLevelLogger;
    }
    public void logMessage(int levels, String msg){
        if(this.levels >= levels){
            displayLogInfo("%s %s".formatted(getLevels(levels), msg));
        }
        if (nextLevelLogger!=null) {
            nextLevelLogger.logMessage(levels, msg);
        }
    }
    protected abstract void displayLogInfo(String msg);

    public  String getLevels(int level) {
        if (level == 1) {
            return "ERROR";
        } else if (level == 2) {
            return "INFO";
        } else if (level == 3) {
            return "DEBUG";
        }
        return null;
    }
}
