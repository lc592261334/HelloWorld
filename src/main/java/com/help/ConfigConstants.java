package com.help;

import java.util.Properties;


public class ConfigConstants {
	public static Properties prop = PropertiesRead.readPropertiesFile("config/config.properties", ConfigConstants.class);
	public final static String NetInfoBaseUrl = prop.getProperty("NetInfoBaseUrl");
	public final static String NetMethodUrl = prop.getProperty("NetMethodUrl");
	public final static String NetInfoMethodUrl = prop.getProperty("NetInfoMethodUrl");
	public final static String AccessToken = prop.getProperty("AccessToken");
}
