package com.fantasy.framework.service.core.api;

import java.util.Locale;
import java.util.Map;
import java.util.Stack;

public interface Context<T> {
	
	CoreController getCoreController();
	
	Service getMainService(); 

	Service getRunningService();
	
	Stack<Invoker> getServiceInvokeStack();
	 
	Throwable getRisedException();
	
	Locale getLocale(); 
	
	Map<String, Object> getSysPram();
	
	T getData();
	
	Context<T> clone();

}
