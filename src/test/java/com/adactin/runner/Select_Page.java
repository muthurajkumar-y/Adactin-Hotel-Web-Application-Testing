package com.adactin.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Page {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@type='radio']")
	private WebElement hotel_Select_Radio;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continue_Btn;

	public Select_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements( driver2,this );
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getHotel_Select_Radio() {
		return hotel_Select_Radio;
	}

	public void setHotel_Select_Radio(WebElement hotel_Select_Radio) {
		this.hotel_Select_Radio = hotel_Select_Radio;
	}

	public WebElement getContinue_Btn() {
		return continue_Btn;
	}

	public void setContinue_Btn(WebElement continue_Btn) {
		this.continue_Btn = continue_Btn;
	}

	
	
	
	

}
