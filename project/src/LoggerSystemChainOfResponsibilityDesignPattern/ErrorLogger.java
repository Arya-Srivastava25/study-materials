package LoggerSystemChainOfResponsibilityDesignPattern;

public class ErrorLogger extends LoggerSystem{

    public ErrorLogger(LoggerSystem loggerSystem){
        super(loggerSystem);
    }

    @Override
    public void log(int level, String message){
        if(level == ERROR)
            System.out.println("Error : "+ message);
        else
            super.log(level,message);
    }
}
