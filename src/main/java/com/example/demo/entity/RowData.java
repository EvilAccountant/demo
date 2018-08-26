package com.example.demo.entity;

import org.apache.poi.ss.usermodel.Row;

import static com.example.demo.util.ExcelUtils.*;

public final class RowData {


    private String bridgeNo;

    private String sideType;

    private int siteNo;

    private int boxNum;

    private int boxCount;

    private int plateNum;

    private int tNum;

    private int iNum;

    private int hBeamNum;

    private int hPlateNum;

    private int abutSupportNum;

    private int pierSupportNum;

    private int expansionJointNum;

    private int wingNum;

    private int earNum;

    private int zNum;

    private int abutColNum;

    private int abutPlateNum;

    private int abutBackNum;

    private int abutHatNum;

    private int abutBodyNum;

    private int abutWallNum;

    private int pierColNum;

    private int pierHatNum;

    private int pierBeamNum;

    private int pierBodyNum;

    private int pierBaseNum;

    private int abutBaseNum;

    private int riverBedNum;

    private int regularNum;

    private String supportType;

    private String expansionJointType;

    private String superStructureType;

    private String superMaterialType;

    private String superForceType;

    private String superConstructType;

    private int midSpanWidth;

    private int pierTopWidth;

    private int midSpanHeight;

    private int pierTopHeight;

    private String designStrength;

    private int pierWidth;

    private int pierThickness;

    private int pierRadius;

    private int pierStakeNum;

    private int pierStakeRadius;

    private int abutmentThickness;

    private int abutmentWidth;

    private int abutmentRadius;

    private int abutmentStakeNum;

    private int abutmentStakeRadius;

    private String pierType;

    private String pierForceType;

    private String pierMaterialType;

    private String pierBaseType;

    private String pierBaseMaterialType;

    private String pierBaseConstructType;

    private String abutmentType;

    private String abutmentMaterialType;

    private String abutmentBaseType;

    private String abutmentBaseMaterialType;

    private String abutmentBaseConstructType;

    private RowData() {}

    public static RowData of(Row row) {
        RowData rowData = new RowData();
        rowData.bridgeNo = getCellStringValue(row.getCell(1));
        rowData.sideType = getCellStringValue(row.getCell(3));
        rowData.siteNo = getCellIntValue(row.getCell(7));
//        rowData.boxNum = getCellIntValue(row.getCell(8));
//        rowData.boxCount = getCellIntValue(row.getCell(9));
//        rowData.plateNum = getCellIntValue(row.getCell(10));
//        rowData.tNum = getCellIntValue(row.getCell(11));
//        rowData.iNum = getCellIntValue(row.getCell(12));
//        rowData.hBeamNum = getCellIntValue(row.getCell(13));
//        rowData.hPlateNum = getCellIntValue(row.getCell(14));
//        rowData.abutSupportNum = getCellIntValue(row.getCell(15));
//        rowData.pierSupportNum = getCellIntValue(row.getCell(16));
//        rowData.expansionJointNum = getCellIntValue(row.getCell(17));
//        rowData.wingNum = getCellIntValue(row.getCell(18));
//        rowData.earNum = getCellIntValue(row.getCell(19));
//        rowData.zNum = getCellIntValue(row.getCell(20));
//        rowData.abutColNum = getCellIntValue(row.getCell(21));
//        rowData.abutPlateNum = getCellIntValue(row.getCell(22));
//        rowData.abutBackNum = getCellIntValue(row.getCell(23));
//        rowData.abutHatNum = getCellIntValue(row.getCell(24));
//        rowData.abutBodyNum = getCellIntValue(row.getCell(25));
//        rowData.abutWallNum = getCellIntValue(row.getCell(26));
//        rowData.pierColNum = getCellIntValue(row.getCell(27));
//        rowData.pierHatNum = getCellIntValue(row.getCell(28));
//        rowData.pierBeamNum = getCellIntValue(row.getCell(29));
//        rowData.pierBodyNum = getCellIntValue(row.getCell(30));
//        rowData.pierBaseNum = getCellIntValue(row.getCell(31));
//        rowData.abutBaseNum = getCellIntValue(row.getCell(32));
//        rowData.riverBedNum = getCellIntValue(row.getCell(33));
//        rowData.regularNum = getCellIntValue(row.getCell(34));
        rowData.supportType = getCellStringValue(row.getCell(35)).split(",")[0];
//        rowData.expansionJointType = getCellStringValue(row.getCell(36)).split(",")[0];
        rowData.superStructureType = getCellStringValue(row.getCell(37));
        rowData.superMaterialType = getCellStringValue(row.getCell(38));
        rowData.superForceType = getCellStringValue(row.getCell(39));
        rowData.superConstructType = getCellStringValue(row.getCell(40));
        rowData.midSpanWidth = getCellIntValue(row.getCell(41));
        rowData.pierTopWidth = getCellIntValue(row.getCell(42));
        rowData.midSpanHeight = getCellIntValue(row.getCell(43));
        rowData.pierTopHeight = getCellIntValue(row.getCell(44));
//        rowData.designStrength = getCellStringValue(row.getCell(45));
        rowData.pierWidth = getCellIntValue(row.getCell(46));
        rowData.pierThickness = getCellIntValue(row.getCell(47));
        rowData.pierRadius = getCellIntValue(row.getCell(48));
        rowData.pierStakeNum = getCellIntValue(row.getCell(49));
        rowData.pierStakeRadius = getCellIntValue(row.getCell(50));
        rowData.abutmentWidth = getCellIntValue(row.getCell(51));
        rowData.abutmentThickness = getCellIntValue(row.getCell(52));
        rowData.abutmentRadius = getCellIntValue(row.getCell(53));
        rowData.abutmentStakeNum = getCellIntValue(row.getCell(54));
        rowData.abutmentStakeRadius = getCellIntValue(row.getCell(55));
//        rowData.pierMaterialType = getCellStringValue(row.getCell(56));
//        rowData.abutmentMaterialType = getCellStringValue(row.getCell(57));
        rowData.pierForceType = getCellStringValue(row.getCell(58));
        rowData.pierType = getCellStringValue(row.getCell(59));
        rowData.abutmentType = getCellStringValue(row.getCell(60));
        rowData.pierBaseMaterialType = getCellStringValue(row.getCell(61));
        rowData.pierBaseType = getCellStringValue(row.getCell(62));
        rowData.pierBaseConstructType = getCellStringValue(row.getCell(63));
        rowData.abutmentBaseMaterialType = getCellStringValue(row.getCell(64));
        rowData.abutmentBaseType = getCellStringValue(row.getCell(65));
        rowData.abutmentBaseConstructType = getCellStringValue(row.getCell(66));
        return rowData;
    }

