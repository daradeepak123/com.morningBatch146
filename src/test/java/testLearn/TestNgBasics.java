package testLearn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.ExcelLogics;
import utils.GenricMethods;

public class TestNgBasics extends GenricMethods{
	public static WebDriver driver ;
	public static File file;
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static ExcelLogics exl=new ExcelLogics();
	String path="C:/demo/employee.xlsx";
	String browser=null;
	public static GenricMethods gm=new GenricMethods();
	@BeforeTest
	public void btest() throws IOException
	{
		 
		 sheet=exl.loadExcel(path,"Sheet2",wb);
		 System.out.println();
	}
	
	@BeforeSuite
	public void bSuite()
	{
		browser=sheet.getRow(4).getCell(4).toString();
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver =new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver =new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver =new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	
	@BeforeClass
	public void bClass()
	{
		driver.get(sheet.getRow(3).getCell(0).toString());
		gm.sendData(driver, "//input[@name='username']",sheet.getRow(0).getCell(0).toString() );
		gm.sendData(driver, "//input[@name='password']",sheet.getRow(0).getCell(1).toString() );
		gm.clickElement(driver,"//button");
		
		
	}
	
	
	@AfterClass
	public void aClass()
	{
		System.out.println("This is after class ");
	}
	
	@AfterTest
	public void aTest()
	{
		driver.quit();
	}
	@AfterSuite
	public void aSUite() throws IOException
	{
		wb.close();
	}
	
	public void hello()
	{
		System.out.println("syso");
		System.out.println("new addition");
	}
	
	

}
