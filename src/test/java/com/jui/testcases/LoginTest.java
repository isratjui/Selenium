package com.jui.testcases;

import com.jui.base.TestBase;
import com.jui.utilities.TestUtil;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Hashtable;

public class LoginTest extends TestBase {

	@Test(dataProviderClass= TestUtil.class,dataProvider="dp")

	public void bankManagerLoginTest(Hashtable<String,String> data) throws InterruptedException, IOException{
		
		
		//verifyEquals("abc", "xyz");
		Thread.sleep(3000);
		log.debug("page loads");
		type("username_XPATH",data.get("email"));
		type("password_XPATH",data.get("password"));
		String s= data.get("password");
		System.out.println(s);


		click("bmlBtn_XPATH");

		//Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))),"Login not successful");

		log.debug("Login successfully executed");
		Thread.sleep(3000);
		//Assert.fail("Login not successful");
		
		
		
	
	
	}
	
}
