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
public class Riderequest extends TestBase {

    @Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
    public void openAccountTest(Hashtable<String,String> data) throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;


        Thread.sleep(4000);
        WebElement element= driver.findElement(By.xpath("/html/body/div/aside/div/nav/ul"));

        js.executeScript("document.getElementsByClassName('sidebar')[0].scrollBy(0, 1000)");
        System.out.println("scrolled");

        click("promo_XPATH");
        Thread.sleep(2000);
        click("addpromo_XPATH");
        Thread.sleep(2000);
        click("promotype_XPATH");
        type("startdate_XPATH",data.get("start_date"));
        type("enddate_XPATH",data.get("end_date"));
        type("promocode_XPATH",data.get("promo_code"));
        type("description_XPATH",data.get("description"));
        type("validity_XPATH",data.get("validity"));
        type("noofcoupons_XPATH",data.get("No_coupons"));
        type("noofuser_XPATH",data.get("No_coupon_user"));
        Thread.sleep(2000);
        select("vehicletype_XPATH",data.get("vehicle_type"));
        select("discount_XPATH",data.get("Discount"));
        type("remarks_XPATH",data.get("remark"));
        Thread.sleep(2000);
        type("customerid_XPATH",data.get("customer_Id"));
        type("maxdiscount_XPATH",data.get("max_discount"));
        click("addpromocode_XPATH");
        Thread.sleep(10000);
        Thread.sleep(10000);

        //Alert alert = driver.switchTo().alert();
        //	String print = alert.getText();
        //System.out.println(print);
        String contentOfTerms = driver.findElement(By.xpath("//*[@id=\"ngdialog1\"]/div[2]/div")).getText();
        System.out.println(contentOfTerms);
        log.debug("1 promo added");
        driver.navigate().refresh();

        Thread.sleep(10000);
        Thread.sleep(10000);


//		if(!(TestUtil.isTestRunnable("openAccountTest", excel))){
//
//			throw new SkipException("Skipping the test "+"openAccountTest".toUpperCase()+ "as the Run mode is NO");
//		}
//

//		click("openaccount_CSS");
//		select("customer_CSS", data.get("customer"));
//		select("currency_CSS", data.get("currency"));
//		click("process_CSS");
//		Thread.sleep(2000);
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		alert.accept();


    }

}
