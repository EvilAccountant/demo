package com.example.demo.service;

import com.example.demo.dao.BridgeSideDao;
import com.example.demo.dao.BridgeSiteDao;
import com.example.demo.dao.BridgeSiteDetailDao;
import com.example.demo.entity.BridgeSide;
import com.example.demo.entity.BridgeSite;
import com.example.demo.entity.BridgeSiteDetail;
import com.example.demo.entity.RowData;
import com.example.demo.util.StringUtil;
import com.example.demo.util.CommonUtil;
import com.example.demo.util.UnitConverter;
import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.File;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.example.demo.util.ExcelUtils.getCellFloatValue;
import static com.example.demo.util.ExcelUtils.getCellIntValue;
import static com.example.demo.util.ExcelUtils.getCellStringValue;

/**
 * Created with IntelliJ IDEA.
 * Creator: LayWinZeng
 * CreateTime: 2018/8/21
 * Description:
 */

@Service
public class BridgeSideService {

    @Autowired
    private BridgeSideDao bridgeSideDao;

    @Autowired
    private BridgeSiteDao bridgeSiteDao;

    @Autowired
    private BridgeSiteDetailDao bridgeSiteDetailDao;

//    FIELD => 'SIDE_TYPE' => GROUP_ID => GROUP_ID+NAME => ID


    public String doImportData() {
        String msg = "";
        try {
            File file = new File("src/main/resources/files/拆分表格.xlsx");
            Workbook workbook = WorkbookFactory.create(file);
            readExcel(workbook);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return msg;
        }
    }

    @Transactional
    public void readExcel(Workbook workbook){
        Sheet sheet = workbook.getSheetAt(0);
        String groupId = bridgeSideDao.findGroupIdByField("SIDE_TYPE");
        String upSide = bridgeSideDao.findSideTypeByGroupIdAndName(groupId,"上行");
        String downSide = bridgeSideDao.findSideTypeByGroupIdAndName(groupId,"下行");
        int n=0;

        for (int i = 2; i < sheet.getLastRowNum()+1; i++) {
            Row row = sheet.getRow(i);
            if (null!=bridgeSideDao.findBridgeIdByNo(getCellStringValue(row.getCell(1)))) {
                BridgeSiteDetail detail = new BridgeSiteDetail();
                detail.setBridgeId(bridgeSideDao.findBridgeIdByNo(getCellStringValue(row.getCell(1))));
                if ("上行".equals(getCellStringValue(row.getCell(3)))){
                    detail.setSideType(upSide);
                }
                if ("下行".equals(getCellStringValue(row.getCell(3)))){
                    detail.setSideType(downSide);
                }
                detail.setSiteNo(getCellIntValue(row.getCell(7)));
                detail.setSupportType(bridgeSideDao.findTypeIdByName(getCellStringValue(row.getCell(35)).split(",")[0]));
                detail.setSuperStructureType(bridgeSideDao.findTypeIdByName(getCellStringValue(row.getCell(37))));
                detail.setSuperMaterialType(bridgeSideDao.findTypeIdByName(getCellStringValue(row.getCell(38))));
                detail.setSuperForceType(bridgeSideDao.findTypeIdByName(getCellStringValue(row.getCell(39))));
                detail.setSuperConstructType(bridgeSideDao.findTypeIdByName(getCellStringValue(row.getCell(40))));
                detail.setMidSpanWidth(getCellIntValue(row.getCell(41)));
                detail.setPierTopWidth(getCellIntValue(row.getCell(42)));
                detail.setMidSpanHeight(getCellIntValue(row.getCell(43)));
                detail.setPierTopHeight(getCellIntValue(row.getCell(44)));
                detail.setPierWidth(getCellIntValue(row.getCell(46)));
                detail.setPierThickness(getCellIntValue(row.getCell(47)));
                detail.setPierRadius(getCellIntValue(row.getCell(48)));
                detail.setPierStakeNum(getCellIntValue(row.getCell(49)));
                detail.setPierStakeRadius(getCellIntValue(row.getCell(50)));
                detail.setAbutmentWidth(getCellIntValue(row.getCell(51)));
                detail.setAbutmentThickness(getCellIntValue(row.getCell(52)));
                detail.setAbutmentRadius(getCellIntValue(row.getCell(53)));
                detail.setAbutmentStakeNum(getCellIntValue(row.getCell(54)));
                detail.setAbutmentStakeRadius(getCellIntValue(row.getCell(55)));
                detail.setPierForceType(bridgeSideDao.findTypeIdByName(getCellStringValue(row.getCell(58))));
                detail.setPierType(bridgeSideDao.findTypeIdByName(getCellStringValue(row.getCell(59))));
                detail.setAbutmentType(bridgeSideDao.findTypeIdByName(getCellStringValue(row.getCell(60))));
                detail.setPierBaseMaterialType(bridgeSideDao.findTypeIdByName(getCellStringValue(row.getCell(61))));
                detail.setPierBaseType(bridgeSideDao.findTypeIdByName(getCellStringValue(row.getCell(62))));
                detail.setPierBaseConstructType(bridgeSideDao.findTypeIdByName(getCellStringValue(row.getCell(63))));
                detail.setAbutmentBaseMaterialType(bridgeSideDao.findTypeIdByName(getCellStringValue(row.getCell(64))));
                detail.setAbutmentBaseType(bridgeSideDao.findTypeIdByName(getCellStringValue(row.getCell(65))));
                detail.setAbutmentBaseConstructType(bridgeSideDao.findTypeIdByName(getCellStringValue(row.getCell(66))));
                bridgeSiteDetailDao.update(detail);
                n++;
            }
        }
        System.out.println("总共更新数据:"+n);
    }

