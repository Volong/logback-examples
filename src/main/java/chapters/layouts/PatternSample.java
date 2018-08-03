package chapters.layouts;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.ConsoleAppender;

public class PatternSample {

    public static void main(String[] args) {
        
        Logger rootLogger = (Logger) LoggerFactory.getLogger(PatternSample.class);
        LoggerContext loggerContext = rootLogger.getLoggerContext();
        loggerContext.reset();
        
        PatternLayoutEncoder encoder = new PatternLayoutEncoder();
        encoder.setContext(loggerContext);
        encoder.setPattern("%-5level [%thread] %message%n");
        encoder.start();
        
        ConsoleAppender<ILoggingEvent> consoleAppender = new ConsoleAppender<>();
        consoleAppender.setEncoder(encoder);
        consoleAppender.setContext(loggerContext);
        consoleAppender.start();
        
        rootLogger.addAppender(consoleAppender);
        
        
        rootLogger.debug("Message 1");
        rootLogger.warn("Message 2");
        
    }
}
