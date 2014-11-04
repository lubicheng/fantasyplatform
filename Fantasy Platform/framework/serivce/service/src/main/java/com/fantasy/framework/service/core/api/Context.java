package com.fantasy.framework.service.core.api;

import java.util.Locale;
import java.util.Map;
import java.util.Stack;

public interface Context<T> {
	
	CoreController getCoreController();
	
	Invoke getMainServiceInvoke(); 

	Invoke getRunningServiceInvoke();
	
	Stack<Invoke> getServiceInvokeStack();
	 
	Throwable getRisedException();
	
	Locale getLocale(); 
	
	Map<String, Object> getSysParam();
	
	T getData();
	
	Context<T> clone();

}
