package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*File src = new File("C:\\Selenium\\TestData.xlsx");
        FileInputStream fis = new FileInputStream(src); 
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        //wb.getSheetAt(0);
        XSSFSheet Sheet1 = wb.getSheetAt(0);
        String data1 = Sheet1.getRow(0).getCell(0).getStringCellValue();
        System.out.println("Data from excel is :" +data1);*/

		Integer arr[] ={3,1,2,-1,-2,-3};
		//for(int i = 0;i<=arr.length-1;i++) {

		/*System.out.println("Array before sorting:" +Arrays.toString(arr));
		Arrays.parallelSort(arr);
		System.out.println("Array after sorting:" +Arrays.toString(arr));*/
		/*System.out.println("Array before sorting:" +Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Array after sorting:" +Arrays.toString(arr));*/
		//descending order
		System.out.println("Array before sorting:" +Arrays.toString(arr));
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("Array after sorting:" +Arrays.toString(arr));
		


	}

}


