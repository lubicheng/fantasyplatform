package com.fantasy.framework.service.core.engine;

import java.net.URL;

import com.fantasy.framework.service.core.api.Context;

public interface Engine {

	public void invoke(Context context);

	public URL export();

}
