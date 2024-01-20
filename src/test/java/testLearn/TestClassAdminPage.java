package testLearn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassAdminPage extends TestNgBasics{
	
	
	@BeforeMethod
	public void beforeDashBoard()
	{
		driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
	}
	
	@AfterMethod
	public void afterDashBoard()
	{
		
	}
	
	
	@Test
	public void tstLearn()
	{
		String header=driver.findElement(By.xpath("//h6")).getText();
		
		if(header.equals("Dashboard"))
		{
			System.out.println("Login successful");
		}
		else
		{
			System.out.println("Check your script");
		}
		
		
		driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
		
		
		List<WebElement> texts=driver.findElements(By.xpath("//p[text()='Assign Leave']/../../..//p"));
		
		
		for(WebElement ele:texts)
		{
			System.out.println(ele.getText());
		}
		
	}
	
	

}
