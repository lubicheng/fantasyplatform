package com.fantasy.framework.misc.ognl.test;

import java.util.HashMap;

import ognl.OgnlException;

import org.junit.Test;

import com.fantasy.framework.misc.ognl.OGNLUtils;

public class OGNLUtilsTest {
	
	@Test
	public void test1() {
		
		HashMap a = new HashMap();
		a.put("aaa", "cctv");
		
		try {
			System.out.println(OGNLUtils.getValue("bbb = #{'xxx': 'xxx', 'yyy': 'yyy'}", a));
			
			System.out.println((a.toString()));
		} catch (OgnlException e) {
			 
			e.printStackTrace();
		}
	}

}