    public void readData(){
        List<BridgeSide> bridgeSideList = bridgeSideDao.findData(new BridgeSide());

        String bridgeId = "";
        String sideType = "";
        String spanCombo = "";
        List<BridgeSite> bridgeSiteList = new ArrayList<>();
        List<BridgeSiteDetail> bridgeSiteDetailList = new ArrayList<>();
        for (BridgeSide bridgeSide:bridgeSideList) {
            bridgeId = bridgeSide.getBridgeId();
            sideType = bridgeSide.getSideType();
            spanCombo = bridgeSide.getSpanComb();
            bridgeSiteList.addAll(splitBridgeSpanCombination(bridgeId,sideType,spanCombo));

        }
        if (!bridgeSiteList.isEmpty()){
            System.out.println(bridgeSiteList.size());
            bridgeSiteDao.insertList(bridgeSiteList);
        }

        for (BridgeSite site:bridgeSiteList) {
            BridgeSiteDetail detail = new BridgeSiteDetail();
            detail.setBridgeId(site.getBridgeId());
            detail.setSideType(site.getSideType());
            detail.setSiteNo(site.getSiteNo());
            bridgeSiteDetailList.add(detail);
        }
        if (!bridgeSiteDetailList.isEmpty()){
            System.out.println(bridgeSiteDetailList.size());
            bridgeSiteDetailDao.insertList(bridgeSiteDetailList);
        }

    }


