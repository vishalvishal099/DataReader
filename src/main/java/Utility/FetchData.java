package Utility;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import static java.util.Arrays.copyOf;

public class FetchData {
    static String machingData = null;

    public static void main(String[] args) throws IOException {
        Iterator<Object[]> itr = ExcelFileReader.getExcelData();
        findAllData("BE");
        findAllData("MTECh");
        findAllData("Resma");
        findAllData("P_Frist name3");

    }

    public static void findAllData(String input) throws IOException {

        ArrayList<String> arrayList = new ArrayList<String>();
        Iterator<Object[]> itr = ExcelFileReader.getExcelData();
        ArrayList<Object[]> arrOne = ExcelFileReader.excelData();

        while (itr.hasNext()) {
            Object[] arraydata = itr.next();
            String[] stringArray = copyOf(arraydata, arraydata.length, String[].class);
            for (int i = 0; i < stringArray.length; i++) {
                if (stringArray[i].equalsIgnoreCase(input)) {
                    machingData = stringArray[0];
                    break;
                }
            }
        }
        arrayList.add(0, machingData);
        for (int i = 0; i < arrOne.size(); i++) {
            Object[] arraydata = arrOne.get(i);
            String[] stringArray = copyOf(arraydata, arraydata.length, String[].class);
            if (stringArray[0].equals(machingData)) {
                for (int j = 1; j < stringArray.length; j++) {
                    arrayList.add(stringArray[j]);

                }
            }

        }
        System.out.println(arrayList);
    }

}
