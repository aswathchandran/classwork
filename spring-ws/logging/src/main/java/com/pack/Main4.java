package com.pack;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Main4 {
static final Logger logger =Logger.getLogger(Main4.class);
	
	public static void main(String[] args) {
	

		
		DOMConfigurator.configure("log4j2.xml");
		logger.debug("sample debug");
		logger.error("error");
		logger.fatal("fatel");
		logger.info("info");
		logger.warn("warn");

	}

}