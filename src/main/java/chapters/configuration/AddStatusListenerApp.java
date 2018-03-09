package chapters.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.status.OnConsoleStatusListener;
import ch.qos.logback.core.status.StatusManager;

public class AddStatusListenerApp {

    public static void main(String[] args) {
        
        LoggerContext context = (LoggerContext)LoggerFactory.getILoggerFactory();
        StatusManager statusManager = context.getStatusManager();
        OnConsoleStatusListener listener = new OnConsoleStatusListener();
        statusManager.add(listener);
        
        Logger logger = LoggerFactory.getLogger("myApp");
        logger.info("Entering application");
        
        Foo foo = new Foo();
        
        foo.doIt();
        logger.info("Exiting application");
        
//        StatusPrinter.print(statusManager);
    }
}
