package com.pack;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main2 {
	static final Logger logger =Logger.getLogger(Main2.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertyConfigurator.configure("log4j1.properties");
		logger.debug("sample debug");
		logger.error("error");
		logger.fatal("fatel");
		logger.info("info");
		logger.warn("warn");

	}

}
