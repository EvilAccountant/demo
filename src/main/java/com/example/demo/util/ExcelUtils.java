package com.example.demo.util;

import org.apache.poi.ss.usermodel.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by ZZZ on 2017-06-23.
 */
public final class ExcelUtils {

    private final static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    /** 封闭构造函数 */
    private ExcelUtils() {}

    /**
     * 写入某列数据
     * @param sheet    表单
     * @param col      列号，0-base
     * @param content  写入的内容
     */
    public static void writeColumn(Sheet sheet, int col, List<String> content) {
        for (int i=1; i<=content.size(); i++) {
            Row row = sheet.getRow(i) == null?sheet.createRow(i):sheet.getRow(i);
            Cell cell = row.getCell(col) == null?row.createCell(col):row.getCell(col);
            cell.setCellType(CellType.STRING);
            cell.setCellValue(content.get(i-1));
        }
    }

    public static void writeCell(Row row, int col, Object content, CellStyle cellStyle) {
        Cell cell = row.getCell(col) == null ? row.createCell(col) : row.getCell(col);
        cell.setCellStyle(cellStyle);
        cell.setCellValue(content == null ? "" : String.valueOf(content));
    }

    /** 获取单元格的字符串值 */
    public static String getCellStringValue(Cell cell) {
        //空指针检查
        if (cell == null) return "";
        //判断单元格数值类型
        switch (cell.getCellTypeEnum()) {
            case STRING:
                return cell.getRichStringCellValue().toString().trim();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return String.format("%ty%<tM%<td", cell.getDateCellValue()).trim();
                } else {
                    return String.valueOf(cell.getNumericCellValue()).trim();
                }
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue()).trim();
            case FORMULA:
                return cell.getCellFormula();
            case BLANK:
                return "";
            default:
                return cell.getRichStringCellValue().toString();
        }
    }

    public static Integer getCellIntValue(Cell cell) {
        if (!"".equals(getCellStringValue(cell))) {
            return (int) Float.parseFloat(getCellStringValue(cell));
        }else{
            return null;
        }
    }

    public static Float getCellFloatValue(Cell cell) {
        if (!"".equals(getCellStringValue(cell))) {
            return Float.parseFloat(getCellStringValue(cell));
        }else{
            return null;
        }
    }

    /**
     * 获取日期格式的数据
     * @param cell 解析的单元格
     * @return     返回Date，如果不是日期单元格，则返回null
     */
    public static Date getCellDateValue(Cell cell) {
        //空指针检查
        try {
            if (cell == null) return null;
            if (cell.getCellTypeEnum() == CellType.STRING) {
                return DATE_FORMAT.parse(cell.getStringCellValue());
            } else if (DateUtil.isCellDateFormatted(cell)) {
                return cell.getDateCellValue();
            }
        }catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取单元格标准化格式
     * @param wb  工作簿
     * @return    单元格格式
     */
    public static CellStyle getStandardCellStyle(Workbook wb) {
        CellStyle cellStyle = wb.createCellStyle();
        //对齐
        cellStyle.setAlignment(HorizontalAlignment.LEFT);
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        //边框
        cellStyle.setBorderBottom(BorderStyle.THIN);
        cellStyle.setBorderLeft(BorderStyle.THIN);
        cellStyle.setBorderRight(BorderStyle.THIN);
        cellStyle.setBorderTop(BorderStyle.THIN);
        return cellStyle;
    }
}
