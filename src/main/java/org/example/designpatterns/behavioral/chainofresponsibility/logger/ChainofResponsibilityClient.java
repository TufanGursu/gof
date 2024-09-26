package org.example.designpatterns.behavioral.chainofresponsibility.logger;

public class ChainofResponsibilityClient {
    public static void main(String args[]){
        Logger chainLogger= doChaining();

        chainLogger.logMessage(Logger.ERRORINFO, "An error is occured now");
        chainLogger.logMessage(Logger.OUTPUTINFO, "Enter the sequence of values ");
        chainLogger.logMessage(Logger.DEBUGINFO, "This was the error now debugging is compeled");
    }
    /*
    ALL. 6
    TRACE. 5
    DEBUG. 4
    INFO. 3
    WARN. 2
    ERROR. 1
    FATAL. 0
     */

    private static Logger doChaining(){
        Logger errorLogger = new ErrorBasedLogger(Logger.ERRORINFO);

        Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO);
        consoleLogger.setNextLevelLogger(errorLogger);

        Logger debugLogger = new DebugBasedLogger(Logger.DEBUGINFO);
        errorLogger.setNextLevelLogger(debugLogger);

        return consoleLogger;
    }
}
