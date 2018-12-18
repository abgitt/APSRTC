package com.apsrtc.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apsrtc.qa.apsrtc.main.BaseTest;

public class SearchForBus extends BaseTest 
{
	//Object Repo
	@FindBy(id="fromPlaceName")
	WebElement from;
	
	@FindBy(id="toPlaceName")
	WebElement to;
	
	@FindBy(id="txtJourneyDate")
	WebElement fromdate;
	
	@FindBy(id="txtReturnJourneyDate")
	WebElement returndate;
	
	@FindBy(id="searchBtn")
	WebElement search;
	
	public SearchForBus()
	{
		PageFactory.initElements(dr, this);
	}
	
	public void SearchBuses(String source,String destination,String onBoardDate,String onWardDate)
	{
		//from.sendKeys(source);
		//to.sendKeys(destination);
		fromdate.click();
		
		String month = dr.findElement(By.cssSelector("div#ui-datepicker-div div.ui-corner-left")).getText();
			
	}
}
