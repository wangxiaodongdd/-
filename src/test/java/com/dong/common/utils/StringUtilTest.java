package com.dong.common.utils;


import org.junit.jupiter.api.Test;

import com.dong.common.utils.StringUtil;

class StringUtilTest {

	@Test
	void testHasLength() {
		String str = " ";
		System.out.println(StringUtil.hasLength(str));
	}

	@Test
	void testHasText() {
		String str = "abc";
		System.out.println(StringUtil.hasText(str));
	}

	@Test
	void testRandomChineseString() {
		String string = StringUtil.randomChineseString();
		System.out.println(string);
	}

	@Test
	void testRandomChineseStringInt() {
		String string = StringUtil.randomChineseString(100);
		System.out.println(string);
	}

	@Test
	void testGenerateChineseName() {
		for (int i = 0; i < 100; i++) {
			String name = StringUtil.generateChineseName();
			System.out.println(name);

		}
	}
	@Test
	void testoisNumber() {
		boolean b = StringUtil.isNumber("1.9");
		System.out.println(b);
	}
}
