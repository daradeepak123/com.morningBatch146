package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenricMethods {
	
	
	public void sendData(WebDriver driver,String xpath, String data)
	{
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		boolean b=driver.findElement(By.xpath(xpath)).isDisplayed();
		b=driver.findElement(By.xpath(xpath)).isEnabled();
		if(b)
		{
		driver.findElement(By.xpath(xpath)).clear();
		driver.findElement(By.xpath(xpath)).sendKeys(data);
		}
	}
	
	public void clickElement(WebDriver driver,String xpath)
	{
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		boolean b=driver.findElement(By.xpath(xpath)).isDisplayed();
		b=driver.findElement(By.xpath(xpath)).isEnabled();
		if(b)
		{
		driver.findElement(By.xpath(xpath)).click();
		}
		
	}
	
	
	

}
