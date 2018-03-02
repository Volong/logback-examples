package chapters.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.util.ContextInitializer;

public class ServerMain {

    static {
        System.setProperty(ContextInitializer.CONFIG_FILE_PROPERTY, "configurationFile.xml");
    }
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ServerMain.class);
    
    public static void main(String[] args) {
        LOGGER.info("xxxxxxxx");
    }
}
