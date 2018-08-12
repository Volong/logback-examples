package chapters.layouts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrivialMain {

	public static void main(String[] args) {
		
		Logger logger = LoggerFactory.getLogger(TrivialMain.class);
		
		for (int i = 0; i < 6; i++) {
			if (i % 5 == 0) {
				logger.warn("a warining message " + i);
			} else if (i % 3 == 0) {
				logger.info("hello world number " + i);
			} else {
				logger.debug("hello world number " + i);
			}
		}
		
		logger.error("Finish off with fireworks", new Exception("Just testing"));
	}
}
