package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verifyRadioandCheckDynamic {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		List<WebElement> radios=driver.findElements(By.xpath(".//span[@class='_5k_2 _5dba']/input"));
		int iSize = radios.size();
		 
	
		 
		 for(int i=0; i < iSize ; i++ ){
		 
			 String sValue = radios.get(i).getAttribute("value");
			 WebElement we=radios.get(i);
		 
			 if (sValue.equalsIgnoreCase("male")){
		 
				 radios.get(i).click();
					
					 
			        System.out.println("Male radio button is Selected >>"+we.isSelected());
				 break;
				 }
			 
		
		}
		 System.out.println(driver.getTitle());
		 

	}
}