    /**
     * 获取单元格的值
     * @param cell
     * @return
     */
    public String getCellValue(Cell cell){

        if(cell == null) return "";
        if(cell.getCellType() == Cell.CELL_TYPE_STRING){
            return cell.getStringCellValue();
        }else if(cell.getCellType() == Cell.CELL_TYPE_BOOLEAN){
            return String.valueOf(cell.getBooleanCellValue());
        }else if(cell.getCellType() == Cell.CELL_TYPE_FORMULA){
            return cell.getCellFormula() ;
        }else if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC){
            return String.valueOf(cell.getNumericCellValue());
        }
        return "";
    }

    public void doAdd(){
        BridgeSide bridgeSide = new BridgeSide();
        bridgeSide.setBridgeId("9527");
        bridgeSide.setSideType("X");
        bridgeSide.setBridgeLength(998);
        bridgeSide.setMaxSpan(9.2f);
        bridgeSide.setSpanComb("kongfu");
        bridgeSide.setUpClearHeight(233);
        bridgeSide.setSideTypeName("typeName");
        bridgeSide.setSuperStructureTypeName("SuperMan");
        bridgeSideDao.insert(bridgeSide);
    }

    public List<BridgeSide> getData(BridgeSide bridgeSide){
        return bridgeSideDao.findData(bridgeSide);
    }

    /** 将分联的跨径组合拆解成孔跨对象集合 */
    private List<BridgeSite> splitBridgeSpanCombination(String bridgeId, String sideTypeId, String bridgeSpanCombination) {
        List<BridgeSite> bridgeSiteList = new ArrayList<>();
        bridgeSpanCombination = bridgeSpanCombination.replace("(","");
        bridgeSpanCombination = bridgeSpanCombination.replace(")","");
        if (StringUtil.isEmpty(bridgeSpanCombination)) return bridgeSiteList;
        //区别分不分联的情况
        if (bridgeSpanCombination.contains("(")) {
            Matcher matcher = Pattern.compile("((\\d+)\\*)?\\((.*?)\\)").matcher(bridgeSpanCombination);
            int jointNo = 0;
            BridgeSite paramSite = new BridgeSite();
            paramSite.setId(CommonUtil.getUUID());
            paramSite.setBridgeId(bridgeId);
            paramSite.setSideType(sideTypeId);
            paramSite.setSiteNo(0);
            while (matcher.find()) {
                //遍历各联的情况
                if (StringUtil.isEmpty(matcher.group(2))) {
                    jointNo++;
                    paramSite.setJointNo(jointNo);
                    splitNoJointSpanCombinationToCollection(bridgeSiteList, paramSite, matcher.group(3));
                } else {
                    for (int i=0; i<StringUtil.toInt(matcher.group(2)); i++) {
                        jointNo++;
                        paramSite.setJointNo(jointNo);
                        splitNoJointSpanCombinationToCollection(bridgeSiteList, paramSite, matcher.group(3));
                    }
                }
            }
        } else {
            BridgeSite site=new BridgeSite();
            site.setBridgeId(bridgeId);
            site.setSideType(sideTypeId);
            site.setSiteNo(0);
            site.setJointNo(0);
            splitNoJointSpanCombinationToCollection(bridgeSiteList,site,bridgeSpanCombination);
        }
        return bridgeSiteList;
    }

    /** 加不分联的跨径组合解析至集合 */
    private void splitNoJointSpanCombinationToCollection(Collection<BridgeSite> targetList, BridgeSite bridgeSite, String bridgeSpanCombination) {
        //遍历集合
        for (String comb : bridgeSpanCombination.split("\\+")) {
            //这一步开始遍历各孔
            String[] combs = comb.split("\\*");
            if (combs.length > 1) {
                for (int i = 0; i < StringUtil.toInt(combs[0]); i++) {
                    bridgeSite.setSiteNo(bridgeSite.getSiteNo()+1);
                    BridgeSite site=new BridgeSite();
                    site.setId(CommonUtil.getUUID());
                    site.setBridgeId(bridgeSite.getBridgeId());
                    site.setSideType(bridgeSite.getSideType());
                    site.setJointNo(bridgeSite.getJointNo());
                    site.setSiteNo(bridgeSite.getSiteNo());
                    site.setSpan(UnitConverter.metreToMillimetre(StringUtil.toFloat(combs[1])));
                    targetList.add(site);
                }
            } else {
                bridgeSite.setSiteNo(bridgeSite.getSiteNo()+1);
                BridgeSite site=new BridgeSite();
                site.setId(CommonUtil.getUUID());
                site.setBridgeId(bridgeSite.getBridgeId());
                site.setSideType(bridgeSite.getSideType());
                site.setJointNo(bridgeSite.getJointNo());
                site.setSiteNo(bridgeSite.getSiteNo());
                site.setSpan(UnitConverter.metreToMillimetre(StringUtil.toFloat(combs[0])));
                targetList.add(site);
            }
        }
    }


}
