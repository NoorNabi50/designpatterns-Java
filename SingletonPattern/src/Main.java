import Services.Logger;

public class Main {
    public static void main(String[] args) {
        //Singleton design pattern is used to create only single object of class globally (application lifecycle)
        //It is useful for database connections, configuration manager, logger, services which are resource management critical
        // Helps to reduce memory usage by preventing multiple instances of class (space complexity)

      /*  Logger loggerService = Logger.getInstance();
        loggerService.error("Null Pointer Exception Error");

        Logger loggerService2 = Logger.getInstance();
        loggerService2.debug("Inside Method : "+new Object(){}.getClass().getEnclosingMethod().getName());

        //above two logger services are pointing to one object of logger class
        System.out.println(loggerService==loggerService2);*/

     /* above singleton pattern is not thread safe, first time if two threads access the getInstance() method simultaneously, two objects of
        logger class will be created. let's produce the issue
        creating multiple thread that will access the singleton class, resulting multiple instances of class
      */

        for(int i=0; i<3; i++){
            new Thread(()-> {
                Logger notThreadSafeObject = Logger.getInstance(); // change to Logger.getInstanceWithSynchronized() to make it thread safe
                notThreadSafeObject.error("Thread : "+ Thread.currentThread().getName());
                System.out.println(notThreadSafeObject);
            }).start();
        }



    }
}