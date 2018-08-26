package com.example.demo.entity;

/**
 * 孔跨明细 对应 TBL_BRIDGE_SITE_DETAIL
 */
public class BridgeSiteDetail {
	/**
	 * 桥梁ID(联合主键1)
	 */
	private String bridgeId;
	/**
	 * 分幅类型(联合主键2)
	 */
	private String sideType;
	/**
	 * 孔号(联合主键3)
	 */
	private Integer siteNo;
	/**
	 * 上部结构类型
	 */
	private String superStructureType;
	/**
	 * 上部结构材料类型
	 */
	private String superMaterialType;
	/**
	 * 上部结构受力形式
	 */
	private String superForceType;
	/**
	 * 上部结构施工方式
	 */
	private String superConstructType;
	/**
	 * 支座类型
	 */
	private String supportType;
	/**
	 * 支座型号
	 */
	private String supportModel;
	/**
	 * 混凝土强度
	 */
	private String concreteStrength;
	/**
	 * 跨中底板宽
	 */
	private Integer midSpanWidth;
	/**
	 * 墩顶底板宽
	 */
	private Integer pierTopWidth;
	/**
	 * 跨中梁高
	 */
	private Integer midSpanHeight;
	/**
	 * 墩顶梁高
	 */
	private Integer pierTopHeight;
	/**
	 * 桥墩类型
	 */
	private String pierType;

	/**
	 * 桥墩受力形式
	 */
	private String pierForceType;
	/**
	 * 桥墩基础类型
	 */
	private String pierBaseType;
	/**
	 * 桥墩基础材料类型
	 */
	private String pierBaseMaterialType;
	/**
	 * 桥墩基础施工方式
	 */
	private String pierBaseConstructType;
	/**
	 * 盖梁宽
	 */
	private Integer pierWidth;
	/**
	 * 盖梁厚
	 */
	private Integer pierThickness;
	/**
	 * 墩柱直径
	 */
	private Integer pierRadius;
	/**
	 * 桥墩桩数
	 */
	private Integer pierStakeNum;
	/**
	 * 桥墩桩径
	 */
	private Integer pierStakeRadius;
	/**
	 * 桥台类型
	 */
	private String abutmentType;

	/**
	 * 桥台受力形式
	 */
	private String abutmentForceType;
	/**
	 * 桥台基础类型
	 */
	private String abutmentBaseType;
	/**
	 * 桥台基础材料类型
	 */
	private String abutmentBaseMaterialType;
	/**
	 * 桥台基础施工方式
	 */
	private String abutmentBaseConstructType;
	/**
	 * 台宽
	 */
	private Integer abutmentWidth;
	/**
	 * 台厚
	 */
	private Integer abutmentThickness;
	/**
	 * 台柱直径
	 */
	private Integer abutmentRadius;
	/**
	 * 桥台桩数
	 */
	private Integer abutmentStakeNum;
	/**
	 * 桥台桩径
	 */
	private Integer abutmentStakeRadius;

	public BridgeSiteDetail() {
	}

