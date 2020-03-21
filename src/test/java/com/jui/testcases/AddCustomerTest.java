package com.jui.testcases;

import com.jui.base.TestBase;
import com.jui.utilities.TestUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.Hashtable;

public class AddCustomerTest extends TestBase {
	
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void addCustomerTest(Hashtable<String,String> data) throws InterruptedException{

	//	if(!data.get("runmode").equals("Y")){
			
	//		throw new SkipException("Skipping the test case as the Run mode for data set is NO");
	//	}
		//select("rides_XPATH",);
		JavascriptExecutor js = (JavascriptExecutor) driver;


        Thread.sleep(4000);
WebElement element= driver.findElement(By.xpath("/html/body/div/aside/div/nav/ul"));

		js.executeScript("document.getElementsByClassName('sidebar')[0].scrollBy(0, 1000)");
		System.out.println("scrolled");
		//click("addCustBtn_CSS");
		//type("firstname_CSS",data.get("firstname"));
		//type("lastname_XPATH",data.get("lastname"));
		//type("postcode_CSS",data.get("postcode"));
		//click("addbtn_CSS");
        click("book_XPATH");
        click("newride_XPATH");
        Thread.sleep(2000);
type("search_XPATH", data.get("Phone"));
click("details_XPATH");
select("vehicle_XPATH",data.get("vehicle"));
//type("pickup_XPATH",data.get("pickup"+Keys.ENTER));
        driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("jahangir tower" + Keys.ENTER);

//type("drop_XPATH", data.get("drop"+ Keys.ENTER));
        driver.findElement(By.xpath("//*[@id=\"drop_off_address\"]")).sendKeys("mirpur" + Keys.ENTER);
click("manual_XPATH");
click("distance_XPATH");
click("cash_XPATH");
click("bookride_XPATH");
		Thread.sleep(2000);
		//Alert alert = wait.until(ExpectedConditions.alertIsPresent());

	//	Assert.assertTrue(alert.getText().contains(data.get("alerttext")));
	//	alert.accept();
        System.out.println("done");
		Thread.sleep(4000);
		
	}
	
	

}
