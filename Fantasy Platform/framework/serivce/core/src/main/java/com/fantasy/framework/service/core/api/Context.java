package com.fantasy.framework.service.core.api;

import java.util.Locale;
import java.util.Map;
import java.util.Stack;

public interface Context<T> {
	
	CoreController getCoreController();
	
	Service getMainService();
	
	Stack<ServiceInvoke> getServiceInvokeStack();
	
	Service getRunningService();
	
	Throwable getRisedException();
	
	Locale getLocale(); 
	
	Map<String, Object> getSysData();
	
	T getData();
	
	T setData(T d);

}
