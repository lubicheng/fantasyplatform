package com.fantasy.framework.service.core.api;

import com.fantasy.framework.service.core.exception.FrameworkException;

public interface Service {
	
	String getName();
	 
	void invoke(Context context) throws FrameworkException;
	
	void export(Context context) throws FrameworkException;

}
