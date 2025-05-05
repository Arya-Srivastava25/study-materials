package LoggerSystemChainOfResponsibilityDesignPattern;

public class Main {
    public static void main(String[] args){

        LoggerSystem loggerSystem = new InfoLogger(new DebugLogger(new ErrorLogger(null)));

        loggerSystem.log(LoggerSystem.INFO,"This is info block");
        loggerSystem.log(LoggerSystem.DEBUG,"This is debug block");
        loggerSystem.log(LoggerSystem.ERROR,"This is error block");

    }
}
