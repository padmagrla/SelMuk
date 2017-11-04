package Practice;

import java.io.IOException;

public class ReadXL_Numeric_Using_Utility {

	public static void main(String[] args) throws IOException, Exception {
		ReadXL_Numeric_Utility exN=new ReadXL_Numeric_Utility("C:\\Users\\paddu\\workspace\\SelMuk","C:\\Users\\paddu\\Desktop\\a.xls");
		System.out.println(exN.getDataNumeric(1, 1, 1));
		

	}

}
