package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class UntrustedCertificateFF
{public static void main(String[] args) {
	 
	// Create object of DesiredCapabilities class

	DesiredCapabilities cap=DesiredCapabilities.internetExplorer();

	// Set ACCEPT_SSL_CERTS  variable to true
	cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

	// Set the driver path
	System.setProperty("webdriver.ie.driver", "C:\\Users\\paddu\\OneDrive\\IEDriverServer.exe");

	// Open browser with capability
	WebDriver driver=new InternetExplorerDriver(cap);
	driver.get("https://www.cacert.org/");
	
	 
	 
	}
	 
	}