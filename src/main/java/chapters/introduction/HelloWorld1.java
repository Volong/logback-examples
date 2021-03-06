package chapters.introduction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld1 {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("chapters.introduction.HelloWorld1");
        logger.debug("hello world");
        logger.debug("sample");
        logger.info("info message");
        logger.warn("warn message");
        logger.trace("trace message");
    }
}
