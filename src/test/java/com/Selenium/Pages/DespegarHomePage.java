package com.Selenium.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DespegarHomePage extends BasePage {
	
	@FindBy(css="a[title = 'Alojamientos']")
	WebElement alojamientos;
	
	private WebDriver driver = null;
	
	public DespegarHomePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean alojamientosEsVisible() {
		return this.alojamientos.isDisplayed();
	}
	
	public DespegarAlojamientosPage clickAlojamientos() {
		alojamientos.click();
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.urlMatches("https://www.despegar.com.ar/hoteles/"));
		return new DespegarAlojamientosPage(this.driver);
	}

}
