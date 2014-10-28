package com.fantasy.framework.service.core.api;

import com.fantasy.framework.service.core.exception.FantasyException;

public interface ServiceEngine {

	ServiceInvoke invoke(Service service, Context context) throws FantasyException;
	
}
