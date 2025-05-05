public class Main {
    public static void main(String[] args) {
        LoggerSystem loggerSystem = new InfoLoggerSystem(new DebugLoggerSystem(new ErrorLoggerSystem(null)));

        loggerSystem.log(LoggerSystem.INFO,"This is info");
        loggerSystem.log(LoggerSystem.DEBUG,"This is debug");
        loggerSystem.log(LoggerSystem.ERROR,"This is error");
    }
}