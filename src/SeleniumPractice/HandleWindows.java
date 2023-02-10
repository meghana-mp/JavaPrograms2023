package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\2023Coding\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		
		driver.findElement(By.linkText("Click Here")).click();
		
		String currentWindow=driver.getWindowHandle();
		
		
		Set<String> tabs=driver.getWindowHandles();
		
		System.out.println(tabs);
		
		Iterator<String> itr=tabs.iterator();
		
		while(itr.hasNext()) {
			String childWindow=itr.next();
			if(!childWindow.equalsIgnoreCase(currentWindow)) {
				driver.switchTo().window(childWindow);
				System.out.println(childWindow);
			}
		}

	}

}
