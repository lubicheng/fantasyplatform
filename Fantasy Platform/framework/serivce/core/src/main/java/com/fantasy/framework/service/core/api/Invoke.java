package com.fantasy.framework.service.core.api;

public interface Invoke {
	
	Service getService();
	
	long getStartTime();
	long getEndTime();
	
	Context<?> getStartContextSnapshot(); 
	Context<?> getEndContextSnapshot(); 
	 
}
