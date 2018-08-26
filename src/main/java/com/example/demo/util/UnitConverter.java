package com.example.demo.util;
/**
 * Created by ZZZ on 2017-06-30.
 */
public final class UnitConverter {

	/** 封闭构造函数 */
	private UnitConverter() {}

	/** 毫米转换为米 */
	public static float millimetreToMetre(float milliMetreValue) {
		return milliMetreValue / 1000F;
	}

	/** 厘米转换为米 */
	public static float centimetreToMetre(float centimetreValue) {
		return centimetreValue / 100F;
	}

	/** 米转换为毫米 */
	public static int metreToMillimetre(float metreValue) {
		return Float.valueOf(metreValue * 1000F).intValue();
	}

	/** 米转换为厘米 */
	public static float metreToCentimetre(float metreValue) {
		return metreValue * 100F;
	}
}