package chapters.layouts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExceptionEvaluatorExample {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionEvaluatorExample.class);

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                LOGGER.debug("logging statement " + i, new TestException("do not display this"));
            } else {
                LOGGER.debug("logging statement " + i, new Exception("display"));
            }
        }
    }
}
