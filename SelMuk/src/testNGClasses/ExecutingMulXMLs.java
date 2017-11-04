package testNGClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.TestNG;

public class ExecutingMulXMLs {
	public static void main(String[] args) {
		 
		// Create object of TestNG Class
		TestNG runner=new TestNG();
		 
		// Create a list of String 
		List<String> suitefiles=new ArrayList<String>();
		 
		// Add xml files which you have to execute
		suitefiles.add("C:\\Users\\paddu\\workspace\\SelMuk\\CrossBrowser.xml");
		suitefiles.add("C:\\Users\\paddu\\workspace\\SelMuk\\Grouping.xml");
		  
		 
		// now set xml file for execution
		runner.setTestSuites(suitefiles);
		 
		// finally execute the runner using run method
		runner.run();
		}

}
