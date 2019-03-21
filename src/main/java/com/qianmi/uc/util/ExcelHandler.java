package com.qianmi.uc.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Excel的生成与解析器
 *
 * @author 叶延平[OF1643]
 * @create 2018-08-28 14:17
 **/
@Component
@Slf4j
public class ExcelHandler {

    public List parseExcel(String localUrl, String remoteUrl) {
        List<String> list = new ArrayList<>();
        try
        {

            Workbook wb;
            if(StringUtils.isNotEmpty(localUrl)){
                //本地文件
                File excel = new File(localUrl);
                wb=new XSSFWorkbook(excel);
            }else{
                //远程文件调用
                URL url=new URL(remoteUrl);
                InputStream in=url.openStream();
                byte[] bytes = StreamUtils.copyToByteArray(in);
                ByteArrayInputStream bio = new ByteArrayInputStream(bytes);
                wb=new XSSFWorkbook(bio);
            }

            //开始解析
            Sheet sheet = wb.getSheetAt(0);     //读取sheet 0

            int firstRowIndex = sheet.getFirstRowNum();
            int lastRowIndex = sheet.getLastRowNum();

            for (int rIndex = firstRowIndex; rIndex <= lastRowIndex; rIndex++) {   //遍历行
                Row row = sheet.getRow(rIndex);
                if (row != null) {
                    int firstCellIndex = row.getFirstCellNum();
                    int lastCellIndex = row.getLastCellNum();
                    for (int cIndex = firstCellIndex; cIndex < lastCellIndex; cIndex++) {   //遍历列
                        Cell cell = row.getCell(cIndex);
                        cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                        String phone = cell.toString();
                        if (list.contains(phone)) {
                            list.remove(phone);
                        } else {
                            list.add(phone);
                        }
                    }
                }
            }

        }catch (Exception e){
           log.error("系统异常，e={}",e.getMessage());
        }

        return list;
    }


    /**
     * 生成excel
     *
     * @param list
     * @param outUrl
     */
    public void createExcel(List<String> list, String outUrl) {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet1 = workbook.createSheet();
        for (int i = 0; i < list.size(); i++) {
            XSSFRow row = sheet1.createRow(i);
            XSSFCell cell = row.createCell(0);
            cell.setCellValue(list.get(i));

        }
        try (FileOutputStream out = new FileOutputStream(outUrl)) {
            workbook.write(out);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        ExcelHandler handler=new ExcelHandler();
//        List a=new ArrayList<>();
//        a.add("123");
//        a.add("456");
//        handler.createExcel(a,"E://phones0320.xlsx");

        System.out.println(handler.parseExcel("E://1111.xlsx",""));
    }

}

