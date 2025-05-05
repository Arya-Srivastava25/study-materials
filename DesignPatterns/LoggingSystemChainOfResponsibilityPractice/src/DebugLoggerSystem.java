public class DebugLoggerSystem extends LoggerSystem{
    DebugLoggerSystem(LoggerSystem loggerSystem){
        super(loggerSystem);
    }

    public void log(int level, String message){
        if(level == DEBUG)
            System.out.println("DEBUG : "+ message);
        else
            super.log(level,message);
    }
}