    public String getBridgeNo() {
        return bridgeNo;
    }

    public void setBridgeNo(String bridgeNo) {
        this.bridgeNo = bridgeNo;
    }

    public String getSideType() {
        return sideType;
    }

    public void setSideType(String sideType) {
        this.sideType = sideType;
    }

    public int getSiteNo() {
        return siteNo;
    }

    public void setSiteNo(int siteNo) {
        this.siteNo = siteNo;
    }

    public int getBoxNum() {
        return boxNum;
    }

    public void setBoxNum(int boxNum) {
        this.boxNum = boxNum;
    }

    public int getBoxCount() {
        return boxCount;
    }

    public void setBoxCount(int boxCount) {
        this.boxCount = boxCount;
    }

    public int getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(int plateNum) {
        this.plateNum = plateNum;
    }

    public int gettNum() {
        return tNum;
    }

    public void settNum(int tNum) {
        this.tNum = tNum;
    }

    public int getiNum() {
        return iNum;
    }

    public void setiNum(int iNum) {
        this.iNum = iNum;
    }

    public int gethBeamNum() {
        return hBeamNum;
    }

    public void sethBeamNum(int hBeamNum) {
        this.hBeamNum = hBeamNum;
    }

    public int gethPlateNum() {
        return hPlateNum;
    }

    public void sethPlateNum(int hPlateNum) {
        this.hPlateNum = hPlateNum;
    }

    public int getAbutSupportNum() {
        return abutSupportNum;
    }

    public void setAbutSupportNum(int abutSupportNum) {
        this.abutSupportNum = abutSupportNum;
    }

    public int getPierSupportNum() {
        return pierSupportNum;
    }

    public void setPierSupportNum(int pierSupportNum) {
        this.pierSupportNum = pierSupportNum;
    }

    public int getExpansionJointNum() {
        return expansionJointNum;
    }

    public void setExpansionJointNum(int expansionJointNum) {
        this.expansionJointNum = expansionJointNum;
    }

    public int getWingNum() {
        return wingNum;
    }

    public void setWingNum(int wingNum) {
        this.wingNum = wingNum;
    }

    public int getEarNum() {
        return earNum;
    }

    public void setEarNum(int earNum) {
        this.earNum = earNum;
    }

    public int getzNum() {
        return zNum;
    }

    public void setzNum(int zNum) {
        this.zNum = zNum;
    }

    public int getAbutColNum() {
        return abutColNum;
    }

    public void setAbutColNum(int abutColNum) {
        this.abutColNum = abutColNum;
    }

    public int getAbutPlateNum() {
        return abutPlateNum;
    }

    public void setAbutPlateNum(int abutPlateNum) {
        this.abutPlateNum = abutPlateNum;
    }

    public int getAbutBackNum() {
        return abutBackNum;
    }

    public void setAbutBackNum(int abutBackNum) {
        this.abutBackNum = abutBackNum;
    }

    public int getAbutHatNum() {
        return abutHatNum;
    }

    public void setAbutHatNum(int abutHatNum) {
        this.abutHatNum = abutHatNum;
    }

    public int getAbutBodyNum() {
        return abutBodyNum;
    }

    public void setAbutBodyNum(int abutBodyNum) {
        this.abutBodyNum = abutBodyNum;
    }

    public int getAbutWallNum() {
        return abutWallNum;
    }

    public void setAbutWallNum(int abutWallNum) {
        this.abutWallNum = abutWallNum;
    }

