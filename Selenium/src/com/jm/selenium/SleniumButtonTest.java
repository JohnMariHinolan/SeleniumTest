package com.jm.selenium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleniumButtonTest {

	private static final String URL = "http://localhost:8080/Testing/";
	
	
	
	public static void main(String[] args) throws MalformedURLException {
		
		
		System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\jhinolan\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driverx = new ChromeDriver(); 
	
		driverx.get( URL);
		
		String title = driverx.getTitle();
		
		System.out.println("Title: " + title);
		
		for(int i = 0 ;i<=2005;i++) {
			driverx.findElement(By.id("targetButton")).click();
		}
//	    DesiredCapabilities caps = DesiredCapabilities.chrome();
//	    caps.setCapability("platform", "Windows XP");
//	    caps.setCapability("version", "43.0");
//	 
//	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//	 
//	    /**
//	     * Goes to Sauce Lab's guinea-pig page and prints title
//	     */
//	 
//	    driver.get("https://saucelabs.com/test/guinea-pig");
//	    System.out.println("title of page is: " + driver.getTitle());
//	 
//	    driver.quit();
		
	}
	
	
	
}
