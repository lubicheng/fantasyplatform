package com.fantasy.framework.service.core.api;

public interface ServiceInvoke {
	
	Service getService();
	
	long getStartTime();
	
	long getEndTime();
	
	long getResult();
	
	Context getStartContextSnapshot(); 
	
	Context getEndContextSnapshot(); 

}