    public int getPierColNum() {
        return pierColNum;
    }

    public void setPierColNum(int pierColNum) {
        this.pierColNum = pierColNum;
    }

    public int getPierHatNum() {
        return pierHatNum;
    }

    public void setPierHatNum(int pierHatNum) {
        this.pierHatNum = pierHatNum;
    }

    public int getPierBeamNum() {
        return pierBeamNum;
    }

    public void setPierBeamNum(int pierBeamNum) {
        this.pierBeamNum = pierBeamNum;
    }

    public int getPierBodyNum() {
        return pierBodyNum;
    }

    public void setPierBodyNum(int pierBodyNum) {
        this.pierBodyNum = pierBodyNum;
    }

    public int getPierBaseNum() {
        return pierBaseNum;
    }

    public void setPierBaseNum(int pierBaseNum) {
        this.pierBaseNum = pierBaseNum;
    }

    public int getAbutBaseNum() {
        return abutBaseNum;
    }

    public void setAbutBaseNum(int abutBaseNum) {
        this.abutBaseNum = abutBaseNum;
    }

    public int getRiverBedNum() {
        return riverBedNum;
    }

    public void setRiverBedNum(int riverBedNum) {
        this.riverBedNum = riverBedNum;
    }

    public int getRegularNum() {
        return regularNum;
    }

    public void setRegularNum(int regularNum) {
        this.regularNum = regularNum;
    }

    public String getSupportType() {
        return supportType;
    }

    public void setSupportType(String supportType) {
        this.supportType = supportType;
    }

    public String getExpansionJointType() {
        return expansionJointType;
    }

    public void setExpansionJointType(String expansionJointType) {
        this.expansionJointType = expansionJointType;
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

    public int getMidSpanWidth() {
        return midSpanWidth;
    }

    public void setMidSpanWidth(int midSpanWidth) {
        this.midSpanWidth = midSpanWidth;
    }

    public int getPierTopWidth() {
        return pierTopWidth;
    }

    public void setPierTopWidth(int pierTopWidth) {
        this.pierTopWidth = pierTopWidth;
    }

    public int getMidSpanHeight() {
        return midSpanHeight;
    }

    public void setMidSpanHeight(int midSpanHeight) {
        this.midSpanHeight = midSpanHeight;
    }

    public int getPierTopHeight() {
        return pierTopHeight;
    }

    public void setPierTopHeight(int pierTopHeight) {
        this.pierTopHeight = pierTopHeight;
    }

    public String getDesignStrength() {
        return designStrength;
    }

    public void setDesignStrength(String designStrength) {
        this.designStrength = designStrength;
    }

    public int getPierWidth() {
        return pierWidth;
    }

    public void setPierWidth(int pierWidth) {
        this.pierWidth = pierWidth;
    }

    public int getPierThickness() {
        return pierThickness;
    }

    public void setPierThickness(int pierThickness) {
        this.pierThickness = pierThickness;
    }

    public int getPierRadius() {
        return pierRadius;
    }

    public void setPierRadius(int pierRadius) {
        this.pierRadius = pierRadius;
    }

    public int getPierStakeNum() {
        return pierStakeNum;
    }

    public void setPierStakeNum(int pierStakeNum) {
        this.pierStakeNum = pierStakeNum;
    }

    public int getPierStakeRadius() {
        return pierStakeRadius;
    }

    public void setPierStakeRadius(int pierStakeRadius) {
        this.pierStakeRadius = pierStakeRadius;
    }

    public int getAbutmentThickness() {
        return abutmentThickness;
    }

    public void setAbutmentThickness(int abutmentThickness) {
        this.abutmentThickness = abutmentThickness;
    }

    public int getAbutmentWidth() {
        return abutmentWidth;
    }

    public void setAbutmentWidth(int abutmentWidth) {
        this.abutmentWidth = abutmentWidth;
    }

    public int getAbutmentRadius() {
        return abutmentRadius;
    }

    public void setAbutmentRadius(int abutmentRadius) {
        this.abutmentRadius = abutmentRadius;
    }

    public int getAbutmentStakeNum() {
        return abutmentStakeNum;
    }

    public void setAbutmentStakeNum(int abutmentStakeNum) {
        this.abutmentStakeNum = abutmentStakeNum;
    }

    public int getAbutmentStakeRadius() {
        return abutmentStakeRadius;
    }

    public void setAbutmentStakeRadius(int abutmentStakeRadius) {
        this.abutmentStakeRadius = abutmentStakeRadius;
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

    public String getPierMaterialType() {
        return pierMaterialType;
    }

    public void setPierMaterialType(String pierMaterialType) {
        this.pierMaterialType = pierMaterialType;
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

    public String getAbutmentType() {
        return abutmentType;
    }

    public void setAbutmentType(String abutmentType) {
        this.abutmentType = abutmentType;
    }

    public String getAbutmentMaterialType() {
        return abutmentMaterialType;
    }

    public void setAbutmentMaterialType(String abutmentMaterialType) {
        this.abutmentMaterialType = abutmentMaterialType;
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
}
