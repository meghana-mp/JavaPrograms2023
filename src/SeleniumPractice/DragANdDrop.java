package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragANdDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\2023Coding\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Open the Web page

		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		Thread.sleep(110);
		WebElement frameelement=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameelement);
		System.out.println("Swicthed to frmae");
		
		Actions action=new Actions(driver);

		WebElement drag=driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("//*[@id='droppable']"));

		
		
		
		action.dragAndDrop(drag, drop).build().perform();
		
		
		driver.close();
		
	}

}
