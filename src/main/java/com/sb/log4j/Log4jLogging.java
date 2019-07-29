package com.sb.log4j;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;

public class Log4jLogging {
	
	static Logger logger = Logger.getLogger(Log4jLogging.class);

	public static void main(String[] args) {
		
		 PropertyConfigurator.configure("log4j.properties");
		 
		 logger.debug("Log4j configuration is successful");

	}

}
