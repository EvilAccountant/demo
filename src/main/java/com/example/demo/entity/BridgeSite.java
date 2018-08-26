package com.example.demo.entity;

/**
 * 孔跨 对应 TBL_BRIDGE_SITE
 */
public class BridgeSite {
	/**
	 * 主键(同SITE_DETAIL)
	 */
	private String id;
	/**
	 * 桥梁ID
	 */
	private String bridgeId;
	/**
	 * 分幅类型
	 */
	private String sideType;
	/**
	 * 孔号
	 */
	private Integer siteNo;
	/**
	 * 联号
	 */
	private Integer jointNo;
	/**
	 * 跨径
	 */
	private Integer span;
	private int memberCount;
	private int diseaseCount;

	private String superStructureTypeName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public Integer getSiteNo() {
		return siteNo;
	}

	public void setSiteNo(Integer siteNo) {
		this.siteNo = siteNo;
	}

	public Integer getJointNo() {
		return jointNo;
	}

	public void setJointNo(Integer jointNo) {
		this.jointNo = jointNo;
	}

	public Integer getSpan() {
		return span;
	}

	public void setSpan(Integer span) {
		this.span = span;
	}

	public int getMemberCount() {
		return memberCount;
	}

	public void setMemberCount(int memberCount) {
		this.memberCount = memberCount;
	}

	public int getDiseaseCount() {
		return diseaseCount;
	}

	public void setDiseaseCount(int diseaseCount) {
		this.diseaseCount = diseaseCount;
	}

	public String getSuperStructureTypeName() {
		return superStructureTypeName;
	}

	public void setSuperStructureTypeName(String superStructureTypeName) {
		this.superStructureTypeName = superStructureTypeName;
	}
}