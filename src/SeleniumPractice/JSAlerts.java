package SeleniumPractice;

import java.time.Duration;

import javax.lang.model.element.Element;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JSAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\2023Coding\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		// Open the Web page

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		//First Alert
		driver.findElement(By.xpath("//*[@onclick='jsAlert()']")).click();
		
		
		Alert alert1=driver.switchTo().alert();

		String text1=alert1.getText();
		System.out.println("Alert accepted"+text1);
		alert1.accept();
		
		
		//Second ALert
		
		
		WebElement ele2=driver.findElement(By.xpath("//*[@onclick='jsConfirm()']"));
		
		ele2.click();
		Alert alert2=driver.switchTo().alert();
		String text2=alert2.getText();
		System.out.println("Second alert text "+text2);
		alert2.dismiss();
		
		ele2.click();
		
		alert2.accept();		
		
		//Third Alert
		

		WebElement ele3=driver.findElement(By.xpath("//*[@onclick='jsPrompt()']"));
		
		ele3.click();
		
		driver.switchTo().alert().dismiss();
		
		
		ele3.click();
		
		Alert alert3=driver.switchTo().alert();
		String text3=alert3.getText();
		System.out.println("Alert3 text" + text3);
		alert3.sendKeys("test");
		alert3.accept();
		
		
		//Basi auth
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
		
		
		

	}

}
