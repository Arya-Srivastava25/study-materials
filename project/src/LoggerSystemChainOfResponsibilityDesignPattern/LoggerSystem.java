package LoggerSystemChainOfResponsibilityDesignPattern;

public abstract class LoggerSystem {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    LoggerSystem nextLoggerSystem;

    public LoggerSystem(LoggerSystem loggerSystem){
        this.nextLoggerSystem = loggerSystem;
    }

    public void log(int value, String message){
        if(nextLoggerSystem != null)
            nextLoggerSystem.log(value, message);
    }
}
