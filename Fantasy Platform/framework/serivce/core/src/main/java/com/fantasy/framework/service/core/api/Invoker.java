package com.fantasy.framework.service.core.api;

public interface Invoker {
	
	Service getService();
	
	long getStartTime();
	long getEndTime();
	
	Context<?> getStartContextSnapshot(); 
	Context<?> getEndContextSnapshot(); 
	
	void invoke(Context<?> context);

}