	public BridgeSiteDetail(String bridgeId, String sideType, Integer siteNo) {
		this.bridgeId = bridgeId;
		this.sideType = sideType;
		this.siteNo = siteNo;
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

	public String getSuperStructureType() {
		return superStructureType;
	}

	public void setSuperStructureType(String superStructureType) {
		this.superStructureType = superStructureType;
	}

	public String getSuperMaterialType() {
		return superMaterialType;
	}

	public void setSuperMaterialType(String superMaterialType) {
		this.superMaterialType = superMaterialType;
	}

	public String getSuperForceType() {
		return superForceType;
	}

	public void setSuperForceType(String superForceType) {
		this.superForceType = superForceType;
	}

	public String getSuperConstructType() {
		return superConstructType;
	}

	public void setSuperConstructType(String superConstructType) {
		this.superConstructType = superConstructType;
	}

	public String getSupportType() {
		return supportType;
	}

	public void setSupportType(String supportType) {
		this.supportType = supportType;
	}

	public String getSupportModel() {
		return supportModel;
	}

	public void setSupportModel(String supportModel) {
		this.supportModel = supportModel;
	}

	public String getConcreteStrength() {
		return concreteStrength;
	}

	public void setConcreteStrength(String concreteStrength) {
		this.concreteStrength = concreteStrength;
	}

	public Integer getMidSpanWidth() {
		return midSpanWidth;
	}

	public void setMidSpanWidth(Integer midSpanWidth) {
		this.midSpanWidth = midSpanWidth;
	}

	public Integer getPierTopWidth() {
		return pierTopWidth;
	}

	public void setPierTopWidth(Integer pierTopWidth) {
		this.pierTopWidth = pierTopWidth;
	}

	public Integer getMidSpanHeight() {
		return midSpanHeight;
	}

	public void setMidSpanHeight(Integer midSpanHeight) {
		this.midSpanHeight = midSpanHeight;
	}

	public Integer getPierTopHeight() {
		return pierTopHeight;
	}

	public void setPierTopHeight(Integer pierTopHeight) {
		this.pierTopHeight = pierTopHeight;
	}

	public String getPierType() {
		return pierType;
	}

	public void setPierType(String pierType) {
		this.pierType = pierType;
	}

	public String getPierForceType() {
		return pierForceType;
	}

	public void setPierForceType(String pierForceType) {
		this.pierForceType = pierForceType;
	}

	public String getPierBaseType() {
		return pierBaseType;
	}

	public void setPierBaseType(String pierBaseType) {
		this.pierBaseType = pierBaseType;
	}

	public String getPierBaseMaterialType() {
		return pierBaseMaterialType;
	}

	public void setPierBaseMaterialType(String pierBaseMaterialType) {
		this.pierBaseMaterialType = pierBaseMaterialType;
	}

	public String getPierBaseConstructType() {
		return pierBaseConstructType;
	}

	public void setPierBaseConstructType(String pierBaseConstructType) {
		this.pierBaseConstructType = pierBaseConstructType;
	}

	public Integer getPierWidth() {
		return pierWidth;
	}

	public void setPierWidth(Integer pierWidth) {
		this.pierWidth = pierWidth;
	}

	public Integer getPierThickness() {
		return pierThickness;
	}

	public void setPierThickness(Integer pierThickness) {
		this.pierThickness = pierThickness;
	}

	public Integer getPierRadius() {
		return pierRadius;
	}

	public void setPierRadius(Integer pierRadius) {
		this.pierRadius = pierRadius;
	}

	public Integer getPierStakeNum() {
		return pierStakeNum;
	}

	public void setPierStakeNum(Integer pierStakeNum) {
		this.pierStakeNum = pierStakeNum;
	}

	public Integer getPierStakeRadius() {
		return pierStakeRadius;
	}

	public void setPierStakeRadius(Integer pierStakeRadius) {
		this.pierStakeRadius = pierStakeRadius;
	}

	public String getAbutmentType() {
		return abutmentType;
	}

	public void setAbutmentType(String abutmentType) {
		this.abutmentType = abutmentType;
	}

	public String getAbutmentForceType() {
		return abutmentForceType;
	}

	public void setAbutmentForceType(String abutmentForceType) {
		this.abutmentForceType = abutmentForceType;
	}

	public String getAbutmentBaseType() {
		return abutmentBaseType;
	}

	public void setAbutmentBaseType(String abutmentBaseType) {
		this.abutmentBaseType = abutmentBaseType;
	}

	public String getAbutmentBaseMaterialType() {
		return abutmentBaseMaterialType;
	}

	public void setAbutmentBaseMaterialType(String abutmentBaseMaterialType) {
		this.abutmentBaseMaterialType = abutmentBaseMaterialType;
	}

	public String getAbutmentBaseConstructType() {
		return abutmentBaseConstructType;
	}

	public void setAbutmentBaseConstructType(String abutmentBaseConstructType) {
		this.abutmentBaseConstructType = abutmentBaseConstructType;
	}

	public Integer getAbutmentWidth() {
		return abutmentWidth;
	}

	public void setAbutmentWidth(Integer abutmentWidth) {
		this.abutmentWidth = abutmentWidth;
	}

	public Integer getAbutmentThickness() {
		return abutmentThickness;
	}

	public void setAbutmentThickness(Integer abutmentThickness) {
		this.abutmentThickness = abutmentThickness;
	}

	public Integer getAbutmentRadius() {
		return abutmentRadius;
	}

	public void setAbutmentRadius(Integer abutmentRadius) {
		this.abutmentRadius = abutmentRadius;
	}

	public Integer getAbutmentStakeNum() {
		return abutmentStakeNum;
	}

	public void setAbutmentStakeNum(Integer abutmentStakeNum) {
		this.abutmentStakeNum = abutmentStakeNum;
	}

	public Integer getAbutmentStakeRadius() {
		return abutmentStakeRadius;
	}

	public void setAbutmentStakeRadius(Integer abutmentStakeRadius) {
		this.abutmentStakeRadius = abutmentStakeRadius;
	}
}