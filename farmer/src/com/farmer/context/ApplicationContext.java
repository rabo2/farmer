package com.farmer.context;

import java.util.HashMap;
import java.util.Map;

public class ApplicationContext {
	private static Map<String, Object> applicationContext = new HashMap<String, Object>();

	public ApplicationContext() {
		// TODO Auto-generated constructor stub
	}
	
	public static Map<String, Object> getApplicationContext(){
		return applicationContext;
	}
}
