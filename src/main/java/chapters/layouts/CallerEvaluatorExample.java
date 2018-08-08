package chapters.layouts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CallerEvaluatorExample {

    public static void main(String[] args) {
        
        Logger logger = LoggerFactory.getLogger(CallerEvaluatorExample.class);
        
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                logger.debug("who calls thee?");
            } else {
                logger.debug("I know me" + i);
            }
        }
    }
}
