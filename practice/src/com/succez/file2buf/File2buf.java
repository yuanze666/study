package com.succez.file2buf;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * 将文件内容转换成byte数组返回
 * 
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>succez</p>
 * @author caiyuanq
 * @createdate 2021年5月11日
 */
public class File2buf {
	
	/**
	 * 将文件内容转换成byte数组返回,如果文件不存在或者读入错误返回null
	 * 
	 * 创建一个字节数组bytes，使用字节输入流读取文件fobj，把读取后的字节流fis通过字节数组流放入内存缓冲区内
	 * 然后通过捕获缓冲区的数据，转换成字节数组
	 * 如果文件不存在，或者抛异常返回null
	 */
	public static byte[] file2buf(File fobj) throws Exception{
		
		if(null == fobj && !fobj.exists()) {
			return null;
		}
		
		byte[] bytes = null;
		
		/**
		 * 20210511 caiyuanq
		 * 本来的代码使用了try{}catch(){}语句，然后使用流的close()方法进行资源的关闭，catch语句进行异常捕获
		 * 现在使用Java 8的新特性，直接在try(FileInputStream fis = new FileInputStream(fobj)不需要手动关闭IO流
		 * 只要直接在方法中抛出异常即可
		 */
		try(FileInputStream fis = new FileInputStream(fobj);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();) {
			
			byte [] b = new byte[1024];
			int length = 0;
			while((length = fis.read(b)) != -1) {
				bos.write(b, 0, length);
			}
			bytes = bos.toByteArray();
		}
		return bytes;
	}

}