import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vighnesh\\Desktop\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 
		 driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		 System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		 
		 driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		 System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		 
		 //number of checkboxes
		 
		 System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
	}

}
