package chapters.appenders.sift;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;

public class SiftExample {

	public static void main(String[] args) throws JoranException {

		if (args.length != 1) {
			usage("Wrong number of arguments.");
		}
		
		String configFile = args[0];
		
		LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
		JoranConfigurator configurator = new JoranConfigurator();
		context.reset();
		configurator.setContext(context);
		configurator.doConfigure(configFile);
		
		Logger logger = LoggerFactory.getLogger(SiftExample.class);
		logger.debug("Application started");
		
		MDC.put("userid", "Alice");
		logger.debug("Alice say hello");
	}

	static void usage(String msg) {
		System.err.println(msg);
		System.err.println("Usage: java " + SiftExample.class.getName() + " configFile\n"
				+ "   configFile a logback configuration file");
		System.exit(1);
	}
}
