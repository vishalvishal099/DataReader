package Utility;

import com.sun.tools.javac.util.ArrayUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import static java.util.Arrays.*;

public class ExcelFileReader {

    public static Iterator<Object[]> getExcelData() throws IOException {
        ArrayList<Object[]> al = excelData();
        return al.iterator();
    }

    public static ArrayList<Object[]> excelData() throws IOException {
        String path = "src/main/resources/Emp.xlsx";
        Map<String, ArrayList<Object[]>> empDetails = new HashMap<String, ArrayList<Object[]>>();
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        int numberOfSheet = workbook.getNumberOfSheets();
        ArrayList<Object[]> al = new ArrayList();
        for (int k = 0; k < numberOfSheet; k++) {
            XSSFSheet sheet = workbook.getSheetAt(k);
            String id = null;
            String FristName = null;
            String lastName = null;
            String company = null;
            String age = null;

            String numberOfMemberInFamily = null;
            String fatherName = null;
            String mothername = null;
            String wifeName = null;

            String graduation = null;
            String postGraduation = null;

            DataFormatter formatter = new DataFormatter();
            for (int j = 1; j <= sheet.getLastRowNum(); j++) {
                XSSFRow row = sheet.getRow(j);
                for (int i = 1; i <= row.getLastCellNum(); i++) {
                    if (sheet.getSheetName().equalsIgnoreCase("Personal")) {
                        id = formatter.formatCellValue(row.getCell(0));
                        FristName = row.getCell(1).getStringCellValue();
                        lastName = formatter.formatCellValue(row.getCell(2));
                        company = formatter.formatCellValue(row.getCell(3));
                        age = formatter.formatCellValue(row.getCell(4));

                    }
                }
                if (sheet.getSheetName().equalsIgnoreCase("Personal")) {
                    al.add(new Object[]{id, FristName, lastName, company, age});
                }
            }
            for (int j1 = 1; j1 <= sheet.getLastRowNum(); j1++) {
                XSSFRow row1 = sheet.getRow(j1);
                for (int i1 = 1; i1 <= row1.getLastCellNum(); i1++) {
                    if (sheet.getSheetName().equalsIgnoreCase("Professional")) {
                        id = formatter.formatCellValue(row1.getCell(0));
                        numberOfMemberInFamily = formatter.formatCellValue(row1.getCell(1));
                        fatherName = formatter.formatCellValue(row1.getCell(2));
                        mothername = formatter.formatCellValue(row1.getCell(3));
                        wifeName = formatter.formatCellValue(row1.getCell(4));
                    }
                }
                if (sheet.getSheetName().equalsIgnoreCase("Professional")) {
                    al.add(new Object[]{id, numberOfMemberInFamily, fatherName, mothername, wifeName});
                }
            }
            for (int j2 = 1; j2 <= sheet.getLastRowNum(); j2++) {
                XSSFRow row2 = sheet.getRow(j2);
                for (int i2 = 1; i2 <= row2.getLastCellNum(); i2++) {
                    if (sheet.getSheetName().equalsIgnoreCase("Experience")) {
                        id = formatter.formatCellValue(row2.getCell(0));
                        graduation = formatter.formatCellValue(row2.getCell(1));
                        postGraduation = formatter.formatCellValue(row2.getCell(2));
                    }
                }
                if (sheet.getSheetName().equalsIgnoreCase("Experience")) {
                    al.add(new Object[]{id, graduation, postGraduation});
                }
            }
        }
        return al;
    }
}

