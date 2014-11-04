package com.fantasy.framework.service.core.internal;

import org.springframework.context.support.ApplicationObjectSupport;

import com.fantasy.framework.service.core.api.Context;
import com.fantasy.framework.service.core.api.CoreController;
import com.fantasy.framework.service.core.api.Invoke;
import com.fantasy.framework.service.core.api.Service;
import com.fantasy.framework.service.core.exception.FantasyException;

public class CoreControllerImpl extends ApplicationObjectSupport implements CoreController{

	public void run(String serviceName, Context<?> context) {
		 
		Service service = this.getApplicationContext().getBean(serviceName, Service.class);
		 
		try {
			
			service.getEngine().execute(service, context);
			
		} catch (FantasyException e) { 
			e.printStackTrace();
		}
	}

}
