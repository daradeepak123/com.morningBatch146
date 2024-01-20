package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLogics {
	
	public static File file;
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	
	
	public XSSFSheet loadExcel(String path,String sheetname,XSSFWorkbook wb) throws IOException
	{
		file=new File(path);
		fis=new FileInputStream(file);
		 wb=new XSSFWorkbook(fis);
		 sheet=wb.getSheet(sheetname);
		return sheet;
		
	}

}
