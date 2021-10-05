package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hello {

	public static void main(String[] args) {
//		ChromeOptions chromeOptions = new ChromeOptions();
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver(chromeOptions);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gattu\\Downloads\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		//find the locator
		String userId="email";
		//create a webelement
		WebElement userName=driver.findElement(By.id(userId));
		//perform action
		userName.sendKeys("7204016588");


      String passId="pass";

		WebElement password=driver.findElement(By.id(passId));

		password.sendKeys("9963286457");

         String loginId="//*[@type=\"submit\"]";

		WebElement loginButton=driver.findElement(By.xpath(loginId));

		loginButton.click();

		}
};