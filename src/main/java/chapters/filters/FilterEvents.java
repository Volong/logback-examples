package chapters.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class FilterEvents {

    private static final Logger LOGGER = LoggerFactory.getLogger(FilterEvents.class);
    
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                MDC.put("username", "sebastien");
                LOGGER.debug("logging statement {}", i);
                MDC.remove("username");
            } else if (i == 6) {
                Marker billing = MarkerFactory.getMarker("billing");
                LOGGER.error(billing, "billing statement {}", i);
            } else {
                LOGGER.info("logging statement {}", i);
            }
        }
    }

}
