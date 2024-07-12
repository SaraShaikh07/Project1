package com.blaze.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties;
  String path = "C:\\Users\\saras\\eclipse-workspace\\BlazeDemo\\Configuratioin\\config.properties";
  
    public ReadConfig()   {
    	
    	properties = new Properties();
    	try {
			FileInputStream fis = new FileInputStream(path);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }  	
    
    public String getBaseUrl() {
    	
    	String value = properties.getProperty("baseUrl");
    	if(value!= null)
    		return value;
    		else
    			throw new RuntimeException("url not specfied in config file.");
   			 	
    }
    public String getBrowser() {
    	
    	String value = properties.getProperty("browser");
    	if(value!= null)
    		return value;
    		else
    			throw new RuntimeException("url not specfied in config file.");
   			 	
    }
     
    }
      












