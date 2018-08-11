package chapters.layouts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SampleLogging {

	private static final Logger logger = LoggerFactory.getLogger(SampleLogging.class);
	
    public static void main(String[] args) {
        logger.debug("Everything's going well");
        logger.error("maybe not quite...");
    }

}
