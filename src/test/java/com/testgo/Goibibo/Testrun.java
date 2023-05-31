package com.testgo.Goibibo;

import java.awt.AWTException;
import java.awt.Robot;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.Baseclass;
import com.pom.Pom;

public class Testrun extends Baseclass {
	Pom p = new Pom();
	
	
	@Test
	 public void browser() {
		browserlaunch("chrome");
		geturl("https://www.goibibo.com/");
		
	}
	
	@Test
	public void gopi() throws AWTException  {
		clickonelement(p.getfp().getLoginSkip());
		clickonelement(p.getfp().getAdskip());
		clickonelement(p.getfp().getFromCity());
		input(p.getfp().getFromCityInput(), "chennai");
		pointtoelement(p.getfp().getChennai());
		keyboard();
	}
	
	
	@Test
	public void date() {
		clickonelement(p.getsp().getDeparture());
		clickonelement(p.getsp().getDate());
		clickonelement(p.getsp().getDone());
		String text = p.getsp().getSunday().getText();
		String actual ="Sunday";
		Assert.assertEquals(actual, text);
		clickonelement(p.getsp().getCancel());
		
	
		
		
	}
}
