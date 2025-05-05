package LoggerSystemChainOfResponsibilityDesignPattern;

public class InfoLogger extends LoggerSystem{

    public InfoLogger(LoggerSystem loggerSystem){
        super(loggerSystem);
    }

    @Override
    public void log(int level,String message){
        if(level == INFO)
            System.out.println("Info : "+ message);
        else
            super.log(level,message);
    }
}
