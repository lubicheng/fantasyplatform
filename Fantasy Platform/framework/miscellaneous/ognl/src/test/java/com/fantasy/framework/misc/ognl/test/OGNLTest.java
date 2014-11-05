package com.fantasy.framework.misc.ognl.test;

import static org.junit.Assert.*;
import ognl.Ognl;
import ognl.OgnlException;

import org.junit.Test;

public class OGNLTest {

	@Test
	public void test1() {

		// 1 !=1校验，检查是否返回true类型

		try {
			assertFalse((Boolean) Ognl.getValue("1!=1", null));
		} catch (OgnlException e) {
			fail(e.toString());
		}
	}

}
