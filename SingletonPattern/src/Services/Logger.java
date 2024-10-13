package Services;

public class Logger {
    private static Logger logger;

    private Logger(){};

    public static Logger getInstance(){
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }

    public static synchronized Logger getInstanceWithSynchronized(){
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }
    public static void error(String message){
        System.out.println(message);
    }

    public static void debug(String message){
        System.out.println(message);
    }

}
