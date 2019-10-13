package com.dong.common.utils;



import java.io.File;

import org.junit.jupiter.api.Test;

class FileUtilTest {

	@Test
	void testGetExtendName() {
		
		String fileName="1706d.doc";
		String name = FileUtil.getExtendName(fileName);
		System.out.println(name);
	}

	@Test
	void testGetTempDirectory() {
		File file = FileUtil.getTempDirectory();
		System.out.println(file);
	}

	@Test
	void testGetUserDirectory() {
		File file = FileUtil.getUserDirectory();
		System.out.println(file);
	}

}
