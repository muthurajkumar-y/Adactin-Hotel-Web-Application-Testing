package com.adactin.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Base {
	public static WebDriver driver;

	public static WebDriver launch_Browser(String name) {
		if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sasi\\eclipse-workspace\\Cucumber\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (name.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\sasi\\eclipse-workspace\\Cucumber\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		return driver;

	}

	public static void wait(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void select_Index(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public static void select_Value(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public static void select_Visible(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void url(String url) {
		driver.get(url);
	}

	public static void sendkeys(WebElement element, String keys) {
		element.sendKeys(keys);
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void ss(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sou = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path);
		FileUtils.copyFile(sou, des);
	}

	public static void alert_Accept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public static void mouse_Move(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();

	}

}
