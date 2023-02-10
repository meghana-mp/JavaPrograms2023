package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\2023Coding\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Open the Web page

		driver.get("https://the-internet.herokuapp.com/iframe");
		
		
		driver.switchTo().frame(0);
		
		System.out.println("Swuthced to iframe");
		driver.findElement(By.id("tinymce")).sendKeys("This is my text to send");
		driver.switchTo().parentFrame();
		System.out.println("Swuthced to parent iframe");

	}

}
