import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vighnesh\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String Parentid =it.next();
		String childid=it.next();
		
		driver.switchTo().window(childid);
		driver.get("https://courses.rahulshettyacademy.com/#/index");
		
		String CourseName =driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[1]/div/div[1]/a/div/div[2]")).getText();
		
		driver.switchTo().window(Parentid);
		
		driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[1]/input")).sendKeys(CourseName);
		
		
		
		
		
		
	}

}
