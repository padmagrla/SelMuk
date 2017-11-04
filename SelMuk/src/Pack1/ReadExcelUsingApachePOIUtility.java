package Pack1;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Library.ReadExcelApachePOI;

public class ReadExcelUsingApachePOIUtility {
	public static void main(String []args){
		ReadExcelApachePOI excel=new ReadExcelApachePOI("C:\\Users\\paddu\\Desktop\\testdata.xls");
		System.out.println(excel.getData(1, 0, 1));
		  }
		  
		 }

