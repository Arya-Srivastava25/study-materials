public class InfoLoggerSystem extends LoggerSystem{

    InfoLoggerSystem(LoggerSystem loggerSystem){
        super(loggerSystem);
    }

    public void log(int level, String message){
        if(level == INFO)
            System.out.println("INFO : "+ message);
        else
            super.log(level,message);
    }
}
