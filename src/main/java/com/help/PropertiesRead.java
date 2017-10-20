package com.help;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.log4j.Logger;

public class PropertiesRead {
	private static Logger LOGGER = Logger.getLogger(PropertiesRead.class);

	public static Properties readPropertiesFile(String fileName, Class<?> clazz) {
		InputStream inStream = readFromUsrDir(fileName);
		if (inStream == null) {
			inStream = readFromClassPath(fileName, clazz);
		}
		Properties prop = new Properties();
		try{
			if (inStream != null){
				prop.load(inStream);
				inStream.close();
				LOGGER.info("## 加载配置" + fileName + "成功");
			}
			else{
				prop = null;
				LOGGER.error("## 加载配置文件" + fileName + "成功");
			}
		}
		catch (Exception e){
			prop = null;
			LOGGER.error("## 加载配置文件失败");
		}
		return prop;
	}

	private static InputStream readFromUsrDir(String fileName){
		String filePath = System.getProperty("user.dir") + File.separator + fileName;
		InputStream inStream = null;
		try{
			inStream = new FileInputStream(filePath);
		}
		catch (FileNotFoundException e) {}
		return inStream;
	}

	private static InputStream readFromClassPath(String fileName, Class<?> clazz){
		return clazz.getClassLoader().getResourceAsStream(fileName);
	}

}
