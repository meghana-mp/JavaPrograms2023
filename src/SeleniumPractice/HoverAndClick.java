package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverAndClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\2023Coding\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Open the Web page

		driver.get("https://www.ebay.com/");
		
		
		WebElement ele=driver.findElement(By.linkText("Electronics"));
		Actions action= new Actions(driver);
		
		action.moveToElement(ele).build().perform();

	}

}
