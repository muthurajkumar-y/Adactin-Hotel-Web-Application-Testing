package com.adactin.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Page {
	
	public Search_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getLocation_Drop() {
		return location_Drop;
	}
	public WebElement getHotels_Drop() {
		return hotels_Drop;
	}
	public WebElement getRoomtype_Drop() {
		return roomtype_Drop;
	}
	public WebElement getNum_Of_Rooms_Drop() {
		return num_Of_Rooms_Drop;
	}
	public WebElement getCheckin_Date_Box() {
		return checkin_Date_Box;
	}
	public WebElement getCheckout_Date_Box() {
		return checkout_Date_Box;
	}

	public WebElement getNum_Of_Adult_Drop() {
		return num_Of_Adult_Drop;
	}

	public WebElement getNum_Of_Child_Drop() {
		return num_Of_Child_Drop;
	}
	public WebElement getSearch_Btn() {
		return search_Btn;
	}

	public WebDriver driver;
	@FindBy(xpath="//select[@name='location']")
	private WebElement location_Drop;
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotels_Drop;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomtype_Drop;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement num_Of_Rooms_Drop;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement checkin_Date_Box;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement checkout_Date_Box;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement num_Of_Adult_Drop;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement num_Of_Child_Drop;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement search_Btn;
	
	

}
