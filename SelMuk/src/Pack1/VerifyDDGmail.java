package Pack1;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDDGmail {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp?hl=en-GB");
		driver.manage().window().maximize();
		
		WebElement month_dropdown=driver.findElement(By.id("BirthMonth"));

		Select month=new Select(month_dropdown);
		month.selectByVisibleText("July");
		
		
		
		/*WebElement day_dropdown=driver.findElement(By.id("day"));

		Select day=new Select(day_dropdown);
		
		List<WebElement> dropdown=day.getOptions();

		for(int i=0;i<dropdown.size();i++){

		String drop_down_values=dropdown.get(i).getText();

		System.out.println("dropdown values are "+drop_down_values);*/
		
		
		

		}
	
		

	}

	
