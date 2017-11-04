package Practice;

public class ReadXL_Apache_Using_Utility {
	public static void main(String []args){
		
		ReadXL_Apache_Utility ex=new ReadXL_Apache_Utility("C:\\Users\\paddu\\Desktop\\a.xls");
		System.out.println(ex.getData(0, 0, 1));
		
		
	}

}
