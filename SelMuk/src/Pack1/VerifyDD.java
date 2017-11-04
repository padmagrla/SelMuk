package Pack1;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDD {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement month_dropdown=driver.findElement(By.id("month"));

		Select month=new Select(month_dropdown);
		month.selectByVisibleText("May");
		
		
		
		WebElement day_dropdown=driver.findElement(By.id("day"));

		Select day=new Select(day_dropdown);
		
		List<WebElement> dropdown=day.getOptions();

		for(int i=0;i<dropdown.size();i++){

		String drop_down_values=dropdown.get(i).getText();

		System.out.println("dropdown values are "+drop_down_values);
		if(drop_down_values.contentEquals("20")){
			day_dropdown.click();
		}
		}
		
		/*
		WebElement year_dropdown=driver.findElement(By.id("year"));

		Select year=new Select(year_dropdown);
		
		List<WebElement> dropdowny=day.getOptions();

		for(int j=0;j<dropdowny.size();j++){

		String drop_down_valuesy=dropdowny.get(j).getText();

		System.out.println("dropdown values are "+drop_down_valuesy);

		}*/
	
		driver.close();
		
		/*driver.get("http://staff.washington.edu/tft/tests/menus/interesting/example1.html");
		
		WebElement about_dropdown=driver.findElement(By.xpath(".//a[contains(.,'About')]"));
		//about_dropdown.click();

		Select about=new Select(about_dropdown);
		about.selectByVisibleText("News");*/
		

	}

	}
