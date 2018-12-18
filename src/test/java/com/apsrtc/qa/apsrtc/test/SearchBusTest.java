package com.apsrtc.qa.apsrtc.test;

import java.util.HashMap;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.apsrtc.qa.Pages.SearchForBus;
import com.apsrtc.qa.apsrtc.main.BaseTest;
import com.apsrtc.qa.util.TestUtil;

public class SearchBusTest extends BaseTest
{
	SearchForBus search;
	public SearchBusTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp()
	{
		initialization();
		search = new SearchForBus();
	}
	@DataProvider
	public Object[][] getCRMtestData()
	{
		return TestUtil.getTestData("JourneyDetails");
	}
	@Test(groups="smoke",dataProvider="getCRMtestData")
	public void searchBustest(String SNO,String sourceStn,String destinationStn, String onboardDate)
	{
		System.out.println(SNO);
		/*HashMap<String,String> testdata = getORtestData();
		search.SearchBuses("Hyderabad", "Nellore", "11/10/15", "11/12/15");*/
	}
	@AfterMethod
	public void tearDown()
	{
		dr.close();
		dr.quit();
	}
}
