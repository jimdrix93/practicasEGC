package es.egc.app;

import org.apache.log4j.*; 

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    static int getVal(){
        return 1;
    }
    static Logger log=Logger.getLogger(App.class);
    
    log.info("Rturning 1");
}
