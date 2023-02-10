package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\2023Coding\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Open the Web page

		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		driver.switchTo().frame("frame-top");
		
		
		System.out.println("Siwthced to top frame");
		
		driver.switchTo().frame("frame-left");
		System.out.println("Siwthced to left frame");

		//driver.switchTo().frame("frame-middle");
		//System.out.println("Siwthced to Middle frame");
		
		driver.switchTo().parentFrame();
		System.out.println("Siwthced to parent frame");
		
		driver.switchTo().frame("frame-middle");
		System.out.println("Siwthced to Middle frame");

		driver.close();

	}

}
