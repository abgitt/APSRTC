package com.apsrtc.qa.util;

import java.io.FileInputStream;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.apsrtc.qa.apsrtc.main.BaseTest;

public class TestUtil extends BaseTest
{
	public static long IMPLICIT_WAIT = 20;
	public static long PAGE_LOAD_TIME_OUT = 30;
	
	static String TEST_DATA = prop.getProperty("testdata");
	
	static Workbook book;
	static Sheet sheet;
	
	/*public static void getTestData(String sheetname)
	{
		try
		{
			book = WorkbookFactory.create(new FileInputStream(TEST_DATA));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetname);
	//	Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		HashMap<String,String> data = new HashMap<String,String>();
		HashMap<Integer,HashMap<String,String>> tesData = new HashMap<Integer,HashMap<String,String>>();
		boolean flag = false;
		int c=0;
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			for(int k=0;k<sheet.getRow(0).getLastCellNum();k++)
			{
				//System.out.println(sheet.getRow(i+1).getCell(0).toString());
				if(sheet.getRow(i+1).getCell(0).toString().equals("1.0"))
				{
					data.put(sheet.getRow(0).getCell(k).toString(), sheet.getRow(i+1).getCell(k).toString());
					flag = true;
				}
			}
			if(flag)
			{
				tesData.put(i+1, data);
				break;
			}
			c++;
		}
		System.out.println(c);
		System.out.println(tesData);
		
		//return tesData;		
	}*/
	public static Object[][] getTestData(String sheetName)
	{
		try
		{
			book = WorkbookFactory.create(new FileInputStream(TEST_DATA));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		int id = Integer.parseInt(prop.getProperty("id"));
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		boolean flag = false;
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			if(sheet.getRow(i+1).getCell(2).toString() == Integer.toString(id)+".0");
			{
				System.out.println(sheet.getRow(i+1).getCell(0).toString()+"condition");
				/*for(int k=0;k<sheet.getRow(0).getLastCellNum();k++)
				{
					data[i][k] = sheet.getRow(i+1).getCell(k).toString();
					
				}*/
				flag = true;
			}
			if(flag)
				break;
		}
		return data;
	}
	public String getParameterValue(String key)
	{
	
		return null;
	}
}
