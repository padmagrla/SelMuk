package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verifyRadioandCheck {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement male_radio=driver.findElement(By.xpath(".//*[@id='u_0_7']"));
		Boolean Dstatus=male_radio.isDisplayed();
		System.out.println(Dstatus);
		
		Boolean Estatus=male_radio.isEnabled();
		System.out.println(Estatus);
		
		Boolean Sstatus=male_radio.isSelected();
		System.out.println(Sstatus);
		male_radio.click();
		boolean selected_status_new=male_radio.isSelected();
		 
        System.out.println("Male radio button is Selected >>"+selected_status_new);
        driver.close();

		

	}

}
