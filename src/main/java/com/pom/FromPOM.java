package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class FromPOM extends Baseclass{
	
	
	public FromPOM(WebDriver driver1) {
		driver1 = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='logSprite icClose']")
	private WebElement loginSkip;
	
	@FindBy(xpath="//p[@class='sc-jlwm9r-1 dRQhOp']")
	private WebElement adskip;

	
	

	@FindBy(xpath = "//span[text()='From']")
	private WebElement fromCity;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement fromCityInput;
	
	@FindBy(xpath = "//p[text()='Chennai International Airport']")
	private WebElement Chennai;
	
	public WebElement getLoginSkip() {
		return loginSkip;
	}
	public WebElement getFromCity() {
		return fromCity;
	}
	public WebElement getFromCityInput() {
		return fromCityInput;
	}
	public WebElement getChennai() {
		return Chennai;
	}
	public WebElement getAdskip() {
		return adskip;
	}

	

}
