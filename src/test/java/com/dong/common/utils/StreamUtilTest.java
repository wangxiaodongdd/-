package com.dong.common.utils;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

class StreamUtilTest {

	@Test
	void testCloseAll() {
	}

	@Test
	void testReadTextFileInputStream() throws FileNotFoundException {
		String string = StreamUtil.readTextFile(new FileInputStream(new File("d:demo.txt")));
		System.out.println(string);
	}

	@Test
	void testReadTextFileFile() throws FileNotFoundException {
		String string = StreamUtil.readTextFile(new FileInputStream(new File("d:demo.txt")));
		System.out.println(string);
	}

}
