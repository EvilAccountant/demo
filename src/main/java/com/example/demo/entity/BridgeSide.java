package com.example.demo.entity;


/**
 * 桥梁分幅 对应 TBL_BRIDGE_SIDE
 */

public class BridgeSide {

	/**
	 * 桥梁ID
	 */
	private String bridgeId;

	/**
	 * 分幅类型（参数表）
	 */
	private String sideType;

	/**
	 * 分幅名称
	 */
	private String sideTypeName;

	/**
	 * 桥梁全长（毫米）
	 */
	private Integer bridgeLength;

	/**
	 * 最大跨径（毫米）
	 */
	private Float maxSpan;

	/**
	 * 跨径组合
	 */
	private String spanComb;

	/**
	 * 桥上净高(毫米)
	 */
	private Integer upClearHeight;

	private String superStructureTypeName;

    public String getBridgeId() {
		return bridgeId;
	}

	public void setBridgeId(String bridgeId) {
		this.bridgeId = bridgeId;
	}

	public String getSideType() {
		return sideType;
	}

	public void setSideType(String sideType) {
		this.sideType = sideType;
	}

	public Integer getBridgeLength() {
		return bridgeLength;
	}

	public void setBridgeLength(Integer bridgeLength) {
		this.bridgeLength = bridgeLength;
	}

	public Float getMaxSpan() {
		return maxSpan;
	}

	public void setMaxSpan(Float maxSpan) {
		this.maxSpan = maxSpan;
	}

	public String getSpanComb() {
		return spanComb;
	}

	public void setSpanComb(String spanComb) {
		this.spanComb = spanComb;
	}

	public Integer getUpClearHeight() {
		return upClearHeight;
	}

	public void setUpClearHeight(Integer upClearHeight) {
		this.upClearHeight = upClearHeight;
	}

	public String getSideTypeName() {
		return sideTypeName;
	}

	public void setSideTypeName(String sideTypeName) {
		this.sideTypeName = sideTypeName;
	}

	public String getSuperStructureTypeName() {
		return superStructureTypeName;
	}

	public void setSuperStructureTypeName(String superStructureTypeName) {
	    this.superStructureTypeName = superStructureTypeName;
	}

}