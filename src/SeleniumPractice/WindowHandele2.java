package SeleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandele2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\2023Coding\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		
		String parentWindow=driver.getWindowHandle();
		System.out.println("parent window is "+parentWindow);
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> tabs=driver.getWindowHandles();
		
		System.out.println(tabs);
		
		tabs.remove(parentWindow);
		
		String childWindow=tabs.iterator().next();
		
		System.out.println("this is the child winodw" + childWindow);
		driver.switchTo().window(childWindow);
		
		System.out.print("Switched to new window");
		System.out.print("child WIndow title"+ driver.getTitle());
		
		driver.switchTo().window(parentWindow);		
		System.out.println("Swithced to parent wndow");
		System.out.print("Parent window title "+driver.getTitle());




	}

}
