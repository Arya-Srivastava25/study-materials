package LoggerSystemChainOfResponsibilityDesignPattern;

public class DebugLogger extends LoggerSystem{

    public DebugLogger(LoggerSystem loggerSystem){
        super(loggerSystem);
    }

    @Override
    public void log(int level, String message){
        if(level == DEBUG)
            System.out.println("Debug : " + message);
        else
            super.log(level,message);
    }
}
