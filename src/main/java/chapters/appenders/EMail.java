package chapters.appenders;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.access.joran.JoranConfigurator;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.util.StatusPrinter;

public class EMail {

    static Logger lllloger = LoggerFactory.getLogger(EMail.class);
    
    public static void main(String[] args) throws JoranException, InterruptedException {
        
        if (args.length != 2) {
                          usage("Wrong number of arguments.");
                      }
              
                      int runLength = Integer.parseInt(args[0]);
                      String configFile = args[1];
              
                      LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
                      JoranConfigurator configurator = new JoranConfigurator();
                      configurator.setContext(lc);
                      lc.reset();
                      configurator.doConfigure(configFile);
              
                      
                      
                      for (int i = 1; i <= runLength; i++) {
                          if ((i % 10) < 9) {
                              lllloger.debug("This is a debug message. Message number: " + i);
                          } else {
                              lllloger.warn("This is a warning message. Message number: " + i);
                          }
                      }
              
                      lllloger.error("At last an error.", new Exception("Just testing"));
                      
                      Thread.sleep(5000);
                      lc.stop();
                      
                      StatusPrinter.printInCaseOfErrorsOrWarnings(lc);
                  }

                 static void usage(String msg) {
                      System.err.println(msg);
                      System.err.println("Usage: java " + EMail.class.getName() + " runLength configFile\n" + "   runLength (integer) the number of logs to generate\n"
                                      + "   configFile a logback configuration file in XML format." + " XML files must have a '.xml' extension.");
                      System.exit(1);
                  }
}
