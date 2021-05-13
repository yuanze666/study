package com.succez.int2hex;

import org.junit.Test;

/**
 * IntToHex的测试用例
 * 
 * <p>Copyright: Copyright (c) 2021</p>
 * <p>succez</p>
 * @author caiyuanq
 * @createdate 2021年5月12日
 */
class IntToHexTest {

	
	@Test
	void testInt2Hex() {
		System.out.println(IntToHex.int2Hex(0));
		System.out.println(IntToHex.int2Hex(236));
		System.out.println(IntToHex.int2Hex(100));
	}

}
