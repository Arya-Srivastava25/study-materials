public abstract class LoggerSystem {
    static int INFO = 1;
    static int DEBUG = 2;
    static int ERROR = 3;

    LoggerSystem nextLoggerSystem;

    LoggerSystem(LoggerSystem loggerSystem){
        this.nextLoggerSystem = loggerSystem;
    }

    public void log(int level,String message){
        if(nextLoggerSystem != null)
            nextLoggerSystem.log(level,message);
    }
}
