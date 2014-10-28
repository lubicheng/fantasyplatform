package com.fantasy.framework.service.core.api;

import java.util.Map;

public interface Service {

	String getName(); 
	String getLocation();
	String getInvokeString();
	Engine getEngine(); 
	String getDescription();
	Map<String, String> getParams();
	
	
}
