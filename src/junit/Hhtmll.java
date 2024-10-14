package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hhtmll {

	
	
	ChromeDriver driver;
	
	@Before
	public void setup()
	
	{
		driver=new ChromeDriver();
		driver.get("file:///E:/Rugma/selenium%20notes/alertprogram.html");
		
	}
	
	@Test
	public void test() {
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		
		
		
		
	}
	
	
	
	
}
