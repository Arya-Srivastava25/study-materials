public class ErrorLoggerSystem extends LoggerSystem{
    ErrorLoggerSystem(LoggerSystem loggerSystem){
        super(loggerSystem);
    }

    public void log(int level, String message){
        if(level == ERROR)
            System.out.println("ERROR : "+ message);
        else
            super.log(level,message);
    }
}
