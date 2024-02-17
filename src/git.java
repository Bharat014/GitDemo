import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class git {

	public static void main(String[] args) {
		System.setProperty( "webDriver.chrome.driver","F:\\FORMS\\chromedriver_win32");
		
	
		//Invoking browser
//		Chrome - ChromeDriver -> Methods
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.freejobalert.com/");
		driver.get("https://rahulshettyacademy.com/");
		driver.get("https://courses.rahulshettyacademy.com/courses");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
		
		
		
		
		
		

	}

}
