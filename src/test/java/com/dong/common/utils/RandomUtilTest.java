package com.dong.common.utils;


import org.junit.jupiter.api.Test;

class RandomUtilTest {

	@Test
	void testRandom() {
		int i = RandomUtil.random(1, 10);
		System.out.println(i);
		
	}

	@Test
	void testSubRandom() {
		int[] is = RandomUtil.subRandom(1, 10, 5);
		for(int i:is) {
			System.out.println(i);
		}
		
	}

	@Test
	void testRandomCharacter() {
		char c = RandomUtil.randomCharacter();
		System.out.println(c);
	}

	@Test
	void testRandomString() {
		String string = RandomUtil.randomString(4);
		System.out.println(string);
	}

}
