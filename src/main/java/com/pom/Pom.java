package com.pom;

import com.base.Baseclass;

public class Pom extends Baseclass {
	
	
	private Signinpage sp;
	
	public Signinpage getsp() {
		sp = new Signinpage(driver);
		return sp;
	}
	private FromPOM fp;
	
	public FromPOM getfp() {
		fp = new FromPOM(driver);
		return fp;
	}
	

}
