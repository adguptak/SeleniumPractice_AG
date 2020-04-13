package com.training.sanity.tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.training.pom.ReportPOM;


public class SalesReportByTaxTests {

	private static WebDriver driver;

	private ReportPOM reportOBJ;

	@BeforeMethod
	public void setUp() throws Exception {
		reportOBJ = new ReportPOM(CustomerDeletionTests.driver);
		}
	
	@Test
	public void SalesReportDisplayByTaxTests() {
			reportOBJ.salesReportDisplayBy("tax","Week");   //Enter order , tax ,shipping
		
	}
}
