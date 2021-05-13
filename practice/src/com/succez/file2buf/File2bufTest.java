package com.succez.file2buf;

import java.io.File;

import org.junit.Test;

/**
 * File2buf的测试用例
 * <p>Copyright: Copyright (c) 2021</p>
 * <p>succez</p>
 * @author caiyuanq
 * @createdate 2021年5月12日
 */
class File2bufTest {



	@Test
	void testFile2buf() throws Exception {
		File fobj1 = new File("E:\\text\\t1.txt");
		System.out.println(File2buf.file2buf(fobj1));

		File fobj2 = new File("E:\\text\\t2.txt");
		System.out.println(File2buf.file2buf(fobj2));

		File fobj3 = new File("E:\\text\\t3.txt");
		System.out.println(File2buf.file2buf(fobj3));

		File fobj4 = new File("E:\\text\\t4.txt");
		System.out.println(File2buf.file2buf(fobj4));

		File fobj5 = new File("E:\\text\\t5.txt");
		System.out.println(File2buf.file2buf(fobj5));
	}

}
