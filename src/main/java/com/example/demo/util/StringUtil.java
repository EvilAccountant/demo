package com.example.demo.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zzj on 2017/7/5.
 */
public class StringUtil {

	private static final int scale = 62;
	/**
	 * 62进制顺序：数字，小写字母，大写字母
	 * 64进制顺序：大写字母，小写字母，数字 和 + /
	 */
	private static final char[] charArray = {
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
			'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
			'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
			'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
			'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	/**
	 * null或""或空白字符或null字符都算作empty
	 * @param str
	 * @return
	 */
	public static boolean isStrictEmpty(String str){
		if (str==null || str.length()==0 || str.trim().length()==0 || str.trim().equals("null")){
			return true;
		}
		return false;
	}
	/**
	 * null或""或空白字符算作empty
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		if (str==null || str.length()==0 || str.trim().length()==0 || str.equals("null")){
			return true;
		}
		return false;
	}

	public static boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}

	public static boolean someEmpty(String... strings) {
		for (String str : strings) {
			if (isEmpty(str)) return true;
		}
		return false;
	}

	/**
	 * 空时用斜杠代替
	 * @param s
	 * @return
	 */
	public static String xieGang(String s){
		if (s==null || s.trim().length()<=0 || "null".equals(s.trim())){
			return "/";
		}
		return s;
	}

	/**
	 * 将数字62进制编码，长度不足7位时，前面补0
	 * 62进制最大值为 ZZZZZZZ=3521614606207,约2680年
	 * @param num 10进制数
	 * @return
	 */
	public static String encodeStr(long num){
		if (num<scale) {
			return String.valueOf(charArray[(int)num]);
		}
		StringBuilder sb = new StringBuilder();
		long remainder = 0;
		do {
			remainder = num % scale;
			sb.append(charArray[(int)remainder]);
			num = num / scale;
		}
		while (num > scale - 1);
		sb.append(charArray[(int)num]);
		sb=sb.reverse();
		while (sb.length()<7) {
			sb.insert(0, '0');
		}
		return sb.toString();
	}

	/**
	 * 将编码的62进制数值还原为10进制数
	 * @param str 可能有前导0
	 * @return
	 */
	public static long decodeNum(String str){
		// Trim the leading zeros first
		while (str.length()>1 && str.charAt(0)=='0') {
			str=str.substring(1);
		}
		long num = 0;
		int index = 0;
		String charString=new String(charArray);
		for(int i = 0; i < str.length(); i++) {
			index = charString.indexOf(str.charAt(i));
			num += (long)(index * (Math.pow(scale, str.length() - i - 1)));
		}
		return num;
	}

	/**
	 * 将Entity字段转为数据库带下划线字段
	 * @return
	 */
	/**
	 * 将驼峰格式的字符串转换为下划线格式
	 * @param str 待转化的字符串
	 * @return    下划线格式的字符串
	 */
	public static String camelCaseToUnderscore(String str) {
		Matcher m = Pattern.compile("[A-Z]").matcher(str);
		StringBuffer sb = new StringBuffer();
		while(m.find()) {
			m.appendReplacement(sb, "_"+m.group());
		}
		m.appendTail(sb);
		return sb.toString().toUpperCase();
	}

	public static Integer toInt(String str){
		Integer i=0;
		try {
			i=Integer.valueOf(str);
		}catch (Exception e){}
		return i;
	}
	public static Float toFloat(String str){
		Float f=0f;
		try {
			f=Float.valueOf(str);
		}catch (Exception e){}
		return f;
	}
}
