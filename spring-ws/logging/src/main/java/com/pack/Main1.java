package com.pack;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main1 {
	static final Logger logger =Logger.getLogger(Main1.class);
	public static void main(String[] a) 
	{
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("sample debug");
		logger.error("error");
		logger.fatal("fatel");
		logger.info("info");
		logger.warn("warn");
	}
}
