package com.adactin.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Page {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement fname_Box;
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lname_Box;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement address_Box;
	
	@FindBy(xpath="(//input[@type='text'])[13]")
	private WebElement card_Box;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement card_Type_Drop;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement month_Drop;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement year_Drop;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvv_Box;
	
	@FindBy(xpath="//input[@value='Book Now']")
	private WebElement book_Btn;

	public Book_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFname_Box() {
		return fname_Box;
	}

	public WebElement getLname_Box() {
		return lname_Box;
	}

	public WebElement getAddress_Box() {
		return address_Box;
	}

	public WebElement getCard_Box() {
		return card_Box;
	}

	public WebElement getCard_Type_Drop() {
		return card_Type_Drop;
	}

	public WebElement getMonth_Drop() {
		return month_Drop;
	}

	public WebElement getYear_Drop() {
		return year_Drop;
	}

	public WebElement getCvv_Box() {
		return cvv_Box;
	}

	public WebElement getBook_Btn() {
		return book_Btn;
	}

		
	
	

}
