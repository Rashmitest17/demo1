package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jdemo {

	private static Logger logger = LogManager.getLogger(Log4jdemo.class);

	public static void main(String[] args) {

		System.out.println("Hello World ");
		logger.trace("This is trace Message!");
		logger.info("This is information message");
		logger.error("This is an Error Message");
		logger.warn("This is Warnning message");
		logger.fatal("This is an fatal Message");

		System.out.print("Completed");

	}
}
