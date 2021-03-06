package com.fantasy.framework.service.core.api;

import com.fantasy.framework.service.core.exception.FantasyException;

public interface Engine {
	
	String getName();

	void execute(Service service, Context<?> context) throws FantasyException;
	
}
