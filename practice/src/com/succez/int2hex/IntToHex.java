package com.succez.int2hex;

/**
 * 实现整数转换为16进制字符串
 * 
 * <p>Copyright: Copyright (c) 2021</p>
 * <p>succez</p>
 * @author caiyuanq
 * @createdate 2021年5月12日
 */
public class IntToHex {
	
	/**
	 * 对整数进行取余运算，余数为code字符数组的下标，然后使用StringBuffer对象，将code[a%16]添加到StringBuffer对象中
	 * append(char a):是将字符c追加到StringBuffer对象序列中
	 * 使用StringBuffer对象是因为它是可变类，可以线程安全的对字符串进行操作
	 * 每个StringBuffer对象都有一定的字符缓冲区容量，当字符串大小超过额定容量时，会自动增加容量
	 * StringBuffer.reverse()是进行对象中的字符串进行倒置反转。
	 * toString()将对象中的数据进行字符串的转换。
	 */
	public static String int2Hex(int a) {
		
		if(0 == a) {
			return "0";
		}
		
		StringBuffer sb = new StringBuffer();

		char [] code = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		while(a != 0) {
			sb = sb.append(code[a%16]);
			a /= 16;
		}
		
		return sb.reverse().toString();
	}
	
}