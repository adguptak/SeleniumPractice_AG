package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.training.generics.GenericMethods;
import com.training.generics.ScreenShot;
import com.training.pom.CustomerPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class CustomerDeletionTests {

	static WebDriver driver;
	private String baseUrl;
	private CustomerPOM customerOBJ;
	private LoginPOM loginOBJ;
	private static Properties properties;
	private ScreenShot screenShot;
	

	@BeforeSuite
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream fis = new FileInputStream("./resources/others.properties");
		properties.load(fis);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
	}

	@BeforeClass
	public void setUp() throws Exception {
		
		customerOBJ = new CustomerPOM(driver); 
		loginOBJ = new LoginPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		//screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		loginOBJ.login("admin", "admin@123");
	}
	
	
		
	@Test
	public void CustomerDeletionfromUniformTest() {
		
		customerOBJ.customerDeletion("Neha");
	}
	
	@AfterSuite
	public void tearDown() throws Exception {
		loginOBJ.logoutAdminUniform();
		Thread.sleep(1000);
		driver.quit();
	}
	
	
	
}
