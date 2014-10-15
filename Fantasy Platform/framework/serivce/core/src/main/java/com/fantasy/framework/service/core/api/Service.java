package com.fantasy.framework.service.core.api;

import com.fantasy.framework.service.core.exception.FrameworkException;

public interface Service {
	 
	void execute(Context context) throws FrameworkException;

}
