package com.training.sanity.tests;




import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;


import com.training.pom.LoginPOM;
import com.training.pom.ReportPOM;




public class SalesReportByOrderTests {

	static WebDriver driver;
	//private String baseUrl;
	private ReportPOM reportOBJ;
	private LoginPOM loginOBJ;
	//private static Properties properties;
	//private ScreenShot screenShot;


	
	@BeforeMethod
	public void setUp() throws Exception {
		reportOBJ = new ReportPOM(CustomerDeletionTests.driver);
		
	}
	
	@Test
	public void SalesReportDisplayByOrderTests() {
	
		reportOBJ.salesReportDisplayBy("order","Week");   //Enter order , tax ,shipping
		
	}
	
	
	
}
